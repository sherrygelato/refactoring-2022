package code.refactoring.complex_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	
	// 문제점 
	// 중복코드 - QUery 와 인자들 뺴고는 모든 내용이 중복이 발생됨
	// 변경이 되는 부분과 변경이 되지않는 부분으로 분리
	
	//  라이브러리 구현부분
	public void addUser(UserVO userVO) throws SQLException {
		// 6번 - JdbcCommon 에 생성한 메서드로 위임
		JdbcUtil jdbcCom = new JdbcUtil() {

//			@Override
			// 개발자 구현부분 -1번
			// 상속받은 메서드 생성후 이동
//			public String createQuery() {
//				return "insert into USERS values(?,?,?,?)";
//			}

			@Override
			// 개발자 구현부분-2번
			// 상속받은 메서드 생성후 이동
			// 11 - UserVO를   UserDAO -> JdbcCommon -> 익명클래스에서   JdbcCommon 부분을 생략함
			public void setParameters(PreparedStatement pstmt)
					throws SQLException {
				pstmt.setString(1, userVO.getUserId());
				pstmt.setString(2, userVO.getPassword());
				pstmt.setString(3, userVO.getName());
				pstmt.setString(3, userVO.getEmail());
			}			
		};
		
		// 12번 Query문을 CreateQuery() 가 아닌 직접 insert 문의 인수로 전달
		String sql = "insert into USERS values(?,?,?,?)";
		// 9번  this 인자 삭제
		jdbcCom.executeUpdate(sql);
	}

	public void removeUser(String userId) throws SQLException {
		
		// 13번 removeUser() 메서드 변경
		JdbcUtil jdbcCom = new JdbcUtil() {

			@Override
			public void setParameters(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, userId);
				
			}
		};

		String sql = "delete from USERS where userId = ?";
		jdbcCom.executeUpdate(sql);
	}

	public void updateUser(UserVO updateUserVO) throws SQLException {
		
		// 14번 updateUser() 메서드 변경
		JdbcUtil jdbcCom = new JdbcUtil() {

			@Override
			public void setParameters(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, updateUserVO.getPassword());
				pstmt.setString(2, updateUserVO.getName());
				pstmt.setString(3, updateUserVO.getEmail());
				pstmt.setString(4, updateUserVO.getUserId());				
			}
		};

		String sql = "update USERS set password = ?, name = ?, email = ? where userId = ?";
		jdbcCom.executeUpdate(sql);
		
	}
	
	//  1. 개발자 개발부분(변경부분) 과 라이브러리 부분 분리 - 메서드 추출
	//  4. 라이브러리를 사용하고 개발자 작성부분만 작성
	public UserVO findByUserId(String userId) throws SQLException {
		
		SelectJdbcUtil selectJdbc = new SelectJdbcUtil() {

			@Override
			public void setParameterSelect(PreparedStatement pstmt) throws SQLException {
				pstmt.setString(1, userId);
			}

			@Override
			public UserVO mapRow(ResultSet rs) throws SQLException {
				
				if (!rs.next()) 
					return null;
				
				return new UserVO(rs.getString("userId"),
									rs.getString("password"),
									rs.getString("name"),
									rs.getString("email"));
			}};
			
		String sql = "select * from USERS where userId = ?";
		return (UserVO)selectJdbc.executeQuery(sql);	
	}

}
