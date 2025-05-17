package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By dropdownLink = By.linkText("Dropdown");
    private By hoversLink = By.linkText("Hovers");

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

}
