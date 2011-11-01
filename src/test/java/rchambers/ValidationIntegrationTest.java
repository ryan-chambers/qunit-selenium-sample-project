package rchambers;

import java.util.List;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidationIntegrationTest {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
	}

	@Test
	public void testFormsIntegration() throws Exception {
		driver.get("http://localhost:8080/validation.html");
		assertPageIsLoaded();
		List<WebElement> failedElements = driver.findElements(By.xpath("//span[@class='fail']"));
		Assert.assertEquals(0, failedElements.size());
	}

	private void assertPageIsLoaded() {
		driver.findElement(By.id("qunit-header"));
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
	}
}