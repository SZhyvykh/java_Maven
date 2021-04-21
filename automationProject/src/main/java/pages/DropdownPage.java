package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.sound.midi.Soundbank;
import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage extends BasePageObject {
    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void selectFromDropdown(String option) {
    log.info("Selecting second option");
    findDropdownElements(dropdown).selectByVisibleText("Option 2");
    }

    public void getSelectedOptions() {
        List<WebElement> dropdownList = findDropdownElements(dropdown).getOptions();
        for (int i = 0; i < dropdownList.size(); i++) {
            String dropdownValues = dropdownList.get(i).getText();
            System.out.println("Dropdown values are " + dropdownValues);
        }
    }




}
