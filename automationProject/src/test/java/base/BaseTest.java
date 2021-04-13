package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    private String url;

    @BeforeClass
    public void setUp() {
      System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
      url = "http://the-internet.herokuapp.com/";
      driver = new ChromeDriver();
      driver.get(url);
      System.out.println(driver.getTitle());
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }





}
