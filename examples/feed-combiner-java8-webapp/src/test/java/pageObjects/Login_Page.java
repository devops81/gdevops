package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
	private static WebElement element = null;

	public static WebElement hlink_ContactUs(WebDriver driver) {

		element = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[4]/a"));

		return element;
	}

	public static WebElement hlink_Home(WebDriver driver) {

		element = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[1]/a"));

		return element;
	}

	public static WebElement hlink_NewsletterSuscription(WebDriver driver) {

		element = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[5]/a"));

		return element;
	}

	public static WebElement hlink_Services(WebDriver driver) {

		element = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[2]/a"));

		return element;
	}
	
	public static WebElement field_Email(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@id='name']"));

		return element;
	}

	public static WebElement hlink_GenpactLogo(WebDriver driver) {

		element = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img"));

		return element;
	}

	public static WebElement hlink_About(WebDriver driver) {

		element = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/ul/li[3]/a"));

		return element;
	}

	public static WebElement about_Framework(WebDriver driver) {

		element = driver.findElement(By.xpath("//*[@id='about']/div/div/div[1]/h3"));

		return element;

	}

	public static WebElement des_ContactUs(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='contact']/div/div/div[2]/address/h3"));
		return element;
	}

	public static WebElement btn_SighUp(WebDriver driver) {
		element = driver.findElement(By.id("submit"));
		return element;
	}
	
}
