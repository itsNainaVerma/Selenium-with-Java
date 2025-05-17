package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage {
    private WebDriver driver;

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSliderValue(float value) {
        WebElement sliderBar = driver.findElement(By.tagName("input"));
        for (float i = 0; i < value; i += 0.5f){
            sliderBar.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public String getSliderValue(){
       return driver.findElement(By.id("range")).getText();
    }
}
