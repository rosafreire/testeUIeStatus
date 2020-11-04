package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectProduct {

    private WebDriver driver;
    public SelectProduct(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage clickProduct(WebDriver driver){
        driver.findElement(By.id("det_img_23000278")).click();

        return new ProductPage(driver);
    }
}
