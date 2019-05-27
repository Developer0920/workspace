package java0527_jdbc;

//jdbc template이용하는 방법

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import template.JdbcTemplate;

//
public class MemberDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	
	//싱글톤
	private MemberDAO() {}
	
	private static MemberDAO dao = new MemberDAO();	
		
	public static MemberDAO getInstance() {
	      return dao;
	   }
		
	//listMethod
	public List<MemDTO> listMethod() {
		List<MemDTO> aList = new ArrayList<MemDTO>();
		try {
			conn = JdbcTemplate.getConnection();
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
			JdbcTemplate.close(rs);
			JdbcTemplate.close(stmt);
			JdbcTemplate.close(conn);
		}
		return aList;
	} //end listMethod()
	
	
	public void insertMethod(MemDTO dto) {
		try {
			conn = JdbcTemplate.getConnection();
			String sql = "INSERT INTO mem VALUES(mem_num_seq.nextval,?,?,?)"; //순서대로 인덱스값이 1,2,3으로 붙음
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setInt(2, dto.getAge());
			pstmt.setString(3, dto.getLoc());			
			// int executeUpdate() : insert, update, delete
			pstmt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);
			JdbcTemplate.close(conn);
		}	
		
	}//end insertMethod()/////////////////
	
	
	//update를 하는 메소드
	//num이 1일때 값을 수정
	//hashmap에서 담아서 넘길 거다.
	public void updateMethod(HashMap<String, Object> map) {
		try {
			conn = JdbcTemplate.getConnection();
			String sql = "UPDATE mem SET name=? WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  (String)map.get("name")); //get의 리턴타임은 object
			pstmt.setInt(2,  (Integer)map.get("num"));
			pstmt.executeUpdate(); //얘를 실행하라. update쿼리문을 실행할 때는 이걸 꼭 해줘야 한다.
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);
			JdbcTemplate.close(conn);
		}
		
	} //end updateMethod() ///////////////////////////
	
	
	//delete를 하는 메소드
	public void deleteMethod(int num) {
		try {
			conn = JdbcTemplate.getConnection();
			String sql = "DELETE FROM mem WHERE num=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);
			JdbcTemplate.close(conn);
		}
	} //end deleteMethos()
	

} //end class
