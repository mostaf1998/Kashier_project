package Signup;

import Pages.Page_signup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;
public class Sign {
    WebDriver driver = null;
    Page_signup page = new Page_signup();

    @BeforeTest
    public void open_browser() {
        System.setProperty("webdriver.chrome.driver", "D:\\Task1\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://merchant.kashier.io/signup");
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void signup() {
        page.name(driver).sendKeys("Eng Mostafa Mostafa");
        page.store(driver).sendKeys("Amazone");
        page.register(driver).click();
        page.phone(driver).sendKeys("01229902545");
        page.email(driver).sendKeys("mostafaelsayed3030@outlook.com");
        page.password1(driver).sendKeys("Mostafa1998199888@");
        page.password2(driver).sendKeys("Mostafa1998199888@");
        page.signup(driver).click();


        //Assertion1
        Assert.assertEquals(driver.getCurrentUrl(), "https://merchant.kashier.io/signup", "True");


    }





    @AfterTest

    public void close_browser() throws InterruptedException {
        driver.close();
    }

}

