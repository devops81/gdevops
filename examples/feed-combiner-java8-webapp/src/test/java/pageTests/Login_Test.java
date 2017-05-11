package QAAutomationImpl.unittest;

import pageObjects.Login_Page;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;

public class Login_Test {
	private static WebDriver driver = null;
	public String[] invalidChars = { "#", "!", "$", "@", "%", "^", "&" };

	@DataProvider(name = "Authentication")

	public static Object[][] credentials() {

		return new Object[][] { { "400218542", "sa" }, { "testuser_2", "Test@123" }, { "400218542", "" },
				{ "", "sa" } };

	}

	@Test
	public void Validate_PageIsLoadedOrNOt() {
		assertEquals(driver.getTitle(), "IntelliGen Framework Genpact");

	}

	@Test
	public void Validate_IfLogoIsDisplayedorNot() throws InterruptedException {
		assertTrue(Login_Page.hlink_GenpactLogo(driver).isDisplayed());
	}

	@Test
	public void Validate_IfAboutLinkIsEnable() throws InterruptedException {
		Login_Page.hlink_About(driver).click();
		Thread.sleep(2000);
		assertTrue(Login_Page.about_Framework(driver).isDisplayed());
	}

	@Test
	public void Validate_IfContactusEnabled() throws InterruptedException {
		Login_Page.hlink_ContactUs(driver).click();
		Thread.sleep(2000);
		assertTrue(Login_Page.des_ContactUs(driver).isDisplayed());
	}
	
	@Test
	public void Validate_IfEmailExists() throws InterruptedException {
		//Login_Page.field_Email(driver).click();
		Thread.sleep(2000);
		assertTrue(Login_Page.field_Email(driver).isDisplayed());
	}

	@Test
	public void Validate_IfNewsletterLinkisEnabled() throws InterruptedException {
		Login_Page.hlink_NewsletterSuscription(driver).click();
		Thread.sleep(2000);
		assertTrue(Login_Page.btn_SighUp(driver).isDisplayed());
	}
	@BeforeMethod
	public void beforeMethod() {
		File file = new File("C:/Driver/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		driver = new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/JenkinSlave/workspace/Banking Scorecard Build_Dev/examples/feed-combiner-java8-webapp/src/main/webapp/index.html");
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
