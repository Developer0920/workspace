package java0527_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * 1. ClassNotFoundException 
*  해결) JRE System Library에서 ojdbc6.jar파일 확인
 *      Class.forName(): 경로확인
 *      
 * 2. java.sql.SQLException: 
 *     IO예외 상황:  The Network Adapter...
 *                 Listener refused.....  
 *                 
 *     해결) 제어판->관리도구->서비스->OracleServiceXE,
 *            OracleXETNSListener을 다시 시작한다.
 *            
* java.sql.PreparedStatement (Statement말고도 이게 있음) 
 * 1 반복되는 쿼리문의 수행에 사용한다.
 * 2 미리 정의된 SQL문을 수행하기 때문에 Statement에 비해 속도가 빠르다.
 * 3 위치표시자(placeholder)(?)를 사용하여 쿼리문을 간략하게 작성한다.
 * 
 * 단순한 경우에는 statement를 쓰는 게 좋다. 순서별로 쭉 가져올 때는.
 */    

/*
 * 싱글톤 패턴
 *  : 하나의 객체만을 생성해서 사용할 수 있도록 설계한 구조이다.
 *  1 생성자의 접근제어자는 private
 *  2 객체자신을 생성을 한다.
 *  3 생성된 객체를 넘겨줄 수 있는 메소드를 정의한다.
 */






//DAO(Data Access Object) : 데이터 접근 객체
//insert등의 쿼리문 처리는 여기서 한다.
//싱글톤 패턴으로 객체 생성

public class DepartmentDAO {
	private Connection conn = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private static DepartmentDAO dao = new DepartmentDAO();
	
	private DepartmentDAO() {
		
	}
	
	public static DepartmentDAO getInstance() { //DepartmentDAO를 반환하는 메소드
		return dao;
	}
	//쿼리문을 실행할 때마다 connection 객체 값을 받아와야 한다. 반복되는 부분은 별도의 메소드로 만들어서 쓴다.
	
	
	//
	private Connection init() throws ClassNotFoundException, SQLException { //예외처리는 어차피 쿼리문 실행시 또 해야 하므로 여기서는 떠넘긴다.
		Class.forName("oracle.jdbc.OracleDriver");
		
		//서버연결
		String url = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
		String username = "hr";
		String password = "a1234";
		return DriverManager.getConnection(url, username, password);
					
		
	} //end init() //////////////////////////////////
	
	//연결종료
	private void exit() {		
		if(rs!=null)
			try {
				rs.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		if(stmt!=null)
			try {
				stmt.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		if(conn!=null)
			try {
				conn.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		
	}//end exit
	
	//
		public List<DepartmentDTO> listMethod() {
			List<DepartmentDTO> aList = new ArrayList<DepartmentDTO> ();
			
			try {
				conn = init(); //여기선 multi catch로 한 번에!
				stmt = conn.createStatement();//쿼리문을 실행해주는..executeQuery. 이건 statement 인터페이스에 있다??
				String sql = "select * from departments order by department_id";
				rs = stmt.executeQuery(sql); //select로 가져온 결과값은 rs가 받는다. 이걸 DTO에서 사용할 수 있도록 해야 한다.
				//근데, 이걸 바로 넘기면 안 된다. 결과값을 가져오면.. 연결을 끊어줘야 한다. 클라이언트가 접속을 하고 있다고 생각함. DB 과부화.
				while(rs.next()) {
					DepartmentDTO dto = new DepartmentDTO();
					dto.setDepartment_id(rs.getInt("department_id")); //여기 저장된 값이 int이므로 getInt를 씀.
					dto.setDepartment_name(rs.getString("department_name"));
					dto.setManager_id(rs.getInt("manager_id"));
					dto.setLocation_id(rs.getInt("location_id"));
					aList.add(dto);
				}
				
			} catch (ClassNotFoundException | SQLException e) {			
				e.printStackTrace();
			} finally {
				//rs.close(); //이렇게 끊어버리면 null값이 넘어간다. 따로 담아서 넘겨야 한다. 크기가 정해져 있지 않으므로 collection을 이용. arrayList를 이용해서 넘긴다.
				//각 레토드에 있는 걸 DTO에 담고, 이건 또 arrayList에 넘긴다.
				/*
				if (rs!=null) //null이 아니라는 건 연결이 돼 있단느 것.
					rs.close();
				if (stmt!=null)
					stmt.close();
				*/ // 하지만 반복된다. 따라서 exit()메소드에서 처리한다.
				exit();
			
			}
			return aList; //최종적으로 select해서 받아온 갓을 여기에 담아서 리턴해줘야.
		} //end listMethod()//////////////////////////////////////	
	
		
	public List<DepartmentDTO> searchMethod(String data){
		List<DepartmentDTO> aList = new ArrayList<DepartmentDTO>();
		try {
			conn = init();
		//	stmt = conn.createStatement(); //이 순서로 해야 한다.
		//	String sql = "SELECT * FROM departments WHERE lower(department_name) Like LOWER('%" +data+ "%')"; //위에 data 변수의 값을 받아와서 넣어줄 거다.
		//	//쿼리문에서 변수는 ""에서 빼줘야 한다. 위에처럼 해야 함.
		//	rs = stmt.executeQuery(sql);
			
			//prepared... 를 사용하는 방법
			String sql = "SELECT * FROM departments WHERE lower(department_name) Like LOWER(?)";
			// ?에 들어갈 값을.. 밑에서 처리
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + data + "%"); //첫번째 물음표에 들어갈 값..
			rs=pstmt.executeQuery();
			
			
			while(rs.next()) {//반드시 next를 해줘야만 커서가 이동해서 결과값을 가져올 수 있다. .. 커서를 이동시키고.. 그 다음에 읽어올 데이터가 있는지 판단해서 boolean을 반환
				DepartmentDTO dto = new DepartmentDTO(); //DepartmentDTO dt 를 while문 밖에 작성하면 안 된다.
				dto.setDepartment_id(rs.getInt("department_id")); 
				dto.setDepartment_name(rs.getString("department_name"));
				dto.setManager_id(rs.getInt("manager_id"));
				dto.setLocation_id(rs.getInt("location_id"));
				aList.add(dto);
			}
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
		return aList;
	}
	
} //end class
