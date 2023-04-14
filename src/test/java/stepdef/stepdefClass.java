package stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepdefClass {
	
static WebDriver driver;
static String URL="https://www.alibaba.com/" ;
	@Given("^launch application  URL$")
	public void launch_application_URL() throws Throwable {
	   
 System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
 driver=new ChromeDriver();
 driver.get(URL);
 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
 
}


@Then("^type books in the search fieldve$")
public void type_books_in_the_search_fieldve() throws Throwable {
	WebElement search = driver.findElement(By.name("SearchText"));
  search.sendKeys("books");
  Thread.sleep(4000);
}

@Then("^Click search button$")
public void click_search_button() throws Throwable {

WebElement searchbtn = driver.findElement(By.xpath("//input[@data-spm-anchor-id='a2700.galleryofferlist.scGlobalHomeHeader.i0.1ff764a3Eg8hkU']"));
searchbtn.click();
Thread.sleep(4000);
}

@Then("^verify books  result page is displayed$")
public void verify_books_result_page_is_displayed() throws Throwable {
	boolean result= driver.findElement(By.xpath("//span[text()='All suppliers']")).isDisplayed();
	Assert.assertTrue(result);
	
	driver.quit();
    
}


	
	
	
	
	
	
}
