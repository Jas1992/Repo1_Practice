package practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void VerifyFirstName() 
	{
		Person p = new Person("Rachel", "Smith", 30);
		assertEquals(p.getFirstName(), "Rachel");
	}

}
