package testscenarios;

import org.junit.*;

public class TestNgExample {

    @BeforeClass
    public static void runOnceBeforeClass() {
        System.out.println("@BeforeClass - run once before class");
    }

    @Before
    public void runBeforeTestMethod() {
        System.out.println("@Before - run before test method");
    }

    @Test
    public void test_method_1() {
        System.out.println("@Test - test_method_1");
    }

    @Test
    public void test_method_2() {
        System.out.println("@Test - test_method_2");
    }

    @After
    public void runAfterTestMethod() {
        System.out.println("@After - runAfterTestMethod");
    }

    @AfterClass
    public static void runOnceAfterClass() {
        System.out.println("@AfterClass - run once after class");
    }
}