package pom;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilies.utilites_methods;

public class aqualens {
	WebDriver driver;
	@FindBy(xpath="//a[text()='CONTACT LENSES']")
	private WebElement contactlens;
	@FindBy(xpath="//button[text()='No thanks']")
	private WebElement nothanks;
	@FindBy(xpath="//a[text()='EYEGLASSES']")
	private WebElement item;
	@FindBy(xpath="(//div[@class='nav-level-4'])[138]")
	private WebElement aqualens2;
	@FindBy(xpath="(//span[@class='text-color-dark-blue fw700'])")
	private WebElement productprice;
	@FindBy(xpath="//span[text()='Rs. 0 - Rs. 499(125)']")
	private WebElement priceband;
	
	
	public aqualens(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void aqualenstt() {
		nothanks.click();
		contactlens.click();
		aqualens2.click();	
	}
	
	public void data_takenfrom_website() throws IOException {
	for(int i=1;i<12;i++) {
	String p=	driver.findElement(By.xpath("(//span[@class='text-color-dark-blue fw700'])["+i+"]")).getText().replace("₹", "");
	System.out.println(p);
	utilies.utilites_methods.AddToExcel(i, 0, "Sheet1", p );	
	}}
	
	public void selectionon_pricerange() throws IOException {
		priceband.click();
		
		for(int a=1;a<12;a++) {
			String t=	driver.findElement(By.xpath("(//span[@class='text-color-dark-blue fw700'])["+a+"]")).getText().replace("₹", "");
			System.out.println(t);
			utilies.utilites_methods.AddToExcel(a, 1, "Sheet2", t );	
			}
	

	
		
	
		
	}

}
