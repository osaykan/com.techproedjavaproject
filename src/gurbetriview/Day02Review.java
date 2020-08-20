package gurbetriview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02Review {
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

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Mz/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com");
        String actualYoutubeTitle=driver.getTitle();
        String expectedYoutubeTitle="youtube";
        if(actualYoutubeTitle.equals(expectedYoutubeTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL YOUTUBE TITLE :"+ actualYoutubeTitle);
            System.out.println("EXPECTED YOUTUBE TITLE :"+expectedYoutubeTitle);
        }
        String actualYoutubeURL=driver.getCurrentUrl();
        if(actualYoutubeURL.contains("youtube")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("ACTUAL YOUTUBE URL :"+actualYoutubeURL);
        }
        //4. Daha sonra Navigate to https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        //5. Navigate back to youtube
        driver.navigate().back();
        //6. Refresh the page
        driver.navigate().refresh();
        //7. Navigate forward to amazon
        driver.navigate().forward();
        //8. Maximize the window
        driver.manage().window().maximize();
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini(contains) doğrulayın,
        // Yoksa doğru başlığı(Actual Title) yazdırın.
        System.out.println("**************************");
        String actualAmazoTitle=driver.getTitle();
        if(actualAmazoTitle.contains("Amazon")){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("ACTUAL AMAZON TITLE :"+actualAmazoTitle);
        }
        System.out.println("*************************");
        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        String actualAmazonURL=driver.getCurrentUrl();
        String expectedAmazonUrl="https://www.amazon.com/";
        if(actualAmazonURL.equals(expectedAmazonUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUL AMAZON URL :"+actualAmazonURL);
        }
        //11.Quit the browser
        driver.quit();

    }
}
