package java0527_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemDAO {

   private Connection conn = null;
   private Statement stmt = null;
   private PreparedStatement pstmt = null;
   private ResultSet rs = null;
   
   private MemDAO() {
      
   }
   private static MemDAO dao = new MemDAO();
   
   public static MemDAO getInstance() {
      return dao;
   }
   
   private Connection init() throws ClassNotFoundException, SQLException {
      Class.forName("oracle.jdbc.OracleDriver");
      String url = "jdbc:oracle:thin://@127.0.0.1:1521:xe";
      String username = "hr";
      String password = "a1234";
      
      return DriverManager.getConnection(url, username, password);
   }//end init()
   
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
   }//end exit()
   
   
   public List<MemDTO> listMethod(){
      List<MemDTO> aList = new ArrayList<MemDTO>();
      
      try {
         conn = init();
         stmt = conn.createStatement();
         String sql = "select * from mem order by num";
         rs = stmt.executeQuery(sql);
         while(rs.next()) {
            MemDTO dto = new MemDTO();
            dto.setNum(rs.getInt("num"));
            dto.setName(rs.getString("name"));
            dto.setAge(rs.getInt("age"));
            dto.setLoc(rs.getString("loc"));
            aList.add(dto);
         }
      } catch (ClassNotFoundException | SQLException e) {
         e.printStackTrace();
      } finally {
         exit();
      }
      
      
      return aList;
   }//end listmethod()
   
	
	//
	public int insertMethod(MemDTO dto) {
		int cnt=-1; //임의의 값을 넣어준 것 //1이상의 값으로 잡으면 안 됨.
		try {
			conn = init();
			String sql = "INSERT INTO mem VALUES(mem_num_seq.nextval,?,?,?)"; //순서대로 인덱스값이 1,2,3으로 붙음
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getAge());
			pstmt.setString(3, dto.getLoc());			
			cnt=pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		} finally {
			exit();
		}
		return cnt;
	} //end insertMethod() //////////////
		
} //end class
