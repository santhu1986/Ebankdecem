package com.ebanking.master;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Exepom 
{
	WebDriver driver;
    @BeforeTest
	public void login() throws InterruptedException 
	{
	  
	   driver=new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.get("http://122.175.8.158/ranford2");
	   
	  RanfordHP RHP=PageFactory.initElements(driver,RanfordHP.class);
	  RHP.login();
	  
	}
    @Test(dataProvider="Rdata")
    public void Rcreation(String Rn,String Rt) throws InterruptedException
    
    {
	  //Role
	  
	  AdminHP AHP=PageFactory.initElements(driver,AdminHP.class);
	  AHP.Rol(); 
	  
	  //New Role
	  
	  Roledetails RD=PageFactory.initElements(driver,Roledetails.class);
	  RD.Nrol();
	   
	  //Rolecreation
	  
	  RoleCreation RC=PageFactory.initElements(driver,RoleCreation.class);
	  RC.Rcre(Rn,Rt);
	  
	  Thread.sleep(3000);
	  
	  driver.switchTo().alert().accept();
	  
	  Thread.sleep(3000);
	  
	  //Home
	  
	  RD.Hom();
	 
	  
	}
    
@DataProvider
	
	public Object [][] Rdata()
	{
		Object[][] Obj=new Object[3][2];

		Obj[0][0]="TellerRFBjan";
		Obj[0][1]="E";
		
		Obj[1][0]="managerRFBjan";
		Obj[1][1]="E";
		
		Obj[2][0]="ClerkRFBjan";
		Obj[2][1]="E";
		
		return Obj;
		
	}

}
