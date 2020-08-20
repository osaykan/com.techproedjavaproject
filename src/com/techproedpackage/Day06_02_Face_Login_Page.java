package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day06_02_Face_Login_Page {
    public static void main(String[] args) {
        //Bir class oluşturun : Face_Login_Page
        //	1. https://www.facebook.com/ facebook sayfasina gidin.
        System.setProperty("webdriver.chrome.driver","C:/Users/Mz/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");

        //2. username ve password gecerli mi test edin.
        WebElement usernameTextBox= driver.findElement(By.cssSelector("#email"));
        usernameTextBox.sendKeys("testusername");
        //	Username = "testusername"
        WebElement passwordTextBox=driver.findElement(By.cssSelector("#pass"));
        passwordTextBox.sendKeys("testpassword");
        //	Password  =  "testpassword"
        //	Step 1. locate username box
        //	Step 2. locate password box
        //	Step 3. locate signin button
       WebElement loginButton= driver.findElement(By.cssSelector("#u_0_b"));
        //	Step 4. click sign in button
      //  loginButton.click();





        //Aynı classi kullanarak;
        //1.Asagidaki web elementlerini locate edin ve textlerini konsolda yazdirin.
        //"Sign Up"
        WebElement signUp=driver.findElement(By.xpath("//div[@class='mbs _52lq fsl fwb fcb']"));
        System.out.println("SIGN UP TEXT : "+signUp.getText());   //SIGN UP TEXT : Registrieren
        //"Connect with friends and the world around you on Facebook."
        WebElement text = driver.findElement(By.xpath("//div[@class='_5iyx']"));
        System.out.println("TEXT : "+text.getText());//TEXT : Auf Facebook bleibst du mit Menschen in Verbindung und teilst Fotos, Videos und vieles mehr mit ihnen.
        //2.First name , Last name, Mobile number or email, New password text boxlarini locate edin ve verilen test datalarini text boxlara gonderin.
        //First name = testfirstname
        WebElement firstName = driver.findElement(By.cssSelector("#u_0_o"));
        firstName.sendKeys("testfirstname");
        //Last name = testlastname
        WebElement lastName=driver.findElement(By.xpath("//input[@id='u_0_q']"));//veya By.id("u_0_q");
        lastName.sendKeys("testlastname");
        //Mobile number or email = test@gmail.com
        WebElement numberOrName = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        numberOrName.sendKeys("test@gmail.com");
        //New Password = testpassword
        WebElement newPassword = driver.findElement(By.cssSelector("#password_step_input")); //veya By.id("password_step_input");
        newPassword.sendKeys("testpassword");


    }
}
