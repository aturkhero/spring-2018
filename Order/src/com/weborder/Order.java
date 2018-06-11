package com.weborder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;



public class Order {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		
		int  n = rand.nextInt(100) + 1;
		
		String str="";
		str+=n;
		
		
		System.setProperty("webdriver.chrome.driver","/Users/jackturkhero/Selenium Dependencies/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
		
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
		
		driver.findElement(By.name("ctl00$MainContent$login_button")).click();
		
		driver.findElement(By.linkText("Order")).click();
		
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).sendKeys(str);
		
		str="John ";
		
		
		for(int i=0;i<10;i++) {
			
			n = rand.nextInt(25);
			
			switch(n) {
			
			case 0: str+="a";break;
			case 1: str+="b";break;
			case 2: str+="c";break;
			case 3: str+="d";break;
			case 4: str+="e";break;
			case 5: str+="f";break;
			case 6: str+="g";break;
			case 7: str+="h";break;
			case 8: str+="i";break;
			case 9: str+="j";break;
			case 10: str+="k";break;
			case 11: str+="l";break;
			case 12: str+="m";break;
			case 13: str+="n";break;
			case 14: str+="o";break;
			case 15: str+="p";break;
			case 16: str+="q";break;
			case 17: str+="r";break;
			case 18: str+="s";break;
			case 19: str+="t";break;
			case 20: str+="u";break;
			case 21: str+="v";break;
			case 22: str+="w";break;
			case 23: str+="x";break;
			case 24: str+="y";break;
			case 25: str+="z";break;
				
			}
			
		}
		
		str+=" Smith";
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName")).sendKeys(str);
		
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2")).sendKeys("123 Any st");
		
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3")).sendKeys("Anytown");
		
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4")).sendKeys("Virginia");
		
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3")).sendKeys("Anytown");

		n = rand.nextInt(2);
		
		String id="ctl00_MainContent_fmwOrder_cardList_";
		
		id+=n;
		
		driver.findElement(By.id(id)).click();
		
		String cardnum="";
		
		if(n==0) {
			
			cardnum+=4;
			for(int i=0;i<15;i++) {
				
				n = rand.nextInt(9);
				
				cardnum+=n;
					
				}
			
			
		}else if(n==1) {
			
			cardnum+=5;
			for(int i=0;i<15;i++) {
				
				n = rand.nextInt(9);
				
				cardnum+=n;
					
				}
			
		}else {
			
			cardnum+=3;
			
			for(int i=0;i<14;i++) {
				
				n = rand.nextInt(9);
				
				cardnum+=n;
					
			}
		}
		
		
		
		
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys(cardnum);
		
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys("02/20");
		
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5")).sendKeys("95123");
		
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
		
//		driver.findElement(By.xpath("\n" + 
//				"                    New order has been successfully added.\n" + 
//				"                ")).;
		
		
		String actual = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder\"]/tbody/tr/td/div/strong"))
                .getText();
		
		if(actual.equals("New order has been successfully added.")) {
			System.out.println("Test is succesful");
		}
		
		
		
		
	}

}
