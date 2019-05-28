package java0527_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import template.JdbcTemplate;

import static template.JdbcTemplate.*; //finally 쪽 참조

public class EmpDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private static EmpDAO dao = new EmpDAO();
	
	private EmpDAO() {
		
	}
	
	public static EmpDAO getInstance() {
		return dao;
	}
	
	public List<EmpDTO> rangeMethod(HashMap<String, Integer> map) {
		List<EmpDTO> aList = new ArrayList<EmpDTO>();
		
			try {
				conn = JdbcTemplate.getConnection();
				//여기서 connection 객체가 생성되는 건가?
				
				String sql = "SELECT b.* ";
				sql += "FROM(SELECT rownum as rm, a.* ";
				sql += "FROM(SELECT * FROM employees ";
				sql += "ORDER BY employee_id)a)b ";
				sql += "WHERE b.rm>=? and b.rm<=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, map.get("start"));
				pstmt.setInt(2, map.get("end"));
				rs = pstmt.executeQuery();
				while(rs.next()) {
					EmpDTO dto = new EmpDTO();
					dto.setEmployee_id(rs.getInt("employee_id"));
				}
			} catch (ClassNotFoundException | SQLException e) {				
				e.printStackTrace();
			} finally {
				/*JdbcTemplate.close(rs);
				JdbcTemplate.close(stmt);
				JdbcTemplate.close(conn);
				*/
				close(rs);
				close(stmt);
				close(conn);
			}					
			return aList;
	} //end rangeMethod()
	
	//메소드
	public List<EmpDTO> searchMethod(String word) {
		List<EmpDTO> aList = new ArrayList<EmpDTO>();
		
		try {
			conn = JdbcTemplate.getConnection();
			String sql = "SELECT * FROM employees ";
			sql += "WHERE upper(first_name) like ? ";
			sql += "ORDER BY employee_id";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  "%" + word.toUpperCase() + "%");
			rs = pstmt.executeQuery(); //이제 rs를 EmpDTO에 담아서 List에 넣는다. List<EmpDTO> 이기 때문에.
			
			while (rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEmployee_id(rs.getInt("employee_id"));
				dto.setFirst_name(rs.getString("First_name"));
				dto.setSalary(rs.getInt("Salary"));
				 dto.setHire_date(rs.getDate("hire_date"));
                 aList.add(dto);               }

		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
			JdbcTemplate.close(conn);
			
		}
		
		return aList;
		
		
	} //end searchMethod()
	
	
	//Java217관련
	public List<EmpDTO> comboxSearchMethod(HashMap<String, Object> map) {
		
		return null;
	} //end comboxSearchMethod() /////////////////
	
} //end class


