package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Softwares\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		// Script To Maximized Browser Window
		driver.manage().window().maximize();

		// Script To Delete Browser Cookies
		driver.manage().deleteAllCookies();
		// Script to get Title of the page
		String x = driver.getTitle();
		System.out.println(x);
		// Script to get URL of the page
		String PUrl;
		PUrl = driver.getCurrentUrl();
		System.out.println(PUrl);
	}

}
