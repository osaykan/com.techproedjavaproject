package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","C:/Users/Mz/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); //Obje olusturduk
        driver.get("https://www.google.com");  //Web sayfasina gitmek icin get() kullandik.

        Thread.sleep(5000);  //5 sn bekledikten sonra kapanmasi icin exception olusturduk.Altini kirmizi ciziyor
                                   //üzerine gidip sag tikla add...throws exception..

        //driver.close(); ikiside olur  mevcut sayfayi kapatir
        driver.quit();   //acilan tüm sayfalari kapatir.
    }

}
