package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class FileUploadPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private By inputField = By.id("file-upload");
    private By uplaodButton = By.id("file-submit");
    private By uploadedFile = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickUploadButton(){
        driver.findElement(uplaodButton).click();
    }

    /**
     * Provides path of file to the form then clicks Upload button
     * @param absolutePathOfFile The complete path of the file to upload
     */
    public void uploadFile(String absolutePathOfFile){
        driver.findElement(inputField).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    public String getUploadedFiles(){
        wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(uploadedFile));
        return driver.findElement(uploadedFile).getText();
    }
}
