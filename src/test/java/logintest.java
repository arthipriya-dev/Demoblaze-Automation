
package com.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Project {
	public static Logger log = LogManager.getLogger(Project.class);
	public static void main(String[] args) throws InterruptedException
	{
		// Login Section
		
		String username="Venkata";
		String password="Venkata4@";
		String loginname="Welcome Venkata";
		String product_name="Sony vaio i5";
		WebDriver driver = new ChromeDriver();
		Wait<WebDriver> wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		driver.get("https://demoblaze.com/");
		log.info("Launching browser and navigating to DemoBlaze");
		WebElement login1 = driver.findElement(By.id("login2"));
		login1.click();
		Thread.sleep(5000);
		WebElement uname =driver.findElement(By.id("loginusername"));
		uname.sendKeys(username);
		WebElement passwd=driver.findElement(By.id("loginpassword"));
        passwd.sendKeys(password);
        WebElement loginbtn = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
        loginbtn.click();
        
        //Verify Login
        
		WebElement u_name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser")));
        String welcome = u_name.getText();
        if(welcome.equals(loginname))
        {
        	System.out.println("Login Successful");
        }
        else
        {
        	System.out.println("Login unsuccessful");
        } 