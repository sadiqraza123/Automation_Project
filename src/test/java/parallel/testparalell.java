package parallel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testparalell {


   @Test
    public void test1(){

       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.google.com/");
       driver.close();


      // System.out.println("This is test1 "+Thread.currentThread().getId());
   }

   @Test
    public void test2(){

       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.selenium.dev/");
       driver.close();

       //System.out.println("This is test2 "+Thread.currentThread().getId());
   }
}
