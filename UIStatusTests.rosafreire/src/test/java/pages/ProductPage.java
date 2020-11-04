package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public CheckOutPage clickAddToCart(WebDriver driver){
        driver.findElement(By.id("button_cart_278")).click();

        return new CheckOutPage(driver);
    }
}
