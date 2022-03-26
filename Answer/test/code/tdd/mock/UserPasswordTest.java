package code.tdd.mock;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserPasswordTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSavePassword() throws Exception {
		UserPassword register = new UserPassword();
		MD5Cipher mdCipher = new MockMD5Cipher();
		
		String userId = "user01";
		String password = "!user01";
		
		// password 저장
		// 저장된 password 조회 후 복호화
		// 저장된 password 일치여부 비교
		register.savePassword(userId, mdCipher.encrypt(password));
		String decryptedPassword = mdCipher.decrypt(register.getPassword(userId));
		assertEquals(password, decryptedPassword);

	}

}
