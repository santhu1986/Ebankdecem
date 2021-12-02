package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Roledetails 
{

	//EP
	
	@FindBy(id="btnRoles")
	WebElement Nrole;
	
	@FindBy(xpath=".//*[@id='Table_01']/tbody/tr/td[1]/a/img")
	WebElement Home;
	
	
	
	
	//Element Methods
	
	public void Nrol()
	{
		Nrole.click();
	}
	
	public void Hom() 
	{
	Home.click();
    }
	

}
