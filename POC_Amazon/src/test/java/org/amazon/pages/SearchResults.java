package org.amazon.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.amazon.base.ProjectSpecificMethods;

public class SearchResults extends ProjectSpecificMethods {
	public SearchResults findPrice() {
		System.out.println("price of 1st item: " + driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText());
		return this;
	}

	public ProductPage selectItem() {
		driver.findElementByClassName("s-image").click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> handleslist = new ArrayList<String>();
		handleslist.addAll(windowHandles);
		driver.switchTo().window(handleslist.get(1));
		return new ProductPage();
	}

}
