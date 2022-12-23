package com.amicable.selenium.MyFirstTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

@RunWith(JUnit4.class)
public class MyFirstTest {

   @Before
   public void setup(){
       System.setProperty("webdriver.chrome.driver", "");
   }

        @Test
        public void runMyBrowser(){
            ChromeDriver chromeDriver = new ChromeDriver();
            chromeDriver.get("https://www.google.co.uk/");

        }



    @Test
    public void myFirstTest() throws Exception {
        ArrayList<String> numberArray = new ArrayList<String>();
        numberArray.add("amicable");    //0
        numberArray.add("two");    //1
        numberArray.add("three");
        numberArray.add("four");
        numberArray.add("five");
        numberArray.add("six");
        numberArray.add("seven");
        numberArray.add("eight");
        numberArray.add("nine");   //8

        System.out.println((numberArray.get(1)));

      for (int i = 0; i < 10; i++){
          System.out.println(i);

          for (int i = 0; i < 9; i++ ){
              System.out.println(numberArray.get(i));

          }


          Assert.assertEquals(numberArray.get(0), actual:"amicable");
      }

    }

}
