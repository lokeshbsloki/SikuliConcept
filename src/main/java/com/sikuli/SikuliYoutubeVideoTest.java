package com.sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliYoutubeVideoTest {

	public static void main(String[] args) throws FindFailed {

		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.youtube.com/watch?v=OtQAMoXYqes");
		
		//create an object of screen class --sikuli
		Screen s= new Screen();
		
		Pattern play=new Pattern("play.png");
		
		s.wait(play, 20000);
		s.click();
		s.click();
		
		
		
		
	}

}
