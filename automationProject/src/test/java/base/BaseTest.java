package base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.Welcome;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    private String url;
    protected static Logger log = LogManager.getLogger(BaseTest.class);
    protected Welcome welcomePage;


    @BeforeClass
    public void setUp() {
      System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
      url = "http://the-internet.herokuapp.com/";
      driver = new ChromeDriver();
      log.info("Page opened: " + url);
      driver.get(url);
      System.out.println(driver.getTitle());
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      welcomePage = new Welcome(driver);

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
        log.info("Browser closed");
    }





}
