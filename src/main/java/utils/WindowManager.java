package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {

    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack(){
        navigate.back();
    }

    public void goForward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }

    public void goTo(String url){
        navigate.to(url);
    }

    public void switchToTab(String tabTitle){
        Set<String> windowHandles = driver.getWindowHandles();

        System.out.println("Number of tabs: " + windowHandles.size());

        System.out.println("Window handles:");
        windowHandles.forEach(System.out::println);

        for (String window : windowHandles){

            System.out.println("switching to window: " + window);
            driver.switchTo().window(window);

            System.out.println("current window title: " + driver.getTitle());

            if (tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }

}
