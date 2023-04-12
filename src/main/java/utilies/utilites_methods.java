package utilies;



import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utilites_methods {
	static WebDriver driver;
	
	
	
	
	public static void mouse_hoveraction(WebElement element) {
		Actions act= new Actions(driver);
		act.moveToElement(element).build().perform();
		
	}
	
	public static void waitforelement(WebElement element) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public static void AddToExcel(int x,int y,String shee,String abc) throws IOException {
		FileInputStream file=new FileInputStream("C:\\aniket\\newworkspace\\com.lenskart\\excelsheet\\price.xlsx");
		Workbook work=WorkbookFactory.create(file);
		Cell cell =work.getSheet(shee).createRow(x).createCell(y);
		//String abc=driver.getTitle();
		cell.setCellValue(abc);
		FileOutputStream file1=new FileOutputStream("C:\\aniket\\newworkspace\\com.lenskart\\excelsheet\\price.xlsx");
		work.write(file1);
		file1.close();
		
		
	}
	

}
