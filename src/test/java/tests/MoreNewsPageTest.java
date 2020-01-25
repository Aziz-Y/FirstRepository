package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.MoreNewsPage;
import pages.TestBase;

public class MoreNewsPageTest extends TestHooker {

    TestBase base = new TestBase();
    MoreNewsPage moreNewsPage = new MoreNewsPage();

    @Test
    public void testPageMoreNews() throws InterruptedException{
        base.scrollToElement(moreNewsPage.getMoreNewsButton());
        base.clickOn(moreNewsPage.getMoreNewsButton());
        WebElement element = base.getElements(moreNewsPage.getArchive2015()).get(1);
        base.clickOn(element);
        Thread.sleep(3000);
        base.navigateBack();
        base.sendText(moreNewsPage.getSearchHole(), "2020");
        base.clickOn(moreNewsPage.getSearchIcon());
        base.scrollToElement(moreNewsPage.getOlderPosts());
        base.takeScreenShot();
        base.clickOn(moreNewsPage.getOlderPosts());
        base.takeScreenShot();
        base.navigateBack();
        base.scrollToElement(moreNewsPage.getYouTubeVideo());
        base.player(moreNewsPage.getYouTubeVideo());
        Thread.sleep(3000);
        base.player(moreNewsPage.getYouTubeVideo());
        Thread.sleep(3000);

    }
}
