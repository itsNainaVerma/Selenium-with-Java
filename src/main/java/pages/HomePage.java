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
    private By fileUploadLink = By.linkText("File Upload");
    private By contextMenuLink = By.linkText("Context Menu");
    private By editorLink = By.linkText("WYSIWYG Editor");
    private By framesLink = By.linkText("Frames");
    private By dynamicLoading = By.linkText("Dynamic Loading");
    private By largeAndDeepDomLink = By.linkText("Large & Deep DOM");
    private By infiniteScrollLink = By.linkText("Infinite Scroll");
    private By multipleWindowLink = By.linkText("Multiple Windows");

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

    public FileUploadPage clickFileUpload(){
        driver.findElement(fileUploadLink).click();
        return new FileUploadPage(driver);
    }

    public ContextMenuPage clickContextMenu(){
        driver.findElement(contextMenuLink).click();
        return new ContextMenuPage(driver);
    }

    public WysiwygEditorPage clickWysiwygEditor(){
        driver.findElement(editorLink).click();
        return new WysiwygEditorPage(driver);
    }

    public FramesPage clickFrames(){
        driver.findElement(framesLink).click();
        return new FramesPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoading(){
        driver.findElement(dynamicLoading).click();
        return new DynamicLoadingPage(driver);
    }

    public LargeAndDeepDomPage clickLargeAndDeepDom(){
        driver.findElement(largeAndDeepDomLink).click();
        return new LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll(){
        driver.findElement(infiniteScrollLink).click();
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindows(){
        driver.findElement(multipleWindowLink).click();
        return new MultipleWindowsPage(driver);
    }
}
