package org.amazon.testCases;

import org.amazon.base.ProjectSpecificMethods;
import org.amazon.pages.HomePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC0001_BuyaProduct extends ProjectSpecificMethods {
	@BeforeTest
	public void setData() {
		excelFileName = "BuyProduct";
	}
	
	@Test(dataProvider = "fetchData")
	public void BuyProduct(String product) throws InterruptedException {
	new HomePage().searchProduct(product)
	.findPrice().selectItem()
	.findDeliveryBy().addToCart()
	.addToCartConfirmation().proceedToBuy()
	.getTitle().clickContinue()
	.verifyError();
	}

}
