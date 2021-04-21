package dropdown;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropdownTest extends BaseTest {

    @Test
    public void testDropdownSelection() {
        log.info("Start testDropdownSelection test");

       var dropdown = welcomePage.clickDropdownLink();
       dropdown.getSelectedOptions();
       dropdown.selectFromDropdown("Option 2");
      // Assert.assertTrue(dropdown.isOptionSelected("Option 2"),"Option is not selected");

    }

}
