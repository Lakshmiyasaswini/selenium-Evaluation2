package Assessment2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationteststore {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://automationteststore.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement apparelAccessories = driver.findElement(By.linkText("  Apparel & accessories"));
		apparelAccessories.click();
		Thread.sleep(2000);
		
		WebElement tshirt = driver.findElement(By.linkText("    T-shirts"));
		tshirt.click();
		Thread.sleep(2000);
		
		WebElement thirdshrit = driver.findElement(By.cssSelector(".fixed_wrapper .productname"));
		thirdshrit.click();
		Thread.sleep(2000);
		
		WebElement colourdropdown = driver.findElement(By.id("option350"));
		colourdropdown.sendKeys("white");
		Thread.sleep(2000);
		
		WebElement sizedropdown = driver.findElement(By.id("option351"));
		sizedropdown.sendKeys("medium");
		Thread.sleep(2000);
		
		WebElement quantity = driver.findElement(By.id("product_quantity"));
		quantity.sendKeys("2");
		Thread.sleep(2000);
		
		WebElement Addtocart = driver.findElement(By.cssSelector(".cart"));
		Addtocart.click();
		Thread.sleep(2000);
		
		WebElement Checkoutbutton = driver.findElement(By.id("cart_checkout1"));
		Checkoutbutton.click();
		Thread.sleep(2000);
		
		WebElement guestcheckoutRadio = driver.findElement(By.id("accountFrm_accountguest"));
		guestcheckoutRadio.click();
		Thread.sleep(2000);
		
		WebElement continuebutton = driver.findElement(By.cssSelector("title='Continue'"));
		continuebutton.click();
		Thread.sleep(2000);
		
		

	}

}
