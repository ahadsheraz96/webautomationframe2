package Page_Object_test;

import base.SampleBrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.HomePage;

public class HomePageTest extends SampleBrowserDriver {
    HomePage obj1=null;
    @BeforeMethod
    public void initElements(){
        obj1= PageFactory.initElements(driver,HomePage.class);
    }
    @Test
    public void searchTest(){
        obj1.search();

    }
}
