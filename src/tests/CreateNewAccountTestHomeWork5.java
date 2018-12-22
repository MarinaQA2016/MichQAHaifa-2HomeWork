package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

public class CreateNewAccountTestHomeWork5 extends TestBase {
    @Test
    public void CreateNewAccountTest() throws InterruptedException {
        Sleep(driver, By.xpath("//span[contains(text(),'Create Account')]"),30);
        do{
            try {
                WebElement createAccount = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
                createAccount.click();
                break;
            }catch(Exception e){}
        }while(true);
        //WebElement createAccount = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
        //createAccount.click();

        Sleep(driver, By.xpath("//span[contains(text(),'Cancel')]"),30);

        WebElement mailField = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        mailField.click();
        mailField.sendKeys("titi19"+new Date().getTime()+"@gmail.com");



        WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passwordField.click();
        Thread.sleep(2000);
        passwordField.sendKeys("example");
        Thread.sleep(2000);

        WebElement repPasswordField = driver.findElement(By.xpath("//input[@formcontrolname='passwordRep']"));
        repPasswordField.click();
        repPasswordField.sendKeys("example");
        Thread.sleep(2000);

        WebElement registrationButton = driver.findElement(By.xpath("//span[contains(text(),'Registration')]"));
        registrationButton.click();


        WebElement cancelButton = driver.findElement(By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]/.."));
        cancelButton.click();


        Sleep(driver, By.xpath("//mat-icon[@mattooltip='Menu']"),120);
        WebElement menuButton = driver.findElement(By.xpath("//mat-icon[@mattooltip='Menu']"));
        menuButton.click();
        Thread.sleep(2000);

        Sleep(driver, By.xpath("//span[@class='marginLeft']"),30);
        WebElement logOutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
        logOutMenu.click();

        Sleep(driver, By.xpath("//span[contains(text(),'Go to Event list')]"),30);
        Thread.sleep(2000);
        WebElement event = driver.findElement(By.xpath("//span[contains(text(),'Go to Event list')]"));
        Assert.assertTrue(event.getText().equals("Go to Event list"));
        Thread.sleep(2000);

    }
    @Test
    public void CreateNewAccountAndLogIn() throws InterruptedException{
        //Thread.sleep(8000);
        //Sleep(driver,By.xpath("//span[contains(text(),'Create Account')]"),20);
        WebElement createAccount = driver.findElement(By.xpath("//span[contains(text(),'Create Account')]"));
        createAccount.click();
        Sleep(driver, By.xpath("//span[contains(text(),'Cancel')]"),30);

        WebElement mailField = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        mailField.click();
        mailField.sendKeys("titi19"+new Date().getTime()+"@gmail.com");

        WebElement passwordField = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passwordField.click();
        passwordField.sendKeys("example");

        WebElement repPasswordField = driver.findElement(By.xpath("//input[@formcontrolname='passwordRep']"));
        repPasswordField.click();
        repPasswordField.sendKeys("example");

        WebElement registrationButton = driver.findElement(By.xpath("//span[contains(text(),'Registration')]"));
        registrationButton.click();

        WebElement cancelButton = driver.findElement(By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]/.."));
        cancelButton.click();

        Sleep(driver, By.xpath("//mat-icon[@mattooltip='Menu']"),30);
        WebElement menuButton = driver.findElement(By.xpath("//mat-icon[@mattooltip='Menu']"));
        menuButton.click();

        Sleep(driver, By.xpath("//span[@class='marginLeft']"),30);
        WebElement logOutMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
        logOutMenu.click();

        //----------Login created user----------


        Sleep(driver, By.xpath("//span[contains(text(),'Login')]"),30);
        WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
        login.click();

        WebElement emailReg = driver.findElement(By.xpath("//input[@formcontrolname='email']"));
        emailReg.click();
        emailReg.sendKeys("user0@gmail.com");
        Thread.sleep(1000);

        WebElement passReg =  driver.findElement(By.xpath("//input[@formcontrolname='password']"));
        passReg.click();
        passReg.sendKeys("example");

        Sleep(driver, By.xpath("//span[contains(text(),'Log in')]"),30);
        WebElement log_In = driver.findElement(By.xpath("//span[contains(text(),'Log in')]"));
        log_In.click();
        do{
            try {
                WebElement menu = driver.findElement(By.xpath("//mat-icon[@mattooltip='Menu']"));
                menu.click();
                WebElement logMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
                logMenu.click();
                break;
            }catch(Exception e){}
        }while(true);

        //Sleep(driver,By.xpath("//mat-icon[@mattooltip='Menu']"),30);
       // WebElement menu = driver.findElement(By.xpath("//mat-icon[@mattooltip='Menu']"));
       // menu.click();

        //Sleep(driver,By.xpath("//span[@class='marginLeft']"),30);

        //WebElement logMenu = driver.findElement(By.xpath("//span[@class='marginLeft']"));
        //logMenu.click();
        //Thread.sleep(5000);
        //WebElement menu1 = driver.findElement(By.xpath("//span[contains(text(),'Go to Event list')]"));
        WebElement menu1 = new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Go to Event list')]")));
        //Assert.assertTrue(new WebDriverWait(driver, 30).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'Go to Event list')]"))).getText().equals("Go to Event list"));
    }

    private void Sleep(WebDriver driver, By locator, int time) {
        try {
            new WebDriverWait(driver, time).until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}