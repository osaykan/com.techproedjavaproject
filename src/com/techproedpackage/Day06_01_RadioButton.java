package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day06_01_RadioButton {
    public static void main(String[] args) {
        //Bir class oluşturun  : RadioButton
        //Main method oluşturun ve aşağıdaki görevi  tamamlayın.
        //Facebook web sayfasına gidin.  https://www.facebook.com/
        //Radio button elementlerini locate edin.
        //Seçili değilse istediginiz radio buttonu  tıklayın.
        System.setProperty("webdriver.chrome.driver","C:/Users/Mz/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");

        WebElement weiblich = driver.findElement(By.cssSelector("#u_0_6")); //id olani kullandik

        WebElement mänlich = driver.findElement(By.cssSelector("#u_0_7")); //id kisa olan yol

        WebElement divers=driver.findElement(By.cssSelector("#u_0_8")); // id kullandik
        weiblich.click();
        mänlich.click();
        divers.click();  //en sondakinde kalir

        if(!mänlich.isSelected()){
            mänlich.click();
        }else{
            System.out.println("Mänlich seçeneği zaten seçili");
        }
    }
}
