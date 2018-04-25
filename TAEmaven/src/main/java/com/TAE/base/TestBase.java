package com.TAE.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	//Global variables
	public static WebDriver driver;
	public static Properties prop;

	//Constructor
	public TestBase(){
		//Retrieve and read contents from properties file
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:\\Users\\prn99\\git" 
			+ "\\TAEmaven\\TAEmaven\\src\\main\\java\\com\\TAE\\config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

	}
	}
		//Initialising the browser
		public static void initializeBrowser() {
			
			String browserName = prop.getProperty("browser");
			if (browserName.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\prn99\\chromedriver.exe" );
				driver = new ChromeDriver();
			} else if (browserName.equals("firefox")){
				System.setProperty("webdriver.gecko.driver","firefoxDriverPath");
			}
			
			driver.get(prop.getProperty("url"));

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
		}


	
		
	}

