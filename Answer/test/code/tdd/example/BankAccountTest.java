package code.tdd.example;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BankAccountTest {
	
	BankAccount bankAccount = null;
	
	
	@Before
	public void setUp() throws Exception {
		bankAccount = new BankAccount(10000);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetBalance_잔고조회() throws Exception {
		// 10000 원으로 계좌생성
		// 잔고조회결과 일치여부 확인
		//bankAccount = new BankAccount(10000);
		assertTrue("10000원으로 계좌생성후 잔고조회", bankAccount.getBalance()==10000);
		assertEquals("10000원으로 계좌생성후 잔고조회", 10000, bankAccount.getBalance());

	}
	
	@Test
	public void testDeposit() throws Exception {
		// 10000 원으로 계좌생성
		// 1000원 입금
		// 잔고조회결과 11000 일치여부 확인
		//bankAccount = new BankAccount(10000);
		bankAccount.deposit(1000);
		assertTrue("10000원으로 계좌생성후 1000원 추가 입금", bankAccount.getBalance()==11000);
		
	}
	@Test
	public void testWithdraw() throws Exception {
		// 10000 원으로 계좌생성
		// 1000원 출금
		// 잔고조회결과 9000 일치여부 확인
		//bankAccount = new BankAccount(10000);
		bankAccount.withdraw(1000);
		assertTrue("10000원으로 계좌생성후 1000원 출금", bankAccount.getBalance()==9000);
	} 

}
 