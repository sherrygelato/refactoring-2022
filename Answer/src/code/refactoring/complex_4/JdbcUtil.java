package code.refactoring.complex_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// ���α׷� �� ����κ� (���̺귯�� �����κ�)�� �������� ����Ǵ� �κ� (����Ͻ� �����κ�)�� �и��ϴ� �ǻ��  - Template Method
public abstract class JdbcUtil {
	
	//  4�� getConnection() �̵�

	
	// 3�� - UserDAO �� �޼��� ����
	// 5�� - createQuery(), setParameters() �����Ͽ��� ����
	// ������ - userDAO �� ���ӵǾ� ������ �����  --> userDAO�� ��� �޼��带 ��ü�ؾ��� �߻�Ŭ����, �޼��� ���
	// ������ - userVO�� ����, setParameters �Ҷ� ����
	// 10�� - userVO �� �μ����� �����ϰ� userDAO ���� �͸�Ŭ������ ���� �����ϵ��� ����
	// 15�� - �޼���� ����  insert --> executeUpdate
	
	public void executeUpdate(String sql) throws SQLException {
		//String sql = createQuery();
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = ConnectionManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			setParameters(pstmt);
			
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
	// 7�� - �߻�޼��� ����
	//public abstract String createQuery();
	public abstract void setParameters(PreparedStatement pstmt) throws SQLException;
}
