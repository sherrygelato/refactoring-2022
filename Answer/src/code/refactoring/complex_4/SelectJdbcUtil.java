package code.refactoring.complex_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class SelectJdbcUtil {
	
	//  1. 개발자 개발부분(변경부분) 과 라이브러리 부분 분리 - 메서드 추출
	//  2. SelectJdbcUtil 클래스 생성 후 공통부분 메서드 이동, 개발자 작성부분 추상메서드로 선언
	//	3. UserVO 에 독립적이도록 Object 리턴Type 변경
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
