package testscenarios;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestingW3schools {

    FirefoxDriver driver;

    @Before
    public void startBrowser() {
        driver = new FirefoxDriver();
        System.out.println("This is before");
    }

    @Test
    public void testMethod1() throws InterruptedException {
        driver.get("https://www.w3schools.com/");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"navbtn_tutorials\"]"));
        Thread.sleep(3000);
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"nav_tutorials\"]/div/div[3]/a[1]"));
        Thread.sleep(3000);
    }

    @Test
    public void testMethod2() throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://www.w3schools.com/sql/default.asp");
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);
        driver.findElement(By.name("ex1")).sendKeys("SELECT");
        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"w3-exerciseform\"]/div/button"));
        element1.click();
        driver.switchTo().frame(2);
        driver.findElement(By.linkText("Submit Answer")).click();
        Thread.sleep(5000);
//        WebElement element = driver.findElement(By.linkText("* FROM Customers"));
//        js.executeScript("arguments[0].scrollIntoView();", element);
//        Thread.sleep(3000);
    }

    @After
    public void tearDown() {
        driver.quit();
        System.out.println("The End");
    }
}
