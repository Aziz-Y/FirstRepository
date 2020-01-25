package tests;

import org.testng.annotations.AfterClass;
import pages.DriverManager;

public class TestHooker {

   @AfterClass
    public static void quitTest(){
        DriverManager.tearDown();
    }
}
