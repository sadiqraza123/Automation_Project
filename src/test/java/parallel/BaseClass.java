package parallel;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {

    //public static void main(String[] args) throws InterruptedException {


        @Test
        public void test1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("cricket bat grip kids"+ Keys.ENTER);
        JavascriptExecutor executor =  (JavascriptExecutor)driver;
        executor.executeScript("window.scrollBy(0,4000)");
        Thread.sleep(4000);
        driver.close();

    }


}
