package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase01 {

	public static void main(String[] args) {

		
		WebDriver driver = null;
		CurrencyScreen cs = new CurrencyScreen(driver);
		cs.Currencylabelvalue("Value1","Value2","Value3","Value4","Value5","Total Balance");
		cs.Currencytextvalue("$122365.24", "$599.00", "$850139.99", "$23329.50", "$566.2","$1000000.00");
		
			
		
		driver.quit();
		
		
		
		
		
		
		
		
	}

}
