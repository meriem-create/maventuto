package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\benmo\\Desktop\\JARS\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		 System.out.println("open selenium website");
		 
	Thread.sleep(1000); 
	driver.close();
	 System.out.println("close selenium website");
		 
	} 

}
