package contacts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.sf.GenericUtility.BaseClass;
import com.sf.GenericUtility.ListenerUtility;
import com.sf.ObjectRepository.CreateContact;
import com.sf.ObjectRepository.Homepage;
@Listeners(ListenerUtility.class)
public class TC_VT_002_CreateContacts_Test extends BaseClass
{
	
	@Test
	public void createContact() throws EncryptedDocumentException, IOException
	{
		Homepage hp=new Homepage(driver);
		hp.getContacts().click();
		
		CreateContact cr=new CreateContact(driver);
		cr.getAddContacts().click();
		String lastName = eutil.getDataFromExcel("CreateContact", 1, 0);
		cr.getLastnameElement().sendKeys(lastName);
		cr.getSave().click();
		
		String title = cr.getContactTitle().getText();
		
		Assert.assertEquals(title.contains(lastName), true, "Contact saving failed!!!");
		test.log(Status.PASS, "Contact is successfully added");
		
		
		
	}
	

}
