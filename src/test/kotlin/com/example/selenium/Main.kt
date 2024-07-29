package com.example.selenium

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import java.util.concurrent.TimeUnit


fun main() {
    // Set the path to the chromedriver executable
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gaming 15\\Downloads\\Compressed\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe")

    // Initialize the ChromeDriver
    val driver: WebDriver = ChromeDriver()

    // Open a website
    driver.get("https://www.google.com")

    // Find the search box using its name attribute
    val searchBox: WebElement = driver.findElement(By.name("q"))

    // Enter text into the search box
    searchBox.sendKeys("Kotlin and Selenium")

    // Submit the search form
    searchBox.submit()

    // Wait for the results to load and display the title
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
    println("Page title is: ${driver.title}")

    // Close the browser
    driver.quit()
}