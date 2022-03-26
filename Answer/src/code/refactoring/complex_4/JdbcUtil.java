package code.refactoring.complex_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// 프로그램 내 공통부분 (라이브러리 구현부분)과 업무별로 변경되는 부분 (비즈니스 구현부분)을 분리하는 실사례  - Template Method
public abstract class JdbcUtil {
	
	//  4번 getConnection() 이동

	
	// 3번 - UserDAO 의 메서드 복사
	// 5번 - createQuery(), setParameters() 컴파일오류 수정
	// 문제점 - userDAO 에 종속되어 재사용이 어려움  --> userDAO의 사용 메서드를 대체해야함 추상클래스, 메서드 사용
	// 문제점 - userVO에 종속, setParameters 할때 사용됨
	// 10번 - userVO 를 인수에서 제거하고 userDAO 에서 익명클래스로 직접 전달하도록 구성
	// 15번 - 메서드명 변경  insert --> executeUpdate
	
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
	// 7번 - 추상메서드 생성
	//public abstract String createQuery();
	public abstract void setParameters(PreparedStatement pstmt) throws SQLException;
}
