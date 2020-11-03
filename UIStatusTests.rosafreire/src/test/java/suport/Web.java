package suport;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


    public class Web {
        public static WebDriver createChrome(){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Avell\\Desktop\\Automation\\chromedriver.exe" );
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get("https://demo.cs-cart.com");
            return driver;

        }

}
