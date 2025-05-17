package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pages.HomePage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

//      driver.manage().window().setSize(new Dimension(375,812));
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
