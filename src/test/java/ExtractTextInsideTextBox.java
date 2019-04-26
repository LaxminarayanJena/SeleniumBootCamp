import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtractTextInsideTextBox {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ffffff");
		
		String txt=driver.findElement(By.xpath("//input[@type='email']")).getAttribute("value");
		System.out.println(txt);
		

	}

}
