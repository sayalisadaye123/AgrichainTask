package testclasses11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass{
	@Test 
	public void titleValidation() {
		String actualtitle = hp.getTitleOfPage();
		System.out.println(actualtitle);
		Assert.assertEquals(actualtitle, "AgriChain – The Future of Agricultureeeee");
	}

}
