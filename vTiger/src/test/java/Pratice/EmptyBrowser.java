package Pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EmptyBrowser {
	public static void main(String[] args) {
		// sets the path for chromedriver
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Workspace\\vTiger\\src\\main\\resources\\chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		
		String key="webdriver.gecko.driver";
		String value="D:\\Selenium_Workspace\\vTiger\\src\\main\\resources\\geckodriver.exe";
		System.setProperty(key, value);
		WebDriver driver1=new FirefoxDriver();
		
		
	}
}
