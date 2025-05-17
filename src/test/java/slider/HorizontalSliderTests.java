package slider;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

import static org.testng.Assert.*;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void testSlider(){
       HorizontalSliderPage horizontalSliderPage = homePage.clickSlider();
       horizontalSliderPage.setSliderValue(2.5f);
       assertEquals(horizontalSliderPage.getSliderValue(),"2.5","Slider value is incorrect");
    }
}
