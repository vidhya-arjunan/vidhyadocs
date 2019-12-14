package org.amazon.pages;

import org.amazon.base.ProjectSpecificMethods;

public class ShoppingCartPage extends ProjectSpecificMethods{
	
	public ShoppingCartPage addToCartConfirmation() {
	String confirmation = driver.findElementByXPath("//div[@id='huc-v2-confirm-text-container']").getText();
	System.out.println(confirmation);
	return this;
}
	
	public SignInPage proceedToBuy()
	{
		driver.findElementByPartialLinkText("Proceed to Buy").click();
		return new SignInPage();
	}
}