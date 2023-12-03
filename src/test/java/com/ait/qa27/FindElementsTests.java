package com.ait.qa27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementsTests {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.berlin.de");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void findElementsByTag() {
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element);
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());

    }
    @Test
    public void findElementsByLocators() {
        driver.findElement(By.id("layout-grid__area--contentheader"));
        driver.findElement(By.className("logo"));
    }
    @Test
    public void findElementByCssSelector() {

        driver.findElement(By.cssSelector("#layout-grid__area--contentheader"));

        driver.findElement(By.cssSelector(".logo"));

        driver.findElement(By.cssSelector("[title='Weiterblättern']"));
    }
    @Test
    public void findElementByXpath() {

        driver.findElement(By.xpath("//*[@title='Weiterblättern']"));

        driver.findElement(By.xpath("//label[contains(.,'Informationen zu:')]"));
        driver.findElement(By.xpath("//label[text()='Berlin, ich brauche Informationen zu:']"));
        driver.findElement(By.xpath("//label[.='Berlin, ich brauche Informationen zu:']"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
