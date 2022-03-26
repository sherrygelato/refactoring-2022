package code.refactoring.complex_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	
	// public Connection getConnection() {
		
	// 	String url = "url";
	// 	String id = "id";
	// 	String pw = "password";
		
	// 	try {
	// 		Class.forName("com.mysql.jdbc.Driver");
	// 		return DriverManager.getConnection(url, id, pw);
	// 	} catch (Exception e) {
	// 		System.out.println(e.getMessage());
	// 		return null;
	// 	}
	// }
	
	// ???
	// ???? - QUery ? ??? ??? ?? ??? ?? ??
	// ???? ??? ??? ?? ?? ???? ??

	public void addUser(UserVO userVO) throws SQLException {

		JdbcUtil jdbcUtil = new JdbcUtil() {

			@Override
			public String createQuery() {
				String sql = "";
				return sql;
			}

			@Override
			public void setParameters(UserVO userVO, PreparedStatement preparedStatement) {
				
			}

		};

	// 	String sql = createQuery(); // ????
	// 	Connection conn = null;
	// 	PreparedStatement pstmt = null;
		
	// 	try {
	// 		conn = getConnection();
	// 		// ?? ???? ???? ??
	// 		pstmt = conn.prepareStatement(sql);

	// 		setParameters(userVO, pstmt); // ????
			
	// 		pstmt.executeUpdate();		
			
	// 	} finally {
	// 		if(pstmt != null) {
	// 			pstmt.close();
	// 		}
			
	// 		if(conn != null) {
	// 			conn.close();
	// 		}
	// 	}
	}

	private String createQuery() {
		String sql = "insert into USERS values(?,?,?,?)";
		return sql;
	}

	private void setParameters(UserVO userVO, PreparedStatement pstmt) throws SQLException {
		pstmt.setString(1, userVO.getUserId());
		pstmt.setString(2, userVO.getPassword());
		pstmt.setString(3, userVO.getName());
		pstmt.setString(3, userVO.getEmail());
	}

	public void removeUser(String userId) throws SQLException {
		String sql = "delete from USERS where userId = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			
			pstmt.executeUpdate();		
			
		} finally {
			if(pstmt != null) {
				pstmt.close();
			}
			
			if(conn != null) {
				conn.close();
			}
		}
	}

	public void updateUser(UserVO updateUserVO) throws SQLException {
		String sql = "update USERS set password = ?, name = ?, email = ? where userId = ?";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, updateUserVO.getPassword());
			pstmt.setString(2, updateUserVO.getName());
			pstmt.setString(3, updateUserVO.getEmail());
			pstmt.setString(4, updateUserVO.getUserId());
			
			pstmt.executeUpdate();		

		} finally {
			if(pstmt != null) {
				pstmt.close();
			}
			
			if(conn != null) {
				conn.close();
			}
		}
		
	}
	
	public UserVO findByUserId(String userId) throws SQLException {
		String sql = "select * from USERS where userId = ?";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			
			pstmt.executeQuery();		
			
			if (!rs.next()) return null;
			
			return new UserVO(rs.getString("userId"),
								rs.getString("password"),
								rs.getString("name"),
								rs.getString("email"));
		} finally {
			if (rs != null) rs.close();
			if (pstmt!= null) pstmt.close();
			if (conn != null) conn.close();
		}
	}

}
