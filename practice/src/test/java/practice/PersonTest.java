/**
 * 
 */
package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author jasminedaniels
 *
 */
public class PersonTest 
{
	@Test
	public void VerifyFirstName()
	{
		Person p = new Person("Rachel", "Smith", 30);
		Assert.assertEquals(p.getFirstName(), "Rachel");
		
		System.out.println("Test 1: Verify First Name");
	}
	
	@Test
	public void VerifyLastName()
	{
		Person p = new Person("Rachel", "Smith", 32);
		Assert.assertEquals(p.getLastName(), "Smith");
	}
}