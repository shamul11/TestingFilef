import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class NewTest {

	@Test
	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		 driver.get("http://yahoo.com");

	}

}
