package gurbetriview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day04Locators {


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
      //Day04  =======================================================================
        WebElement actualAddressPartialLink=driver.findElement(By.partialLinkText("Address"));
        String actualAddressPartialLinkText=actualAddressPartialLink.getText();
        System.out.println(actualAddressPartialLinkText);

        WebElement signOutPartialLink=driver.findElement(By.partialLinkText("Sig"));
        String actualSignOutPartialLink= signOutPartialLink.getText();
        System.out.println("Sign Out Partial Link : "+ actualSignOutPartialLink);


        //Sayfadaki toplam link sayisini bulun ve bu linkleri consol'a yazdirin.
        //findElement() methodu yalnizca tek bir elementi locate icin kullanilir. String return eder
        //findElements() methodu birden fazla element return eder. List<WebElement>

        List<WebElement> listOfWebElement = driver.findElements(By.tagName("a"));

        System.out.println("Bu web sayfasinda "+listOfWebElement.size()+" tane link vardir");

        //Linkleri tek tek yazdirin.
        //3 tane link elementi var. 1.elementin indexini 0 aliriz.
        System.out.println("\"1. Web Element : \"+"+listOfWebElement.get(0));//refenci verir.Yazdirmaz
        //1.elementin konsola yazdirilmasi. 1.element icin index 0 alinir
        System.out.println("1.link Text : "+listOfWebElement.get(0).getText());//1.link Text : Home
        //2.elementin konsola yazdirilmasi. 2.element icin index 1 alinir
        System.out.println("2.link Text : "+listOfWebElement.get(1).getText());//2.link Text : Addresses
        //3.elementin konsola yazdirilmasi. 3.element icin index 2 alinir
        System.out.println("3.link Text : "+listOfWebElement.get(2).getText());//3.link Text : Sign out

        //for each kullanarak tüm elemenlari yazdiralim

        for (WebElement element: listOfWebElement){
            System.out.println(element.getText());
        }


    }


}
