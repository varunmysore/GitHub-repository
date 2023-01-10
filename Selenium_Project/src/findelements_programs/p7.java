package findelements_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//bbc.com count of links,text box...
public class p7 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launches the chrome browser
		WebDriver driver = new ChromeDriver();
		// maximizes window//
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int a = links.size();
		System.out.println(a);
		List<WebElement> textbox = driver.findElements(By.xpath("//input[@type='text']"));
		int b = textbox.size();
		System.out.println(b);
		List<WebElement> listbox = driver.findElements(By.xpath("//select"));
		int c = listbox.size();
		System.out.println(c);
		List<WebElement> button = driver.findElements(By.xpath("//input[@type='button']"));
		int d = button.size();
		System.out.println(d);
	}

}
