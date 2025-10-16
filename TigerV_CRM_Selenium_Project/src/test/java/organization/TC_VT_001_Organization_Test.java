package organization;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.sf.GenericUtility.BaseClass;
import com.sf.GenericUtility.ListenerUtility;
import com.sf.ObjectRepository.Homepage;

@Listeners(ListenerUtility.class)

public class TC_VT_001_Organization_Test extends BaseClass
{
	@Test
	public void clickOnOrganization()
	{
		Homepage hp=new Homepage(driver);
		hp.getOrganization().click();
		Assert.assertEquals(driver.getTitle().contains("Organizations "), true,"Organization title is not successful");
		test.log(Status.PASS, "Organization title is successful");
	}

}
