package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_01VerifyTitleTest {
    public static void main(String[] args) {
        //1.Yeni bir class oluşturun : VerifyTitleTest
        //2. Navigate to google homepage(ana sayfa)
        //3. Google başlığının(title) "Google" olup olmadığını doğrulayın(verify).
    System.setProperty("webdriver.chrome.driver","C:/Users/Mz/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

       // System.out.println(driver.getTitle());//Gittigimiz sitenin basligini veriyor
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("ACTUEL TITLE : "+actualTitle);
            System.out.println("EXPECTED TITLE : "+ expectedTitle);
        }
        driver.close();
    }
}
