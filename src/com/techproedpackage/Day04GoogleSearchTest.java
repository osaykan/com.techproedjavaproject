package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day04GoogleSearchTest {
    public static void main(String[] args) {
        //1. Bir class oluşturun : GoogleSearchTest
        //2. Main method oluşturun ve aşağıdaki görevi  tamamlayın.
        //A.google web sayfasına gidin. https://www.google.com/
        System.setProperty("webdriver.chrome.driver","C:/Users/Mz/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //b. Search(ara) “city bike”
        WebElement googleSearchBox = driver.findElement(By.name("q"));
        googleSearchBox.sendKeys("city bike");//city bike arama yerine yazdik
        googleSearchBox.submit();//Tiklama veya enter icin kullaniyoruz. clik butonu yoksa submit kullanilabilir ayni

        //c. Google'da görüntülenen ilgili sonuçların sayısını yazdırın
        //<div id="result-stats">Ungefähr 1.490.000.000 Ergebnisse<nobr> (0,76 Sekunden)&nbsp;</nobr></div>
        WebElement allResults = driver.findElement(By.id("result-stats"));
        System.out.println(allResults.getText());//webden alinan bilgiyi yazdirmak icin getText()
                                                 //Ungefähr 1.490.000.000 Ergebnisse (0,69 Sekunden)
        //d. “Shopping” e tıklayın.
        driver.findElement(By.linkText("Shopping")).click();
        //e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        driver.findElement(By.className("TL92Hc")).click();

    }
}
