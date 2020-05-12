package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

public class selenuim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.marionette","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		driver = new ChromeDriver();
		driver.get("https://weibo.com/login.php?url=https%3A%2F%2Fwww.baidu.com%2F%3Fc%3Dspr_web_mthz_sogoumz_weibo_t001");
		driver.findElement(By.tagName("input")).sendKeys("99xiaobei@sina.com");
		driver.findElement(By.name("password")).sendKeys("sss");
		driver.findElement(By.id("auto-signin")).click();
//		driver.findElement(By.linkText("Á¢¼´×¢²á"))¡£click();
		driver.findElement(By.className("btn-red")).click();
	}

}
