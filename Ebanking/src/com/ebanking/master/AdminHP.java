package com.ebanking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHP 
{

	//Element Properties
	
	@FindBy(xpath="//img[@src='images/Branches_but.jpg']")
	WebElement Branch;
	
	@FindBy(xpath="//img[@src='images/Roles_but.jpg']")
	WebElement Role;
	
	@FindBy(xpath="//img[@src='images/emp_btn.jpg']")
	WebElement Employee;
	
	@FindBy(xpath="//img[@src='images/admin_but_03.jpg']")
	WebElement Logout;
	
	
	//Element methods
	
	
	public void Br() 
	{
	Branch.click();	
	}
	
	public void Rol() 
	{
	Role.click();	
	}
}
