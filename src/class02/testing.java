package class02;

import org.testng.annotations.*;

public class testing {
    @BeforeSuite
    public void beforesuite(){
        System.out.println("I am before suite");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("this is after test");
    }
    @BeforeTest
    public void beforetest(){
        System.out.println("This is before test");
    }
    @BeforeClass
    public void beforeclass(){
        System.out.println("this is before class method");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("i am after class method");
    }
    @BeforeMethod
    public void before(){
        System.out.println("This is before method");
    }
    @AfterMethod
    public void after(){
        System.out.println("this is after method");
    }
    @Test
    public void Testb(){
        System.out.println("Drive me crazy, drive me mad");
    }
    @Test
    public void Testa(){
        System.out.println("Drive me to 9999999, drive me to");
    }
}
