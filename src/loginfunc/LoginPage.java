package loginfunc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage 
{
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver" ,
				"D:\\driver\\drivers\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://z3t0c9.csb.app/");
		
		
	  //Thread.sleep(3000);
	  
	  WebElement email= driver.findElement(By.xpath ("//input[@type='text']"));
	  email.sendKeys("deorevicky75@gmail.com");
	  

	  WebElement Password= driver.findElement(By.xpath ("//input[@type='password']"));
	  Password.sendKeys("311510");
	  
	  WebElement submitButton= driver.findElement(By.xpath ("//button[text()='Submit']"));
	  submitButton.click();
	  
	  
	  
	  
	}


}
