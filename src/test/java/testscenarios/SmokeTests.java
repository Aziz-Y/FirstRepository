package testscenarios;

import com.sun.org.apache.bcel.internal.ExceptionConstants;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.awt.*;

public class SmokeTests {

    FirefoxDriver driver;

    @Before
    public void startBrowser() {
        driver = new FirefoxDriver();
        System.out.println("This Is Befor");
    }

    @Test
    public void testMethod() throws InterruptedException {
        driver.get("https://www.selenium.dev/");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Downloads")).click();
        System.out.println("This is the name of the current thread :" + Thread.currentThread().getName());
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        System.out.println("This Is Test");
    }

    @Test
    public void testMethod2() throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.selenium.dev/");

        Thread.sleep(2000);
        driver.manage().window().maximize();
        js.executeScript("window.scrollBy(0,3000)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-3000)");
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.linkText("Downloads"));
        Wait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Downloads")));
//        wait.until(ExpectedConditions.visibilityOf(element));
        driver.findElement(By.linkText("Downloads")).click();
        Thread.sleep(3000);
    }

    @Test
    public void testMethod3() throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.selenium.dev/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.linkText("LEARN MORE"));
        js.executeScript("arguments[0].scrollIntoView();", element);
        Thread.sleep(3000);
        element.click();
        Thread.sleep(3000);

//        Actions builder = new Actions(driver);
//        org.openqa.selenium.interactions.Action mouseOverHome = builder
//                .moveToElement(element).click()
//                .build();
//
//        Robot robot = new Robot();
//        robot.mouseMove(1197, 44);
//        Thread.sleep(5000);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//        Robot robot = new Robot();

    }

    @Test
    public void testMethod4() throws InterruptedException {
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
        Thread.sleep(5000);
//        driver.findElement(By.linkText("Run")).click();
        int size = driver.findElements(By.tagName("iframe")).size();

        for (int i = 0; i <= size; i++) {
            driver.switchTo().frame(i);
            Select select = new Select(driver.findElement(By.tagName("select")));
            select.selectByVisibleText("Saab");
            Thread.sleep(3000);
        }
    }

    @After
    public void tearDown() {
        driver.close();
        System.out.println("This Is The End");
    }
}