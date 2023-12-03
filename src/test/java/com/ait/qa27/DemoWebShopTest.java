package com.ait.qa27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class DemoWebShopTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void findElementByCssSelector() {
        driver.findElement(By.cssSelector("#nivo-slider"));
        driver.findElement(By.cssSelector(".header-logo"));
        driver.findElement(By.cssSelector("#dialog-notifications-error"));
        driver.findElement(By.cssSelector(".topic-html-content-header"));
        driver.findElement(By.cssSelector("link[href='/Content/jquery-ui-themes/smoothness/jquery-ui-1.10.3.custom.min.css']"));
    }

    @Test
    public void findElementByXpath() {
        driver.findElement(By.xpath("//*[@id='nivo-slider']"));
        driver.findElement(By.xpath("//*[@class='header-logo']"));
        driver.findElement(By.xpath("//*[@id='dialog-notifications-error']"));
        driver.findElement(By.xpath("//*[@class='topic-html-content-header']"));
        driver.findElement(By.xpath("//link[@href='/Content/jquery-ui-themes/smoothness/jquery-ui-1.10.3.custom.min.css']"));

    }

    @AfterMethod()
    public void tearDown() {
        driver.close();
    }
}
