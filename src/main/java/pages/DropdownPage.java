package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {

    private WebDriver driver;
    private By dropdown = By.id("dropdown");

    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectDropdownList(String option){
        Select dropdownElement = new Select(driver.findElement(dropdown));
        dropdownElement.selectByVisibleText(option);
    }

    public List<String> getSelectedElement(){
        Select dropdownElement = new Select(driver.findElement(dropdown));
        List<WebElement> selectedElements = dropdownElement.getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }


}
