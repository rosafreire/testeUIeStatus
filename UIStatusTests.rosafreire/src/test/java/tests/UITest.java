package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.SelectProduct;
import suport.Web;

public class UITest {
    private WebDriver driver;

    @Before
   public void SetUp(){
        //local testing
       driver = Web.createChrome();
       //cloudt testing
        //driver = Web.createBrowserStack();
    }

    @Test
    public void testOrderProced(){
        new SelectProduct(driver).clickProduct(driver)
                .clickAddToCart(driver).clickCheckout(driver)
                .viewItem("T-shirt, Color: White").viewPrice("30.00")
                .costumerInfo("Rosa Freire","rosa@freire.com")
                .selectPhoneOrdering().acceptTermsAndConditions();
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}
