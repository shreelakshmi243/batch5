package sday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class csslocotor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sunil\\eclipse-workspace\\training\\src\\test\\resources\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjkwMDM2MTkzLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		driver.manage().window().maximize();

		WebElement username=driver.findElement(By.cssSelector("input[id='email']"));
		WebElement password=driver.findElement(By.cssSelector("input[id='pass']"));
		WebElement login=driver.findElement(By.cssSelector("button[	name='login']"));
		username.sendKeys("8310600445");
		password.sendKeys("daddyvj");
		login.click();
		
		
	}
	
}
