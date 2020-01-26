package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class SampleBrowserDriver {
    public static WebDriver driver = null;
    public static String   os = System.getProperty("os", "windows");
    @Parameters({"url"})
    @BeforeMethod
    public void setUp(@Optional("https://www.google.com") String url){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahads\\IdeaProjects\\webautomation3\\generic\\src\\Driver\\chromedriver.exe" );
        driver = new ChromeDriver();

        driver.get(url);

    }
    @AfterMethod
    public void closeOut() {
        driver.quit();
    }
}
