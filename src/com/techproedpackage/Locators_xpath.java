package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators_xpath {
    public static void main(String[] args) {
        //Bir class olusturun: Locators_xpath
        //Main method olusturun ve aşağıdaki görevi tamamlayın.
        System.setProperty("webdriver.chrome.driver","C:/Users/Mz/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Kullanici http://a.testaddressbook.com/sign_in adresine gitsin.
        driver.get("http://a.testaddressbook.com/sign_in");
        //Locate email textbox
        //email text box'i absolute xpath kullanarak locate ettik
        WebElement emailTextBox = driver.findElement(By.xpath("html/body/div/div/div/div/form/div[1]/input"));
        emailTextBox.sendKeys("testtechproed@gmail.com");

        //Locate password textbox ve
        //relative xpath kullanarak locate edelim
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@type='password']"));//(//input[@class='form-control'])[2]
                                                                            //class kullaninca 2 tane cikiyor ya baska yada parantez icine al [2] yaz
        passwordTextBox.sendKeys("Test1234!");
        //Locate signin button
        WebElement signinButton = driver.findElement(By.xpath("//input[@value='Sign in']"));
        signinButton.click();
        //Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //Username :  testtechproed@gmail.com
        //Password : Test1234!

        //Ardından, beklenen(expected) user id  testtechproed@gmail.com dogrulayin(verify)
        WebElement userId = driver.findElement(By.xpath("//*[.='testtechproed@gmail.com']"));//önce user id locate edilecek
                                                                                            //*[.='text name']
        String actualUserID = userId.getText();
        String expectedUserID ="testtechproed@gmail.com";

        if( actualUserID.equals(expectedUserID)){
            System.out.println("PASS");   //PASS

        }else {
            System.out.println("FAIL");
            System.out.println("ACTUAL USER ID : "+ actualUserID);
            System.out.println("EXPECTED USER ID : "+ expectedUserID);
        }

        //Addresses ve Sign Out metinlerinin görüntülendiğini(isDisplayed) doğrulayin.
                                                                //tagName[.='text name'];
        WebElement addresLink = driver.findElement(By.xpath("//a[.='Addresses']"));//if yapmayalim sadece görelim
        System.out.println("ADDRESSES LINK TEXT : "+ addresLink.getText());  //ADDRESSES LINK TEXT : Addresses

        WebElement signOutLink = driver.findElement(By.xpath("//a[.='Sign out']"));
        System.out.println("SIGN  OUT LINK TEXT : "+signOutLink.getText());
        //Sayfadaki toplam link sayısını bulun ve konsolda yazdirin.

        List<WebElement> listOfLinkElement = driver.findElements(By.tagName("a"));
        System.out.println("Sayfadaki Toplam Link Sayisi : "+listOfLinkElement.size()); //adedi buluyoruz

        for (WebElement element:listOfLinkElement){            //ismlerini yaziyoruz
            System.out.println(element.getText());
        }

        //Sayfadan çıkış yapın(Sign Out)
        signOutLink.click();
    }
}
