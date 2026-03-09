package commonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.Assertion;



public class functionLibrary {
	public static WebDriver driver;
	public static Properties conpro;
	public static String expectedNum;
	public static String actualNum;
	
	//method for browser
	public static WebDriver startBsr(WebDriver driver) throws Throwable, IOException {
		conpro = new Properties();
		conpro.load(new FileInputStream("./propertyfile/Environment.properties"));
		if(conpro.getProperty("browser").equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		driver.manage().window().maximize();
		}
		else if (conpro.getProperty("browser").equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
		}
		else {
			try {
				throw new IllegalArgumentException("Browser is not matching");
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		return driver;
		
	}
	//method for Url
	public static void url() {
		driver.get(conpro.getProperty("url"));
	}
	
	//method for explicit wait
	public static void waitforElement(String Loc_Type, String Loc_Val, String Loc_Time)
	{
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(Loc_Time)));
		if(Loc_Type.equalsIgnoreCase("xpath")) {
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Loc_Val)));
		}
		if(Loc_Type.equalsIgnoreCase("id")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Loc_Val)));
		}
		if(Loc_Type.equalsIgnoreCase("name")) {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(Loc_Val)));
		}
	}
	
	//validate PageTitle
	public static void Page_Title(String Expected_title) {
		String Actual_title = driver.getTitle();
		try {
			org.testng.Assert.assertEquals(Actual_title, Expected_title,"Title not found");
		} catch (AssertionError e) {
			System.out.println(e.getMessage());
			
		}
	}
	
	//method for textbox fields
	public static void typeAction(String Loc_type, String Loc_Val, String testData) throws Throwable {
		if(Loc_type.equalsIgnoreCase("xpath")) {
			
			driver.findElement(By.xpath(Loc_Val)).clear();
			
			driver.findElement(By.xpath(Loc_Val)).sendKeys(testData);
		}
		if(Loc_type.equalsIgnoreCase("id")) {
			driver.findElement(By.id(Loc_Val)).clear();
			driver.findElement(By.id(Loc_Val)).sendKeys(testData);
		}
		if(Loc_type.equalsIgnoreCase("name")) {
			driver.findElement(By.name(Loc_Val)).clear();
			driver.findElement(By.name(Loc_Val)).sendKeys(testData);
		}
		
	}
	
	//method for click,links,radiobtns,imgs
	public static void clickAction(String Loc_type, String Loc_Val) {
		if(Loc_type.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(Loc_Val)).click();
		}
		if(Loc_type.equalsIgnoreCase("id")) {
			driver.findElement(By.id(Loc_Val)).sendKeys(Keys.ENTER);;
		}
		if(Loc_type.equalsIgnoreCase("name")) {
			driver.findElement(By.name(Loc_Val)).click();
		}
		
	}
	
	//method for supplierNumber
	public static void supplierNum(String Loc_type, String Loc_Val) {
		expectedNum = driver.findElement(By.name(Loc_Val)).getAttribute("value");
	}
	
	//method verify supplier num in table
	public static void supplierTable() throws Throwable {
		if(!driver.findElement(By.xpath(conpro.getProperty("searchtextbox"))).isDisplayed()){
			driver.findElement(By.xpath(conpro.getProperty("searchpanel"))).click();
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath(conpro.getProperty("searchtextbox"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(conpro.getProperty("searchtextbox"))).sendKeys(expectedNum);
		Thread.sleep(2000);
		driver.findElement(By.xpath(conpro.getProperty("Clicksearchbtn"))).click();
		Thread.sleep(2000);
		actualNum = driver.findElement(By.xpath("//table[@class='table ewTable']/tbody/tr[1]/td[6]/div/span/span")).getText();
		try {
			org.testng.Assert.assertEquals(actualNum, expectedNum,"Supplier num is not founded");
			
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	//method for closeBsr
	public static void closeBwsr() {
		driver.quit();
	}
	
	
	
	

}
