package sday7and8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class draganddrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.chrome.driver","C:\\Users\\Sunil\\eclipse-workspace\\training\\src\\test\\resources\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
List<WebElement> captials=driver.findElements(By.xpath("//div[contains(@id,'dropContent')]/div"));
for(WebElement e:captials)
{
	
	System.out.println(e.getText());
}
	
	List<WebElement> co=driver.findElements(By.xpath("//div[contains(@id,'countries')]/div"));
	for(WebElement e:co)
	{
		
		System.out.println(e.getText());

}
}
}