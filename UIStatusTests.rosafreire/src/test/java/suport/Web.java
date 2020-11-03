package suport;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;



public class Web {
    static final String USERNAME = "rosafreire1";
    public static final String AUTOMATE_KEY = "SZgmWhmG1FjypKEDaLKe";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

        public static WebDriver createChrome(){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Avell\\Desktop\\Automation\\chromedriver.exe" );
            WebDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.get("https://demo.cs-cart.com");
            return driver;

        }

        public static WebDriver createBrowserStack(){
            DesiredCapabilities caps = new DesiredCapabilities();

            caps.setCapability("os", "Windows");
            caps.setCapability("os_version", "10");
            caps.setCapability("browser", "Chrome");
            caps.setCapability("browser_version", "80");
            caps.setCapability("name", "rosafreire1's First Test");

                WebDriver driver = null;
                try {
                    driver = new RemoteWebDriver(new URL(URL), caps);
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    driver.get("https://demo.cs-cart.com");
                }catch(MalformedURLException e) {
                       System.out.println("Houveram problemas" + e.getMessage());
                }

                return driver;
        }

}
