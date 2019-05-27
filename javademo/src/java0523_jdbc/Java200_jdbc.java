//package문
package java0523_jdbc;

//import문
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//클래스 선언
class JdbcTest{
	
	//멤버변수인가?
	Connection conn;
	//connection은 인터페이스이므로 객체를 생성할 수 없다. 참조변수로 쓴 것인가?
	Statement stmt;
	ResultSet rs;	
	
	//생성자
	public JdbcTest() {
			
	}
	
	//드라이버를 먼저 로딩해줘야 한다.
	//메소드
	void process() {
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver"); 
			//java.lang.Class의 forName()메소드는 문자열 형태로 전달된 클래스를 JVN으로 로드해주는 기능을 갖고 있다.
			//Orcla JDBC 드라이버를 지정해 로드하여 DriverManager에 등록이 되도록 하는 코드이다.
			//오라클은 그냥 이렇게 하면 되는 거다.
			
			//2. 서버연결
			String url="jdbc:oracle:thin://@127.0.0.1:1521:xe"; //IP주소(로컬의 기본 주소) //xe는 DB이름(교육용), enterprize는 orcl이다.
			String username = "hr";
			String password = "a1234";			
			conn=DriverManager.getConnection(url, username, password);
			//getConnetion()메소드는 static선언이 돼 있으므로 DriverManager 객체 생성없이, 바로 호출할 수 있다.
			//getconnection()메소드는 Connection 인터페이스를 반환한다.
			
			
			//3. 쿼리문을 실행하기 위한 Statement타입의 객체를 리턴			
			stmt = conn.createStatement(); //쿼리문을 실행하기 위해서.
			
			//select를 사용하려면..
			String sql = "SELECT * FROM departments ORDER BY department_id";
			
			//4.쿼리문을 실행한다.
			rs = stmt.executeQuery(sql); //리턴타입이 resultSet임		
			
			//화면에 뿌리기
			//최초에 커서가 테이블의 좌상 모서리에 위치함.
			while(rs.next()) {
				int departmentId=rs.getInt("department_id"); //컬럼 인덱스를 이용한 방법은 가독성이 떨어져서 안 쓴다.
				String dName = rs.getString("department_name");
				int mantId=rs.getInt("manager_id");
				int locId=rs.getInt("location_id");
				System.out.printf("%d %s %d %d\n", departmentId, dName, mantId, locId );
			}
			
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			if(rs!=null) { //현재 종료돼 있지 않으면
				try {
					rs.close();
				} catch (SQLException e) {
					
					e.printStackTrace();
				}
			}
			
			if (stmt!=null ) {
				try {
					stmt.close();
				} catch (SQLException e) {					
					e.printStackTrace();
				}
			}
			
			if(conn!=null ) {
				try {
					conn.close(); //이런 식으로 종료를 시켜줘야 한다.
				} catch (SQLException e) {					
					e.printStackTrace();
				}
			}
		}
	} //end process()
	
} //end class JdbcTest

//클래스
public class Java200_jdbc {
	//main()메소드
	public static void main(String[] args) {
		JdbcTest jt = new JdbcTest(); //JdbcTest 객체 생성
		jt.process(); //process()메소드 실행
		
		

	} //end main()
} //end class

//알 수 없는 에러는 무시해라. 내가 쓴 것만 확인해서 봐야 한다.