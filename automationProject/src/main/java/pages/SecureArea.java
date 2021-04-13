package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureArea {
    private WebDriver driver;
    private By stringText = By.xpath("//div[@id='flash']");

    public SecureArea(WebDriver driver) {
        this.driver = driver;
    }

    public String getSuccessLoginText(){
      return driver.findElement(stringText).getText();
    }

}
