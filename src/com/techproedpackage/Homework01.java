package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework01 {
    public static void main(String[] args) {
        //1. Yeni bir class oluşturun :Homework
        System.setProperty("webdriver.chrome.driver","C:/Users/Mz/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        //2. ChromeDriver'ı kullanarak facebook'a gidin ve sayfa başlığının(Page Title) "facebook" olup olmadığını doğrulayın,
        //     Değilse, doğru başlığı(Actual title) yazdırın.

        String actualFacebookTitel = driver.getTitle();
        String expectedFacebookTitel= "facebook";
        if(actualFacebookTitel.equals(expectedFacebookTitel)){
            System.out.println("PASS");

        }else {
            System.out.println("FEIL");       //FEIL
            System.out.println("ACTUAL FACEBOOK TITEL: " + actualFacebookTitel);//ACTUAL FACEBOOK TITEL: Facebook – Anmelden oder Registrieren
        }
        //3. Sayfa URL'sinin facebook içerip içermediğini(contains),
        //     Değilse doğru URL'yi(Actual url) yazdırın.
        System.out.println("Actual Facebook URL: "+ driver.getCurrentUrl());// https://www.facebook.com/
        String actualFacebookURL = driver.getCurrentUrl();
        String expectedFacebookURL= "facebook";
        if(actualFacebookURL.contains(expectedFacebookURL)){
            System.out.println("PASS");      //PASS

        }else{
            System.out.println("FAIL");
            System.out.println("Actual Facebook URL: "+ actualFacebookURL);
        }
        //4. Ardından Navigate to https://www.walmart.com/
        driver.navigate().to(" https://www.walmart.com/");
        //5. Walmart sayfa başlığının “Walmart.com” içerip
        //içermediğini(contains) doğrulayın
        String actualWalmartTitel = driver.getTitle();
        String expectedWalmartTitel="Walmart.com";
        if(actualWalmartTitel.contains(expectedWalmartTitel)){
            System.out.println("PASS");         //PASS
            System.out.println("Walmart sayfa başlığı "+expectedWalmartTitel+" icermektedir");//Walmart sayfa başlığı Walmart.com icermektedir

        }else {
            System.out.println("FAIL");
            System.out.println("Actual Walmart Titel: "+actualWalmartTitel);
            System.out.println("Expected Walmart Titel: "+expectedWalmartTitel);
        }
        //6. Navigate back to facebook
        driver.navigate().back();
        //7. Sayfayı yenileyin(refresh)
        driver.navigate().refresh();
        //8. Maximize the window
        driver.manage().window().maximize();
        //9. Close the browser
        driver.close();
    }
}
