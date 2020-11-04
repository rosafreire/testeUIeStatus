package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
    private WebDriver driver;

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }

    public  CartPage clickCheckout(WebDriver driver) {
        driver.findElement(By.linkText("CHECKOUT")).click();

        return new CartPage(driver);
    }

}
