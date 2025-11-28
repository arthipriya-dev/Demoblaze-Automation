import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class product_test {

	public static void main(String[] args) {
		//To locate categories section
				Actions action=new Actions(driver);
				WebElement item=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Laptops']")));
				action.moveToElement(item).click().build().perform();
				
				//To locate Laptop product
				WebElement sony=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Sony vaio i5']")));
				action.moveToElement(sony).click().build().perform();
				
				//To verify Laptop product page
				WebElement sonyname=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[normalize-space()='Sony vaio i5']")));
				String sprod=sonyname.getText();
				if(sprod.equals("Sony vaio i5"))
				{
					System.out.println("Product is same");
				}
				else
				{
					System.out.println("Product is not same");
				}
		// TODO Auto-generated method stub

	}

}
