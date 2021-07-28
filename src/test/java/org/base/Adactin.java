package org.base;

import org.locators.LoginPage;
import org.openqa.selenium.WebElement;

public class Adactin {
	
	public static void main(String[] args) {
		
				GlobalBase glo=new GlobalBase();
				glo.getdriver("chrome");
				glo.launchUrl("https://adactinhotelapp.com/");
				LoginPage page=new LoginPage();
				WebElement txtUserName = page.getTxtUserName();
				glo.typeText(txtUserName, "arjundhev");
				WebElement txtPassword = page.getTxtPassword();
				glo.typeText(txtPassword,"sathvikdhev");
				page.getBtnLogin();
				
				
	}

}
