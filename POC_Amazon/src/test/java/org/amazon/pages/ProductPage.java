package org.amazon.pages;

import org.amazon.base.ProjectSpecificMethods;

public class ProductPage extends ProjectSpecificMethods {
	public ProductPage findDeliveryBy(){
		String text = driver.findElementByXPath("//div[@id='ddmDeliveryMessage']").getText();
		System.out.println(text);
		return this;	
		}

	public ShoppingCartPage addToCart() {
		driver.findElementById("add-to-cart-button").click();
	    return new ShoppingCartPage();
	}


}
