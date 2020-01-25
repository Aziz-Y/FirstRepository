package tests;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TestBase;

import java.util.List;

public class HomePageTest extends TestHooker{

    TestBase base = new TestBase();
    HomePage homePage = new HomePage();

    @Test
    public void testTitle() {
        String actual = base.getTitleOfThePage();
        String expected = "SeleniumHQ Browser Automation";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testDownloadButtonCount(){
        base.scrollToElement(homePage.getDownloadsButtons());
        base.takeScreenShot();
        List<WebElement> elements = base.getElements(homePage.getDownloadsButtons());
        int actual = elements.size();
        Assert.assertEquals(3, actual);
    }

    @Test
    public void testButtonMoreNews(){
        base.clickOn(homePage.getMoreNews());
        base.navigateBack();
        base.sendText(homePage.getSearchHole(),"ide");


    }
}
