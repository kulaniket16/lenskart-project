package testpkg;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pom.Homepage;
import pom.aqualens;

public class test_testclass {
	
	static WebDriver driver;
	Homepage HP;
	aqualens AQ;
	@BeforeClass
	public void browserinitialization() {
	driver=Base.browsersetup.getbrowser("chrome", "dev");
		
	}
	@BeforeMethod
	public void beforemethod() {
		HP= new Homepage(driver);
		AQ=new aqualens(driver);
	}
	
	@DataProvider(name="info")
	public String[][]datatotest(){
		
		
		String [][] data= {    {"auerii","nacepem163@mitigado.com","9827519983","pune"} , {"tyyhar","nacepem163@mitigedo.com","8411121615","mimbai"}  };
	
		return data;
		
	}
	
	@Test(priority=1)
	public void Verify_usercangotolenssection() throws InterruptedException {
		//String a=HP.openpage();
		//System.out.println(a);
		
		Assert.assertEquals("Lenskart Franchise", HP.openpage());
		//HP.clickon_Lenskartfranchiese();
	}
	
	@Test (priority=2)
	public void aqualenscheck() throws IOException {
		AQ.aqualenstt();
		AQ.data_takenfrom_website();
		AQ.selectionon_pricerange();
	}
	
	
	
	
	
	@Test (enabled=false,dataProvider="info")
	public void Checkthedifferent_data(String n,String e,String p, String c) throws InterruptedException {
		System.out.println(n);
		System.out.println(e);
		System.out.println(p);
		System.out.println(c);
		HP.clickon_contactlenes(n,e,p,c);
		
		
	}
	
		
		
		
	
	@AfterMethod
	public void aftermethod() {
		
	}
	@AfterClass
	public void afterclass() {
		
	}
	

}
