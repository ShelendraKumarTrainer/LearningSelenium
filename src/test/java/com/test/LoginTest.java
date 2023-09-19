package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

	ChromeDriver driver;

	@Test
	public void loginWithValidUserNameAndValidPassowrd() {

		// Enter username
		driver.findElement(By.name("username")).sendKeys("Admin");

		// Enter password
		driver.findElement(By.name("password")).sendKeys("admin123");

		// Click on Login button.
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}

	@Test
	public void loginWithValidUserNameAndInValidPassowrd() {
		// Enter username
		driver.findElement(By.name("username")).sendKeys("Admin");

		// Enter password
		driver.findElement(By.name("password")).sendKeys("testPassword");

		// Click on Login button.
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}

	@Test
	public void loginWithInValidUserNameAndValidPassowrd() {
		// Enter username
		driver.findElement(By.name("username")).sendKeys("testUser");

		// Enter password
		driver.findElement(By.name("password")).sendKeys("admin123");

		// Click on Login button.
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}

	@Test
	public void loginWithInValidUserNameAndInValidPassowrd() {
		// Enter username
		driver.findElement(By.name("username")).sendKeys("testUser");

		// Enter password
		driver.findElement(By.name("password")).sendKeys("testPassword");

		// Click on Login button.
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}

}
