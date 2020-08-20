package gurbetriview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day05_02CheckBox {
    //1. Bir class oluşturun : CheckBox
    // 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
    // a. Verilen web sayfasına gidin. https://the-internet.herokuapp.com/checkboxes
    // b. Checkbox1 ve checkbox2 elementlerini locate edin.
    // c. Checkbox1 seçili değilse onay kutusunu tıklayın
    // d. Checkbox2 seçili değilse onay kutusunu tıklayın
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Mz/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

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
