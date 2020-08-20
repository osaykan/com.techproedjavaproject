package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day05CheckBox {
    //Bir class oluşturun : CheckBox
    //Main method oluşturun ve aşağıdaki görevi  tamamlayın.
    public static void main(String[] args) {

        //Verilen web sayfasına gidin. https://the-internet.herokuapp.com/checkboxes
        System.setProperty("webdriver.chrome.driver","C:/Users/Mz/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/checkboxes");


        //Checkbox1 ve checkbox2 elementlerini locate edin.
        WebElement checkBox1= driver.findElement(By.xpath("//input[@type='checkbox'][1]"));  //xpath kullandik
        //Checkbox1 seçili değilse onay kutusunu tıklayın
        if (!checkBox1.isSelected()){                                                 //isSelected() secilimi
            checkBox1.click();
        }else{
            System.out.println("CeckBox1 daha önce check edilmis.");
        }


        WebElement checkBox2= driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        //Checkbox2 seçili değilse onay kutusunu tıklayın
        if (!checkBox2.isSelected()){
            checkBox2.click();
        }else{
            System.out.println("CeckBox2 daha önce check edilmis.");
        }



    }
}
