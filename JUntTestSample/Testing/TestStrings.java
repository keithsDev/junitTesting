package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStrings {

	@Test
	public void testStrings() {

		myClass test = new myClass();
		String res = test.addStrings("Hello", "world" );
		assertEquals("Helloworld", res);
				
	}

}
