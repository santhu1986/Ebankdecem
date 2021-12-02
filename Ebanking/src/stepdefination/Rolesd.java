package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Rolesd 
{

	 WebDriver driver;
	 

@Given("^Tester should on Ranford Home Page$")
public void tester_should_on_Ranford_Home_Page() throws Throwable 
{
    driver=new FirefoxDriver();
    
    //Maximise
    
    driver.manage().window().maximize();
    
    //URL
    
    driver.get("http://122.175.8.158/ranford2");
    
 

}

@When("^Tester Enters Username and Password$")
public void tester_Enters_Username_and_Password() throws Throwable 
{
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
    driver.findElement(By.id("txtPword")).sendKeys("Te$ting@");
    driver.findElement(By.xpath("//input[contains(@name,'login')]")).click();

}

@Then("^Tester click on Role button$")
public void tester_click_on_Role_button() throws Throwable 
{
	Thread.sleep(3000);
	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
    
}

@When("^Tester Click on newRole button and enters \"([^\"]*)\" and \"([^\"]*)\"$")
public void tester_Click_on_newRole_button_and_enters_and(String RN, String RT) throws Throwable 
{
	driver.findElement(By.xpath(".//*[@id='btnRoles']")).click();
	driver.findElement(By.id("txtRname")).sendKeys(RN);
	driver.findElement(By.id("lstRtypeN")).click();
    driver.findElement(By.id("lstRtypeN")).sendKeys(RT);
  driver.findElement(By.xpath(".//*[@id='btninsert']")).click();
   Thread.sleep(4000);
driver.switchTo().alert().accept();
}

@Then("^Tester Close application$")
public void tester_Close_application() throws Throwable 
{
 driver.close();
}


}
