package code.tdd.example;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import code.tdd.example.BankAccount;


public class BankAccountTest {
	
	
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
		
	}
	
	@Test
	public void testDeposit() throws Exception {
		// 10000 원으로 계좌생성
		// 1000원 입금
		// 잔고조회결과 11000 일치여부 확인
		
	}
	@Test
	public void testWithdraw() throws Exception {
		// 10000 원으로 계좌생성
		// 1000원 출금
		// 잔고조회결과 9000 일치여부 확인
	} 

}
 