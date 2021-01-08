package NewTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest {

	@Test
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/ubuntu/selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://18.222.210.105:8888/");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        
        driver.findElement(By.className("v-button")).click();
        driver.findElement(By.id("gwt-uid-5")).sendKeys("Ananthu36");
        driver.findElement(By.id("gwt-uid-7")).sendKeys("Edureka1");
        driver.findElement(By.id("gwt-uid-9")).sendKeys("9894828235");
        driver.findElement(By.id("gwt-uid-11")).sendKeys("ananthu.siva05@gmail.com");
        driver.findElement(By.id("gwt-uid-13")).sendKeys("01/01/2021");
		driver.findElement(By.className("v-button-primary")).click();

	}

}
