package pages;

import com.google.common.base.Function;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestBase {
    //Here we put all of our re-usable methods

    public WebElement getElement(By element) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 30);
        WebElement ele = wait.until(ExpectedConditions.visibilityOf(DriverManager.getDriver().findElement(element)));
        ((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].style.border='3px solid red'", ele);
        return ele;
    }

    public WebElement getElementClick(By element) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 30);
        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(DriverManager.getDriver().findElement(element)));
        ((JavascriptExecutor) DriverManager.getDriver()).executeScript("arguments[0].style.border='3px solid red'", ele);
        return ele;
    }

    public List<WebElement> getElements(By element) {
        List<WebElement> ele = DriverManager.getDriver().findElements(element);
        return ele;
    }

    public WebElement getElementWithFluentWait(By element) {

        Wait wait = new FluentWait<WebDriver>(DriverManager.getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(ElementNotInteractableException.class)
                .ignoring(NotFoundException.class)
                .ignoring(NoSuchElementException.class)
                .ignoring(java.util.NoSuchElementException.class)
                .ignoring(ElementNotVisibleException.class)
                .ignoring(Exception.class);
        WebElement ele = (WebElement) wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(element);
            }
        });
        return ele;
    }

    //this method is used for sending texts
    public void sendText(By element, String text) {
        getElement(element).sendKeys(text);
    }

    //    Scroll Into View
    public void scrollToElement(By element) {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", getElementWithFluentWait(element));
    }

    public void player(By youTubeVideo) {
        JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
        getElementWithFluentWait(youTubeVideo).click();
    }

    public void clickOn(By linkText) {
        getElementWithFluentWait(linkText).click();
    }

    public void clickOn(WebElement linkText) {
        linkText.click();
    }

    public String getTitleOfThePage() {
        DriverManager.getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        String title = DriverManager.getDriver().getTitle();
        return title;
    }

    public void navigateBack() {
        DriverManager.getDriver().manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        DriverManager.getDriver().navigate().back();
    }

    //This method select from list
    public void clickOnSelectMenu(By element, String option) {
        Select select = new Select(getElementWithFluentWait(element));
        select.selectByVisibleText(option);
    }

    public void switchToWindow() {
        DriverManager.getDriver().switchTo().alert();
    }

    public void windowHandles() {
        for (String window : DriverManager.getDriver().getWindowHandles()) {
            String ideal = DriverManager.getDriver().switchTo().defaultContent().getWindowHandle();
            if (!DriverManager.getDriver().getWindowHandles().equals(ideal)){
               DriverManager.getDriver().switchTo().window(window);
            }
        }
    }

    public boolean checkDisplayed(By element) {
       return getElementWithFluentWait(element).isDisplayed();
    }

    public void takeScreenShot() {
        try {
            TakesScreenshot scrShot = ((TakesScreenshot) DriverManager.getDriver());
            File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
            File destFile = new File("./screenshots/" + System.currentTimeMillis() + ".png");
            FileUtils.copyFile(srcFile, destFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}