package testscenarios;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.util.List;

public class TestingSelenium {

    FirefoxDriver driver;

    @Before
    public void startBrowser() {
        driver = new FirefoxDriver();
    }

    @Test
    public void testMethod0() throws Throwable{
        driver.get("https://selenium.dev/");
        WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement element = wait.until(ExpectedConditions.visibilityOf(driver.findElement (By.xpath("//*[@id='header']/a/img[1]"))));
        System.out.println(element.getAttribute("src"));
    }
    @Test
    public void testMethod1() throws Throwable {
        JavascriptExecutor ts = (JavascriptExecutor) driver;
        driver.get("https://www.selenium.dev/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        ts.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
//        WebElement Element = driver.findElementByXPath(//div[@class="download-button webdriver"], Element);
        WebElement Element = driver.findElement(By.xpath("//div[@class='download-button webdriver']"));
        Thread.sleep(2000);
        Element.click();
        Thread.sleep(2000);
        Assert.assertEquals("Downloads", driver.getTitle());
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
    }

    @Test
    public void testMethod2() throws Throwable {
        JavascriptExecutor ts = (JavascriptExecutor) driver;
        driver.get("https://www.selenium.dev/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        ts.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        WebElement Element = driver.findElement(By.xpath("//div[@class='download-button ide']"));
        Thread.sleep(2000);
        Element.click();
        Assert.assertEquals("Downloads", driver.getTitle());
    }

    @Test
    public void testMethod3() throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.selenium.dev/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        WebElement Element = driver.findElement(By.xpath("//div[@class='download-button grid']"));
        Thread.sleep(2000);
        Element.click();
        Assert.assertEquals("Downloads", driver.getTitle());
    }

    @Test
    public void testMethod4() throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.selenium.dev/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"gsc-i-id1\"]")).sendKeys("IDE");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement Element = driver.findElement(By.xpath("//*[@id=\"navbar\"]/div[1]"));
        Thread.sleep(2000);
        Element.click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Ecosystem")).click();

        driver.findElements(By.tagName("Sauce Labs"));
        List<WebElement> elements = driver.findElements(By.tagName("td"));
        for (WebElement ele : elements) {
            System.out.println(ele.getText());
            if (ele.getText().equals("Sauce Labs")) {
                ele.click();
                break;
            }
        }
//        Thread.sleep(5000);
//        Wait wait = new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sauce Labs")));
//        wait.until(ExpectedConditions.visibilityOf(element));
//        driver.findElement(By.linkText("Sauce Labs")).click();
//        Thread.sleep(5000);
        Assert.assertEquals("Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs", driver.getTitle());
    }

    @After
    public void tearDown() {
        driver.close();
        System.out.println("This Is The End");
    }
}