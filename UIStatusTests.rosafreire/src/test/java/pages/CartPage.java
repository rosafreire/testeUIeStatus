package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public CartPage viewItem(String expectedItem) {
        String actualItem = driver.findElement(By.xpath("//a[contains(text(),'T-shirt, Color: White')]")).getText();
        Assert.assertEquals(actualItem, expectedItem);
        Assert.assertTrue(actualItem.contains("T-shirt, Color: White"));

        System.out.println(actualItem);

        return this;

    }

    public CartPage viewPrice (String expectedPrice){
        String actualPrice = driver.findElement(By.xpath("//body/div[@id='tygh_container']/div[@id='tygh_main_container']/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[2]/bdi[1]/span[1]")).getText();
        Assert.assertEquals(actualPrice, expectedPrice);
        Assert.assertTrue(actualPrice.contains("30.00"));

        System.out.println(actualPrice);

        return this;
    }

    public CartPage costumerInfo(String myName, String myEmail){
        driver.findElement(By.xpath("//input[@id='litecheckout_s_address']")).sendKeys(myName);
        driver.findElement(By.xpath(" //input[@id='litecheckout_email']")).sendKeys(myEmail);

        return this;
    }

    public CartPage selectPhoneOrdering (){
        driver.findElement(By.xpath("//label[@id='payments_2']")).click();

        return this;
    }

    public CartPage acceptTermsAndConditions(){
        try {driver.findElement(By.xpath("//*[@id=\"id_accept_terms5fa02a33106a0\"]")).click();

        }catch(Exception e){
            System.out.println("Element not found");
        }

        System.out.println("continue testing...");
        return this;
    }

    public CartPage placeOrder(){
        driver.findElement(By.xpath("//div[@id='litecheckout_final_section']")).click();

        return this;
    }

}
