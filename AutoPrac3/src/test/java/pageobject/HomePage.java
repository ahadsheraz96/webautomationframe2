package pageobject;

import base.SampleBrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage  {
    @FindBy(how = How.ID, using = "search_query_top")
    WebElement searchBox;

    @FindBy(how = How.CLASS_NAME, using = "Product-count")
    WebElement productcount;


    public void search() {
        searchBox.sendKeys("women");
        searchBox.click();

    }
}