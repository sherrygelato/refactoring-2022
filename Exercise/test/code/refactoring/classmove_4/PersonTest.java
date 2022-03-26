package code.refactoring.classmove_4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetManager() {
		Person John = new Person();
		// 진단 : 컴포넌트의 모듈화(캡슐화)가 깨졌다..
		// 클래스 간 내부 책임 있기에 직접 참조 ㄴㄴ 
		// 클래스 역할 분담 잘 해야함
		assertTrue(John.getManager().equals("111"));
	}
}
