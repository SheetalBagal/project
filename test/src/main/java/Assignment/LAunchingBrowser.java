package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LAunchingBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/index.htm");
		
		ChromePage chromepage= new ChromePage(driver);
		chromepage.library();
		
		
		
		PythonTehno pythontehno= new PythonTehno(driver);
		pythontehno.python();
		
		pythontehno.categories();
		
		pythontehno.Analytics();
	}

}
