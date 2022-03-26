package code.refactoring.methodsimple_4;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PriceTest {

	@Test
	public void testGetPrice() {
		Price replaceParamWithMethod = new Price(10, 50);
		double retPrice = replaceParamWithMethod.getPrice();
		assertTrue(retPrice == 25.0);
	}
}
