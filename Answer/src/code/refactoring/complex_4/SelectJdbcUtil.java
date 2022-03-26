package code.refactoring.complex_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class SelectJdbcUtil {
	
	//  1. ������ ���ߺκ�(����κ�) �� ���̺귯�� �κ� �и� - �޼��� ����
	//  2. SelectJdbcUtil Ŭ���� ���� �� ����κ� �޼��� �̵�, ������ �ۼ��κ� �߻�޼���� ����
	//	3. UserVO �� �������̵��� Object ����Type ����
	public Object executeQuery(String sql) throws SQLException {
				
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = ConnectionManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			setParameterSelect(pstmt);
			
			pstmt.executeQuery();		
			
			return mapRow(rs);
		} finally {
			if (rs != null) rs.close();
			if (pstmt!= null) pstmt.close();
			if (conn != null) conn.close();
		}
	}
	
	public abstract void setParameterSelect(PreparedStatement pstmt) throws SQLException;
	public abstract Object mapRow(ResultSet rs) throws SQLException;

}
