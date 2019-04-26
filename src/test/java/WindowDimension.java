import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDimension {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		Dimension d = new Dimension(800,480);
		driver.manage().window().setSize(d);
		        
		        
		driver.get("http://ww.google.com");
		System.out.println("hello");

	}

}
