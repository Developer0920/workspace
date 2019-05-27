//package문
package java0523_jdbc;

//import문
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//클래스
class JdbcTest{
	
	//멤버변수인가?
	Connection conn;
	//connection은 인터페이스이므로 객체를 생성할 수 없다. 참조변수로 쓴 것인가?
	Statement stmt;
	ResultSet rs;
	//굳이 위에서 작성한 이유는 뭐지?
	
	//생성자
	public JdbcTest() {
			
	}
	
	//드라이버를 먼저 로딩해줘야 한다.
	//메소드
	void process() {
		try {
			//1. 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver"); 
			//java.lang.Class의 forName()메소드는 문자열 형태로 전달된 클래스를 JVM으로 로드해주는 기능을 갖고 있다.
			//Oracle JDBC 드라이버를 지정해 로드하여 DriverManager에 등록이 되도록 하는 코드이다.
			//오라클은 그냥 이렇게 하면 되는 거다.
			
			//2. 데이터베이스 연결
			String url="jdbc:oracle:thin://@127.0.0.1:1521:xe";
			//jdbc:oracle:thin:[hostname]:[port]:dbname //익스프레스 에디션의 dbname은 XE
			String username = "hr";
			String password = "a1234";			
			conn=DriverManager.getConnection(url, username, password);
			//getConnetion()메소드는 static선언이 돼 있으므로 DriverManager 객체를 생성하지 않고, 바로 호출할 수 있다.
			//getConnection()메소드는 Connection 인터페이스를 구현한 클래스의 객체를 반환한다.
			//'인터페이스를 이용한 다형성' 참조
						
			//3. 쿼리문을 실행하기 위한 Statement객체 얻기			
			stmt = conn.createStatement(); //쿼리문을 실행하기 위해서.
			//데이터베이스 연결에 사용한 conn객체를 통해, createStatement() 메소드를 호출해 Statement객체를 얻어올 수 있다.
			
			//4.쿼리문을 실행한다.
			//4.1.쿼리문을 실행하고 결과를 가져온다.
			String sql = "SELECT * FROM departments ORDER BY department_id";			
			rs = stmt.executeQuery(sql); //리턴타입이 resultSet임
			//Statement 객체를 사용해 SQL 표준 쿼리문을 자바 프로그램에서 사용할 수 있다.
			//Statement는 인터페이스인데 객체라고 할 수 있는 건가?
			//쿼리문을 실행시키는 메소드는 두 가지. executeQuery(), executeUpdate()
			
			//4.2. 가져온 결과에서 데이터를 분류해서 변수에 담는다.
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
			//객체 닫기
			if(rs!=null) { //현재 종료돼 있지 않으면
				try {
					rs.close(); //종료해라.
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
					conn.close();
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