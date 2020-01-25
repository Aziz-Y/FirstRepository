package tests;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.DocumentationPage;
import pages.TestBase;

public class DocumentationPageTest extends TestHooker {

    TestBase base = new TestBase();
    DocumentationPage documentationPage = new DocumentationPage();

    @Test
    public void testTitle() {
        String actual = base.getTitleOfThePage();
        String expected = "The Selenium Browser Automation Project :: Documentation for Selenium";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDocumentationPage() throws InterruptedException {
        base.scrollToElement(documentationPage.getDocumentationButton());
        base.clickOn(documentationPage.getDocumentationButton());
        base.clickOn(documentationPage.getJavaButton());
        base.clickOn(documentationPage.getPythonButton());
        base.clickOn(documentationPage.getcNumberButton());
        base.clickOn(documentationPage.getRubyButton());
        base.clickOn(documentationPage.getJavaScriptButton());
        base.clickOn(documentationPage.getKotlinButton());
    }

    @Test
    public void testSearchBox() throws InterruptedException {
        base.clickOn(documentationPage.getDocumentationButton());
        base.sendText(documentationPage.getSearchBox(), "wrtwbrt");
        Thread.sleep(3000);
        base.clickOn(documentationPage.getClearSearchBox());
    }

    @Test
    public void testRightLeft() throws InterruptedException {
        base.clickOn(documentationPage.getDocumentationButton());
        base.clickOn(documentationPage.getRightArrow());
        base.takeScreenShot();
        base.clickOn(documentationPage.getLeftArrow());
        Thread.sleep(3000);
        base.scrollToElement(documentationPage.getClearHistory());
        Thread.sleep(3000);
        base.clickOn(documentationPage.getClearHistory());
        Thread.sleep(3000);
    }

    @Test
    public void testSelectLanguage() throws InterruptedException {
        base.clickOn(documentationPage.getDocumentationButton());
        base.scrollToElement(documentationPage.getSelectLanguage());
        Thread.sleep(3000);
        base.clickOnSelectMenu(documentationPage.getSelectLanguage(), "Nederlands");
        Thread.sleep(3000);
    }

    @Test
    public void testBrowserStackPage() throws InterruptedException {
        base.clickOn(documentationPage.getBrowserStack());
        base.clickOn(documentationPage.getProductsMenu());
        Thread.sleep(3000);
        base.clickOn(documentationPage.getFreeTrail());
        Thread.sleep(3000);
    }

    @Test
    public void switchTest() throws InterruptedException{
        base.scrollToElement(documentationPage.getDocumentationButton());
        org.testng.Assert.assertTrue(base.checkDisplayed(documentationPage.getDocumentationButton()));
        base.clickOn(documentationPage.getDocumentationButton());
        base.clickOn(documentationPage.getRightArrow());
        base.clickOn(documentationPage.getEditThisPage());
        Thread.sleep(3000);
        base.windowHandles();
        base.sendText(documentationPage.getLoginField(), "someone");
        Thread.sleep(3000);
    }
}