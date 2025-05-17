package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By dropdownLink = By.linkText("Dropdown");
    private By hoversLink = By.linkText("Hovers");
    private By keyPressesLink = By.linkText("Key Presses");
    private By horizontalSliderLink = By.linkText("Horizontal Slider");
    private By jsAlterLink = By.linkText("JavaScript Alerts");

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdown(){
        driver.findElement(dropdownLink).click();
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers(){
        driver.findElement(hoversLink).click();
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPresses(){
        driver.findElement(keyPressesLink).click();
        return new KeyPressesPage(driver);
    }

    public HorizontalSliderPage clickSlider(){
        driver.findElement(horizontalSliderLink).click();
        return new HorizontalSliderPage(driver);
    }

    public AlertsPage clickJavaScriptAlert(){
        driver.findElement(jsAlterLink).click();
        return new AlertsPage(driver);
    }
}
