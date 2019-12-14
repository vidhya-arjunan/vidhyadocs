package org.amazon.pages;

import org.amazon.base.ProjectSpecificMethods;

public class SignInPage extends ProjectSpecificMethods {
	public SignInPage getTitle() {
	String title = driver.getTitle();
	System.out.println(title);
	return this;
	}
	
	public SignInPage clickContinue() {
	driver.findElementById("continue").click();
	return this;
	}
	
	public SignInPage verifyError() throws InterruptedException {
	Thread.sleep(2000);
	String error = driver.findElementByXPath("(//div[@class='a-alert-content'])[2]").getText();
	System.out.println(error);
	return this;
	}
}
