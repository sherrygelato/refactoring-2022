package code.refactoring.methodarrange_6;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import code.refactoring.methodarrange_4.Distance;

public class AccountTest {
	Account account = new Account();
	
	@Test
	public void testGamma() {
		int retValue = account.gamma(10, 10, 2);
		assertTrue(retValue == 640);
	}

}
