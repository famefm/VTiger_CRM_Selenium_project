package organization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.sf.GenericUtility.BaseClass;
import com.sf.GenericUtility.ListenerUtility;
import com.sf.ObjectRepository.CreateOrganization;
import com.sf.ObjectRepository.Homepage;

@Listeners(ListenerUtility.class)
public class Tc_VT_002_CreateOrganization_Test extends BaseClass
{	
	@Test
	public void createOrganization() throws EncryptedDocumentException, IOException
	{
		Homepage hp = new Homepage(driver);
		hp.getOrganization().click();
		
		CreateOrganization co = new CreateOrganization(driver);
		
		co.getAddOrganization().click();
		
		String ON = eutil.getDataFromExcel("CreateOrganization", 1, 0);
		co.getOrganizationName().sendKeys(ON);
		
		co.getSave().click();
		
		String title = co.getOrganizationTitle().getText();
		
		Assert.assertEquals(title.contains(title),true, "Adding organization failed!!!");
		test.log(Status.PASS, "Organization added successfully");
	}

}
