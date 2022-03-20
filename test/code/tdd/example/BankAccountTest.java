package code.tdd.example;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import code.tdd.example.BankAccount;


public class BankAccountTest {
	BankAccount bankAccount = null;
	
	
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetBalance() throws Exception {
		// 10000 원으로 계좌생성 
		// 잔고조회결과 일치여부 확인 
		bankAccount = new BankAccount(10000);
		bankAccount.getBalance();
		assertEquals("계좌생성 후 잔고조회", 10000, bankAccount.getBalance());
		
	}
	
	@Test
	public void testDeposit() throws Exception {
		// 10000 원으로 계좌생성 
		// 1000�� 입금 
		// 잔고조회결과 11000 일치여부 확인 
		bankAccount = new BankAccount(10000);
		bankAccount.deposit(1000);
		assertEquals("계좌생성 후 1000원 추가 입금", 11000, bankAccount.getBalance());
		
		
	}
	@Test
	public void testWithdraw() throws Exception {
		// 10000 원으로 계좌생성 
		// 1000�� 출금 
		// �ܰ���ȸ��� 9000 ��ġ���� Ȯ��
		bankAccount = new BankAccount(10000);
		bankAccount.withdraw(1000);
		assertEquals("계좌생성 후 1000원 추가 출금", 9000, bankAccount.getBalance());
	} 

}