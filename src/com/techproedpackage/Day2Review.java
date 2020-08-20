package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Review {
    //1. Create a class : Day2Review
    //2. ChromeDriver kullanarak, youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın(verify),
    // eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
    //3. Sayfa URL'sinin “youtube” içerip içermediğini(contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
    //4. Daha sonra Navigate to https://www.amazon.com/
    //5. Navigate back to youtube
    //6. Refresh the page
    //7. Navigate forward to amazon
    //8. Maximize the window
    //9. Ardından sayfa başlığının "Amazon" içerip içermediğini(contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.
    //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
    //11.Quit the browser
    //Ausblenden
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Mz/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");

        String actualYoutubeTitle = driver.getTitle();
        String expectedYoutubeTitle = "youtube";
        if(actualYoutubeTitle.equals(expectedYoutubeTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FEIL");//FEIL
            System.out.println("ACTUALYOUTUBETITEl: "+ actualYoutubeTitle);//YouTube
            System.out.println("EXPECTED YOUTUBE TITEL: "+expectedYoutubeTitle);//youtube
        }
        String actualYoutubeURL = driver.getCurrentUrl();
        if(actualYoutubeURL.contains("youtube")){
            System.out.println("PASS"); //PASS

        }else {
            System.out.println("FAIL");
            System.out.println("ACTUALYOUTUBEURL"+actualYoutubeURL);
        }
        driver.navigate().to(" https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();
        String actualAmazonTitle= driver.getTitle();
        if(actualAmazonTitle.contains("Amazon")){
            System.out.println("PASS");  //PASS

        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL AMAZON TITLE"+actualAmazonTitle);
        }
        String actualAmazonURL =driver.getCurrentUrl();
        String expectedAmazonURL="https://www.amazon.com/";
        if(actualAmazonURL.equals(expectedAmazonURL)){
            System.out.println("PASS"); //PASS
        }else {
            System.out.println("FAIL");
            System.out.println("ACTUAL AMAZON URL: "+actualAmazonURL);
        }
        driver.quit();
    }
}
