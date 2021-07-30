package ilab.librarys;

import java.util.Random;

import org.openqa.selenium.By;

import utils.AppUtils;

public class Apply_Online extends AppUtils{

	public boolean applicationdata(String name,String email){
		
		driver.findElement(By.linkText("CAREERS")).click();
		driver.findElement(By.partialLinkText("Africa")).click();
		driver.findElement(By.xpath("/html/body/section/div[2]/div/div/div/div[3]/div[2]/div/div/div/div/div/div[1]/div[1]/div[2]/div[1]/a")).click();
		driver.findElement(By.partialLinkText("Apply")).click();
		driver.findElement(By.id("applicant_name")).sendKeys(name);
		driver.findElement(By.id("email")).sendKeys(email);
		Random generator = new Random();
        
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
         
        num1 = generator.nextInt(600) + 100;
        num2 = generator.nextInt(641) + 100;
        num3 = generator.nextInt(8999) + 1000; 
         
        String s = num1 + " " + num2 + " " + num3;
        driver.findElement(By.id("phone")).sendKeys(s);
        
        driver.findElement(By.id("wpjb_submit")).click();
        if(driver.findElement(By.xpath("//*[@id='wpjb-apply-form']/fieldset[1]/div[5]/div/ul/li")).isDisplayed())
        {
        	return true;
		}else
		{
			return false;
		}
	}
}
