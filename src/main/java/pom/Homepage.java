package pom;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Homepage {
	
	 WebDriver driver;
	@FindBy(xpath="//a[text()='Lenskart Franchise']")
	private WebElement logo;
	@FindBy(xpath="//input[@id='-name']")
	private WebElement name;
	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	@FindBy(xpath="//input[@type='tel']")
	private WebElement tel;
	@FindBy(xpath="	//input[@id='-city']")
	private WebElement city;
	@FindBy(xpath="	(//input[@type='radio'])[3]")
	private WebElement radio;
	@FindBy(xpath="//button[@id='req_form']")
	private WebElement submit;
	
	
		
	public  Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public String openpage() {
	
		return logo.getText();
	}
	
	
	public void clickon_Lenskartfranchiese() {
		logo.click();
	}
	
	public void clickon_contactlenes(String abc,String def,String ghi,String jkl) throws InterruptedException {
			
			name.sendKeys(abc);
			email.sendKeys(def);
			tel.sendKeys(ghi);
			city.sendKeys(jkl);
			radio.click();
			submit.click();
			Thread.sleep(5000);
		
			name.clear();
			email.clear();
			tel.clear();
			city.clear();
			}
			
			
			
			
			
			
	}
	


