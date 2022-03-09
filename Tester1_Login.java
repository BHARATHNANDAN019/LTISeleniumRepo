package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch chrome browser
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Bharath Nandan\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				//Open Application
				driver.get("http://demowebshop.tricentis.com/");
				
				//To maximize the page
				driver.manage().window().maximize();
				
				//Click on Login
				driver.findElement(By.linkText("Log in")).click();
				
				//Enter email
				driver.findElement(By.name("Email")).sendKeys("Charlie004@gmail.com");
				
				//Enter Password
				driver.findElement(By.name("Password")).sendKeys("Charlie004");
				
				//Click on Remember Button
				driver.findElement(By.xpath("//input[@value='true']")).click();
				
				//Click on Login
				//driver.findElement(By.name("submit")).click();	
				driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

}
