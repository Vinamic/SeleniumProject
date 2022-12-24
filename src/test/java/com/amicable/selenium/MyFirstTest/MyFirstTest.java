package com.amicable.selenium.MyFirstTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

@RunWith(JUnit4.class)
public class MyFirstTest {

  ChromeDriver chromeDriver
   @Before
   public void setup(){
       System.setProperty("webdriver.chrome.driver", "");
       chromeDriver.get("https://amaninja-concept2.myshopify.com/password");

   }
        @Test
        public void runMyBrowser(){
            chromeDriver = new ChromeDriver();
            chromeDriver.get("https://www.google.co.uk/");

          @Test
          public void myFirstTest() throws Exception {
              WebElement titleElement = chromeDriver.findElement(By.xpath(xpathExpession: "/html"
              String titleText = titleElement.getText();

              Assert.assertEquals(titleText, "Amaninja-concept2");

            @Test
            public void myFirstTest() throws Exception {
            WebElement passwordField= chromeDriver.findElement(By.id("password"));
            passwordField.sendKeys("anything!!");
            Thread.sleep(5000);
      }

           @After
           public void exitChrome(){
                chromeDriver.quit();

                }


 }



