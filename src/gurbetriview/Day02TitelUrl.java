package gurbetriview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02TitelUrl {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Mz/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //1.Yeni bir class oluşturun : VerifyTitleTest       (BaşlıkDoğrulamaTesti)
        //2.Navigate to google homepage(ana sayfa)
        //3.Google başlığının(title) "Google" olup olmadığını doğrulayın(verify).
        driver.get("https://www.google.com");
        String actuelTitel=driver.getTitle();
        String expectedTitle="Google";
        if(actuelTitel.equals(expectedTitle)){
            System.out.println("PASS");
        }else {
            System.out.println("Fail");
            System.out.println("ACTUAL TITTLE :"+ actuelTitel);
            System.out.println("EXPECTED TITLE :"+expectedTitle);
        }
        // //1. Yeni bir class oluşturun : VerifyURLTest
        //    // (URLDoğrulamaTesti)
        //    //2. Navigate to google homepage
        //    //3. Google ana sayfa URL'sinin “www.google.com” olduğunu doğrulayın(verify)

       String actualURL= driver.getCurrentUrl();
        String expectedURL="www.google.com";
        if(actualURL.equals(expectedURL)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("ACTUAL URL :"+actualURL);
            System.out.println("EXPECTED URL: "+expectedURL);
        }
    }
}
