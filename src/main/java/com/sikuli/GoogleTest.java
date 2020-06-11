package com.sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.Assert;

public class GoogleTest {

	public static void main(String[] args) throws Exception {

		
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		//create an object of screen class --sikuli
				Screen s= new Screen();
				
				Pattern gs=new Pattern("googlesearch.png");
				s.wait(gs, 20000);
				s.click();
				
				Pattern gsymbol=new Pattern("googlesymbol.png");
					Match res = s.exists(gsymbol, 5000);
					double mv = res.getScore()*100.00;
					System.out.println(mv);
					int r=(int)mv;
					System.out.println(r);
					Assert.assertEquals(99, r);
					
					driver.close();
					
						
				
				
	}

}
