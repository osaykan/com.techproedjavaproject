package gurbetriview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Day05Locators {
    //1. Bir class oluşturun : Locators_css
    // 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
    // a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
    // b. Locate email textbox
    // c. Locate password textbox ve
    // d. Locate signin button
    // e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
    // i. Username : testtechproed@gmail.com
    // ii. Password : Test1234!
    // NOT: cssSelector kullanarak elementleri locate ediniz.
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Mz/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailBox = driver.findElement(By.cssSelector("input[type='email']"));
        emailBox.sendKeys("testtechproed@gmail.com");

        WebElement passwordTextBox=driver.findElement(By.cssSelector("#session_password"));
        passwordTextBox.sendKeys("Test1234!");

        WebElement signinButton=driver.findElement(By.cssSelector("input[type='submit']"));
        signinButton.click();


    }
}
