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
		
		
		//to automate flash elements on app
		//it works on based on images
		//
		
		//create an object of screen class --sikuli
		Screen s= new Screen();
		
		Pattern play=new Pattern("play.png");
		
		s.wait(play, 20000);
		s.click();
		s.click();
		
		Pattern settings=new Pattern("settings.png");
		s.wait(settings, 5000);
		s.click();
		
		Pattern quality=new Pattern("quality.png");
		s.wait(quality, 5000);
		s.click();
		
		Pattern pix=new Pattern("360p.png");
		s.wait(pix, 5000);
		s.click();
		
		
		
		
		
	}

}
