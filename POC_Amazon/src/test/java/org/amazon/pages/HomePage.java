package org.amazon.pages;

import org.amazon.base.ProjectSpecificMethods;
import org.openqa.selenium.Keys;

public class HomePage extends ProjectSpecificMethods{
	
public SearchResults searchProduct(String data) {
	driver.findElementById("twotabsearchtextbox").sendKeys(data,Keys.ENTER);
	return new SearchResults();
}
}
