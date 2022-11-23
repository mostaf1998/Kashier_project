package Pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page_signup {

    public WebElement name(WebDriver driver) {
        return driver.findElement(By.name("full_name"));

    }
    public WebElement store(WebDriver driver) {
        return driver.findElement(By.name("store_name"));

    }

    public WebElement register(WebDriver driver) {
        return driver.findElement(By.cssSelector("span[class=\"transform-checkbox-icon\"]"));

    }

    public WebElement phone(WebDriver driver) {
        return driver.findElement(By.name("mobile_number"));

    }

     public WebElement email(WebDriver driver) {
        return driver.findElement(By.name("email"));

    }
    public WebElement password1(WebDriver driver) {
        return driver.findElement(By.cssSelector("[placeholder=\"Create password\"]"));

    }

    public WebElement password2(WebDriver driver) {
        return driver.findElement(By.cssSelector("[placeholder=\"Re-type password\"]"));

    }

    public WebElement signup(WebDriver driver) {
        return driver.findElement(By.xpath("//button[@type=\"button\"]"));

    }
}
