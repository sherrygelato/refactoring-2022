package code.refactoring.complex_4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	
	// ������ 
	// �ߺ��ڵ� - QUery �� ���ڵ� ����� ��� ������ �ߺ��� �߻���
	// ������ �Ǵ� �κа� ������ �����ʴ� �κ����� �и�
	
	//  ���̺귯�� �����κ�
	public void addUser(UserVO userVO) throws SQLException {
		// 6�� - JdbcCommon �� ������ �޼���� ����
		JdbcUtil jdbcCom = new JdbcUtil() {

//			@Override
			// ������ �����κ� -1��
			// ��ӹ��� �޼��� ������ �̵�
//			public String createQuery() {
//				return "insert into USERS values(?,?,?,?)";
//			}

			@Override
			// ������ �����κ�-2��
			// ��ӹ��� �޼��� ������ �̵�
			// 11 - UserVO��   UserDAO -> JdbcCommon -> �͸�Ŭ��������   JdbcCommon �κ��� ������
			public void setParameters(PreparedStatement pstmt)
					throws SQLException {
				pstmt.setString(1, userVO.getUserId());
				pstmt.setString(2, userVO.getPassword());
				pstmt.setString(3, userVO.getName());
				pstmt.setString(3, userVO.getEmail());
			}			
		};
		
		// 12�� Query���� CreateQuery() �� �ƴ� ���� insert ���� �μ��� ����
		String sql = "insert into USERS values(?,?,?,?)";
		// 9��  this ���� ����
		jdbcCom.executeUpdate(sql);
	}

	public void removeUser(String userId) throws SQLException {
		
		// 13�� removeUser() �޼��� ����
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
		
		// 14�� updateUser() �޼��� ����
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
	
	//  1. ������ ���ߺκ�(����κ�) �� ���̺귯�� �κ� �и� - �޼��� ����
	//  4. ���̺귯���� ����ϰ� ������ �ۼ��κи� �ۼ�
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
