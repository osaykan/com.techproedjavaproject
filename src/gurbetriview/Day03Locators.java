package gurbetriview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03Locators {
    //1. Bir class oluşturun: LocatorsIntro
    //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
    //a. http://a.testaddressbook.com/sign_in adresine gidiniz.
    //b. email textbox,password textbox, and signin button elementlerini locate ediniz..
    //c. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
    //i. Username : testtechproed@gmail.com
    //ii. Password : Test1234!
    //d. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
    //e. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed)
    //doğrulayin(verify).
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/Mz/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //a. http://a.testaddressbook.com/sign_in adresine gidiniz.
        driver.get("http://a.testaddressbook.com/sign_in");

        //b. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox=driver.findElement(By.id("session_email"));
        emailTextBox.sendKeys("testtechproed@gmail.com");

        WebElement passwordTextBox=driver.findElement(By.id("session_password"));
        passwordTextBox.sendKeys("Test1234!");
        Thread.sleep(3000);
        WebElement signInButton =driver.findElement(By.name("commit"));
        signInButton.click();
        //c. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!
        //d. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        WebElement userID=driver.findElement(By.className("navbar-text"));
        String actualUserID= userID.getText();
        String expectedUserID="testtechproed@gmail.com";
        if(actualUserID.equals(expectedUserID)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ACTUAL USER ID :"+actualUserID);
            System.out.println("EUSER ID :"+expectedUserID);
        }
        //e. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed)
        //doğrulayin(verify).
        WebElement addressLinkText=driver.findElement(By.linkText("Addresses"));
        String actualAddressLinkText=addressLinkText.getText();
        String expectedAddressLinkText="Addresses";
        if (actualAddressLinkText.equals(expectedAddressLinkText)){
            System.out.println("PASS");     //PASS

        }else {
            System.out.println("FAIL");
        }

        WebElement signOut=driver.findElement(By.linkText("Sign out"));
        String actualSignOutText= signOut.getText();
        String expectedSignOutText="Sign Out";

        if (actualSignOutText.equals(expectedSignOutText)){
            System.out.println("PASS");

        }else {
            System.out.println("FAIL");      //FAIL
            System.out.println("Actual Sign Out Text: "+actualSignOutText);  //Sign out
            System.out.println("Expected Sign Out Text: "+expectedSignOutText);//Sign Out
        }

    }


}
