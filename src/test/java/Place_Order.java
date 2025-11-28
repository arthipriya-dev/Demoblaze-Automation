import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Place_Order {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		//log.info("Launching browser and navigating to Demoblazer");
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebDriverWait cwait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// TODO Auto-generated method stub
		WebElement name =cwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"name\"]")));
		//*[@id="name"]
		name.sendKeys("arthi");	

		WebElement contry =cwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"country\"]")));
		contry.sendKeys("India");	

		WebElement city =cwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"city\"]")));
		city.sendKeys("Salem");

		WebElement credit =cwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"card\"]")));
		credit.sendKeys("56789");

		WebElement month =cwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"month\"]")));
		month.sendKeys("11");

		WebElement year =cwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"year\"]")));
		year.sendKeys("2025");

		//purchase click
		WebElement pur =cwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")));		
		pur.click();	
		
		WebElement ok =cwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[10]/div[7]/div/button")));		
		ok.click();

	}

}
