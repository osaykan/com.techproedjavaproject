package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day03and04LocatorsIntro {
    //<input type="email" class="form-control" placeholder="Email" data-test="email" name="session[email]" id="session_email"> sayfadan kopyaladik
    //Bir class oluşturun: LocatorsIntro
    //Main method oluşturun ve aşağıdaki görevi tamamlayın.
    public static void main(String[] args) {
        //http://a.testaddressbook.com/sign_in  adresine gidiniz.
        System.setProperty("webdriver.chrome.driver","C:/Users/Mz/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");
        //email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTexBox=driver.findElement(By.id("session_email"));//girmek istedigimiz email adresine bilgi göndermek icin id aldik
        emailTexBox.sendKeys("testtechproed@gmail.com");//bu mail adresini gönderip yazdirdik

       // <input class="form-control" placeholder="Password" data-test="password" type="password" name="session[password]" id="session_password">
        //yukaridakini sayfadan password bilgilerini kopyalayip aldik

        WebElement passwordTextBox= driver.findElement(By.id("session_password"));
        passwordTextBox.sendKeys("Test1234!");

        //sign in button locate
       // <input type="submit" name="commit" value="Sign in" class="btn btn-primary" data-test="submit" data-disable-with="Sign in">
        //id yok name veya clasName olabilir
          WebElement signinButton = driver.findElement(By.name("commit"));

        signinButton.click();


        //Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //Username :  testtechproed@gmail.com
        //Password : Test1234!

        driver.manage().window().maximize();  //sag üstteki userID görmek icin sayfayi büyüttük
        //Expected user id nin testtechproed@gmail.com  oldugunu dogrulayin(verify).
        //<span class="navbar-text" data-test="current-user">testtechproed@gmail.com</span>

        WebElement userID=driver.findElement(By.className("navbar-text"));
       // System.out.println(usedID);//[[ChromeDriver: chrome on WINDOWS (9a058eeabd0c769957b66edf5a788104)] -> class name: navbar-text] reference yi verdi
      //  System.out.println("User ID Text: "+usedID.getText());//User ID Text: testtechproed@gmail.com    getText() elementin görünen metnini verir

        String actualUserID =userID.getText();
        String expectedUserID="testtechproed@gmail.com";

        if(actualUserID.equals(expectedUserID)){
            System.out.println("PASS");     //PASS

        }else {
            System.out.println("FAIL");
            System.out.println("ACTUAL USER ID: "+actualUserID);
            System.out.println("Expected User ID: "+expectedUserID);
        }

        //“Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        //<a class="nav-item nav-link" data-test="addresses" href="/addresses">Addresses</a>  siteden kopyaladik
        WebElement addressLink = driver.findElement(By.linkText("Addresses"));//By.linkText() sadece linkler icin kullanilir ve reference yi bulduk
        String actualAddressLinkText= addressLink.getText();//Sayfadaki görünen metni verir
        String expectedAddressLinkText="Addresses";

        if (actualAddressLinkText.equals(expectedAddressLinkText)){
            System.out.println("PASS");     //PASS

        }else {
            System.out.println("FAIL");
        }

        //<a class="nav-item nav-link" data-test="sign-out" rel="nofollow" data-method="delete" href="/sign_out">Sign out</a>
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
            //By.partialLinkText();
         WebElement addressPartialLink=driver.findElement(By.partialLinkText("Address"));
        String actualAddressPartiallinkText= addressPartialLink.getText();

        System.out.println("Addresses By Partial LinkText : "+actualAddressPartiallinkText);


        //<a class="nav-item nav-link" data-test="sign-out" rel="nofollow" data-method="delete" href="/sign_out">Sign out</a>

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
        System.out.println("\"1. Web Element : \"+"+listOfWebElement.get(0));//refenci verir
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
