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
	public void testGetBalance_�ܰ���ȸ() throws Exception {
		// 10000 ������ ���»���
		// �ܰ���ȸ��� ��ġ���� Ȯ��
		//bankAccount = new BankAccount(10000);
		assertTrue("10000������ ���»����� �ܰ���ȸ", bankAccount.getBalance()==10000);
		assertEquals("10000������ ���»����� �ܰ���ȸ", 10000, bankAccount.getBalance());

	}
	
	@Test
	public void testDeposit() throws Exception {
		// 10000 ������ ���»���
		// 1000�� �Ա�
		// �ܰ���ȸ��� 11000 ��ġ���� Ȯ��
		//bankAccount = new BankAccount(10000);
		bankAccount.deposit(1000);
		assertTrue("10000������ ���»����� 1000�� �߰� �Ա�", bankAccount.getBalance()==11000);
		
	}
	@Test
	public void testWithdraw() throws Exception {
		// 10000 ������ ���»���
		// 1000�� ���
		// �ܰ���ȸ��� 9000 ��ġ���� Ȯ��
		//bankAccount = new BankAccount(10000);
		bankAccount.withdraw(1000);
		assertTrue("10000������ ���»����� 1000�� ���", bankAccount.getBalance()==9000);
	} 

}
 