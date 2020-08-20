package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day05Locators_css {
    //Bir class oluşturun : Locators_css
    //Main method oluşturun ve aşağıdaki görevi  tamamlayın.
    public static void main(String[] args) {
        //Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        System.setProperty("webdriver.chrome.driver","C:/Users/Mz/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");

        //Locate email textbox
        //<input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email">
       WebElement emailTextBox= driver.findElement(By.cssSelector("input[type='email']"));  //hepsi icin  tagName[attribute='value']
        emailTextBox.sendKeys("testtechproed@gmail.com");
       // driver.findElement(By.cssSelector("input#session_email"));  //id icin kullanilir
      //  driver.findElement(By.cssSelector("input.form-control"));   //class kullanacaksak

        //Locate password textbox ve                                 //1.id                      //2.veya input.classvalue
        WebElement passwordTextBox=driver.findElement(By.cssSelector("input#session_password"));//3.veya input[type='password']
        passwordTextBox.sendKeys("Test1234!");

        //Locate signin button                                       //tagName[attribute='value']
        WebElement signinButton = driver.findElement(By.cssSelector("input[class='btn btn-primary']"));//id yok classvalue calismadi
        signinButton.click();
        //Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //Username :  testtechproed@gmail.com
        //Password : Test1234!
    }
}
