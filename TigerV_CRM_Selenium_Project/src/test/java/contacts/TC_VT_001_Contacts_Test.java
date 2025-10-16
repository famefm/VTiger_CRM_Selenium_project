package contacts;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.sf.GenericUtility.BaseClass;
import com.sf.GenericUtility.ListenerUtility;
import com.sf.ObjectRepository.Homepage;

@Listeners(ListenerUtility.class)
public class TC_VT_001_Contacts_Test extends BaseClass
{
	@Test
	public void clickOnContacts() {
		Homepage hp = new Homepage(driver);
		hp.getContacts().click();
		Assert.assertEquals(driver.getTitle().contains("Contacts"), true, "Contacts page is not displayed!!");
		test.log(Status.PASS, "Contacts page is displayed");
	}
	

}
