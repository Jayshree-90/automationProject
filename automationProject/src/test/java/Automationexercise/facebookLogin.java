package Automationexercise;

import org.testng.annotations.Test;
import PracticeFb.FacebookRepo;
import PracticeFb.baseFb;
import junit.framework.Assert;

//@Listeners(listenerTest.class)
public class facebookLogin extends baseFb {
	
	@Test()
	public void fblogin()  {
	
	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		FacebookRepo fr = new FacebookRepo(driver);
		
		fr.getTxtEmail().sendKeys("8871413176");
		fr.getTxtpass().sendKeys("8871413176");
		fr.getBtnLgn().click();
		
		
		Assert.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
	}

}
