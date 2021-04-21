package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.Console;
import java.util.List;

public class BasePageObject {
    protected WebDriver driver;
    protected static Logger log = LogManager.getLogger(BasePageObject.class);

    public BasePageObject(WebDriver driver, Logger log) {
        this.driver = driver;
        this.log = log;
    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);

    }

    protected List<WebElement> findAll (By locator) {
        return driver.findElements(locator);
    }

    protected void click(By locator) {
        find(locator).click();
    }

    protected Select findDropdownElements(By locator) {
        return new Select(find(locator));
    }

    public String getElementAttribute(By locator, AttributeTypes attributeTypes){
        String attributeValue;
        var elemenet = driver.findElement(locator);
        switch (attributeTypes) {
            case Id:
                attributeValue = elemenet.getAttribute("id");
                break;
            case Name:
                attributeValue = elemenet.getAttribute("name");
                break;
            case Class:
                attributeValue = elemenet.getAttribute("class");
                break;
            case Checked:
                attributeValue = elemenet.getAttribute("checked");
                break;
            case Selected:
                attributeValue = elemenet.getAttribute("selected");
                break;
            case Text:
                attributeValue = elemenet.getText();
                break;
            default:
                attributeValue = elemenet.getText();
                break;
        }
        return attributeValue;
    }

    public void updateCheckbox(By locator, boolean check){
        var element = driver.findElement(locator);
        var value = element.getAttribute("checked");

        if (value == null) value = "false";

        if (check)
        {
            if (value.equals("false"))
            {
                element.click();
            }
        }
        else
        {
            if (value.equals("true"))
            {
                element.click();
            }
        }
    }

    public enum AttributeTypes{
        Name, Class, Checked, Selected, Id, Text
    }

}


