package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Bharath Nandan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//Open Application
		driver.get("http://demowebshop.tricentis.com/");
		
		//Click on Register Link
		 driver.findElement(By.linkText("Register")).click();
		 
		 //Click on Gender - Female
		 driver.findElement(By.id("gender-female")).click();
		 //driver.findElement(By.name("))
		 
         //Enter firstname
		 driver.findElement(By.name("FirstName")).sendKeys("Bharath");
		 
	     // Enter lastname
		 driver.findElement(By.name("LastName")).sendKeys("Nandan");
		 
		 //Enter Phone number
		 //driver.findElement(By.name("phone")).sendKeys("9550601784");
		 
		 // Enter Email
		 driver.findElement(By.name("Email")).sendKeys("bharath04@gmail.com");
		 
		 // Enter password
		 driver.findElement(By.name("Password")).sendKeys("Charlie004");
		 
		 // Enter confirm password
		 driver.findElement(By.name("ConfirmPassword")).sendKeys("Charlie004");
		 
		 // Click on Register
		 driver.findElement(By.id("register-button")).click();
		 
		 //Close Browser
		 //driver.close();


	}

}
