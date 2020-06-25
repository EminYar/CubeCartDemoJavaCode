package com.UpgradeJavaCoding.com.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class UpgradeTask1 {

    WebDriver driver;

    @BeforeClass
    public void testSetup() {

        //set up selenium chrome driver in the systems

        System.setProperty("webdriver.chrome.driver", "/Users/memetiminabliz/webdriver/chromedriver");
//define a chrome driver instance
        driver = new ChromeDriver();
        //maximize browser window
        //  driver.manage().window().maximize();

        //implicit wait

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

//Navigate to ​https://www.credify.tech/phone/nonDMFunnel

        driver.navigate().to("https://www.credify.tech/funnel/nonDMFunnel");

    }

    @Test(priority = 0)
    //Login

    public void Login() throws InterruptedException {

        //Login

        driver.findElement(By.xpath("//input[@name='desiredAmount']")).sendKeys("2000");

        WebElement dropdown = driver.findElement(By.xpath("//select[@class='sc-fzqMAW elwVsT sc-fzoaKM hNuJKS']"));


        Select select = new Select(dropdown);

        select.selectByIndex(3);

//        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@class='sc-fzqBkg fsRdio sc-fzpkqZ kFMkqB']")).click();
    }

    @Test(priority = 1)

    // Basic information

    public void BasicInfo() throws InterruptedException {

        //Let's get started with some basic information
        driver.findElement(By.name("borrowerFirstName")).sendKeys("emin");
        driver.findElement(By.name("borrowerLastName")).sendKeys("Tarim");

        driver.findElement(By.id("borrowerStreet")).sendKeys("6775 Selma Ave");


        driver.findElement(By.name("borrowerCity")).sendKeys("Los Angeles");

        driver.findElement(By.name("borrowerState")).sendKeys("CA");
        driver.findElement(By.name("borrowerZipCode")).sendKeys("90028");

        driver.findElement(By.xpath("//input[@name='borrowerDateOfBirth']")).sendKeys("02/02/1986");


        driver.findElement(By.id("borrowerStreet")).sendKeys(Keys.ARROW_DOWN);
        driver.findElement(By.id("borrowerStreet")).sendKeys(Keys.ENTER);


        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@class='sc-fzqBkg dOkxeR section']")).click();
    }

    @Test(priority = 2)
//Income information
    public void Income() {

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("13000");
        driver.findElement(By.name("borrowerAdditionalIncome")).sendKeys("6000");

        driver.findElement(By.xpath("//button[@class='sc-fzqBkg dOkxeR section']")).sendKeys(Keys.ENTER);
    }

    @Test(priority = 3)
//Create an account
    public void CreateAcount() throws InterruptedException {
        driver.findElement(By.name("username")).sendKeys("EminA20061020b@upgrade-challenge.com"
        );

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("A20061020b");
        driver.findElement(By.xpath("//div[@class='sc-fzqKxP sc-pANHa iGPRRc']")).click();

        driver.findElement(By.xpath("//button[@class='sc-fzqBkg dOkxeR section']")).click();

    }


    @Test(priority = 4)

    public void Signout() throws InterruptedException {

        Thread.sleep(5000);


        driver.findElement(By.xpath("//body/div[@id='root']/div[@class='layout__wrap']/main[@class='container-fluid layout__main layout-default']/div/header[@class='header header--collapsed']/div[@class='header-nav']/label[1]")).click();


        WebDriverWait wait = new WebDriverWait(driver, 20);

        WebElement seleniumlink;
        seleniumlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Sign Out')]")));
        seleniumlink.click();


    }

    @Test(priority = 5)

    public void Verification() {

        //navigate to ​https://www.credify.tech/portal/login
        driver.navigate().to("https://www.credify.tech/portal/login");

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("EminA20061020b@upgrade-challenge.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("A20061020b");
        driver.findElement(By.xpath("//button[@class='sc-fznKkj kDPvMO']")).click();

        //offer-page, store the Loan Amount, Monthly Payment, Term, Interest Rate

        WebElement Web1 = driver.findElement(By.cssSelector("div.layout__wrap main.container-fluid.layout__main.layout-default:nth-child(4) div:nth-child(1) div.sc-fznBMq.ekttti.row.center-xs div.col-xs-12.col-sm-8.col-md-6 > h2.title--secondary.text--weight-light.text--color-primary.section"));

        Assert.assertEquals("We can't offer you a loan yet, but here's how we can help.", Web1.getText());

    }


    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}

