package code.refactoring.complex_4;

public abstract class JdbcUtil {

    public Connection getConnection() {
		
		String url = "url";
		String id = "id";
		String pw = "password";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

    public void addUser(UserVO userVO) throws SQLException {

		String sql = createQuery();
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = getConnection();
			// 계속 바뀌어서 변경되는 부분
			pstmt = conn.prepareStatement(sql);
			setParameters(userVO, pstmt);
			
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

    private abstract String createQuery();

	private abstract void setParameters(UserVO userVO, PreparedStatement pstmt) throws SQLException;
    
}
