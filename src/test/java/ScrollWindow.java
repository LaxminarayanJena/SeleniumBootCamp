import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollWindow {

	public static void main(String[] args) {
		
WebDriver driver= new ChromeDriver();
	
driver.manage().window().maximize();
		        
		        
		driver.get("https://stackoverflow.com/questions/12293158/page-scroll-up-or-down-in-selenium-webdriver-selenium-2-using-java");		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("window.scrollBy(0,250)", "");
		

		jse.executeScript("scroll(0, 8000);");
		//scroll down
		
	}

}
