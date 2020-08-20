package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Mz/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");

       // driver.get("https://www.amazon.com/");
        //1. Aynı class ta, Navigate to amazon home page  https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
     //2. Navigate back to google
        Thread.sleep(5000);//Biraz beklesin diye yazdik
        driver.navigate().back();//navigate().to dan önceki sayfaya geri gönderiyor.google
     //3. Navigate forward to amazon
        Thread.sleep(5000);
        driver.navigate().forward();//bir sonraki sayfaya gidecek.google==>amazon==>google==>amazon
     //4. Refresh(yenile) the web page
        driver.navigate().refresh();//son bulundugu sayfayi yeniliyor
     //5. Maximize the window
        driver.manage().window().maximize();//sayfayi büyütüyor.
     //6. Close/Quit the browser
        driver.quit();

    }
}
