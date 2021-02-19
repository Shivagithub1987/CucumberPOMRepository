package stepdefinitions;

import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMClasses.CurrencyScreen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CurrencySteps {
	int Count =0;
	float amtfloat1,amtfloat2,amtfloat3,amtfloat4,amtfloat5;
	String amt1,amt2,amt3,amt4,amt5;
	String amttotal;
	float amttotalfloat;
	CurrencyScreen cs = new CurrencyScreen(null);

	@Given("Login to currency screen")
	public void login_to_currency_screen() {
		
		System.out.println("Login to Currency Screen");
	  
		 System.setProperty("webdriver.chrome.driver",
				  "C:\\Users\\shivavelde\\webdriver\\chromedriver_win32\\chromedriver.exe");
				 WebDriver driver = new ChromeDriver();
				  driver.get("https://www.exercisel.com/values");
		
		
	}

	@When("Check the values availability on the screen")
	public void check_the_values_availability_on_the_screen() {
		
		boolean bool1;
		
		int i=1;
		
			switch(i)
			{
			
			case 1:
				bool1 =cs.lbl_val_1.isDisplayed();
			
			 Count++;
			 boolean bool2=cs.lbl_val_2.isDisplayed();
			 Count++;
			 boolean bool3=cs.lbl_val_2.isDisplayed();
			 Count++;
			 boolean bool4=cs.lbl_val_2.isDisplayed();
			 Count++;
			 boolean bool5=cs.lbl_val_2.isDisplayed();
			 Count++;	
			 
			 break;
			 
			case 2:
				System.out.println("No case to prinnt");
				break;
				}
			}
	
		

	@Then("Check the right count of values appearance on the screen")
	public void check_the_right_count_of_values_appearance_on_the_screen() {
		
		System.out.println("Here it is to verify the right count of values: ");
		boolean b1 =AssertJUnit.assertEquals(Count,5);
		if(b1==true) {
			System.out.println("Right count of values are appeared on screen");
		}
		else
		{
			System.out.println("Count is not correct");
			}
		
		    
	}

	@When("Check the amounts availability on the screen")
	public void check_the_amounts_availability_on_the_screen() {
	    
     amt1= cs.txt_val_1.getText();
    if(cs.txt_val_1.size()!= 0){
    	System.out.println("Element is Present");
    	}else{
    	System.out.println("Element is Absent");
    	}    
    String amt1nodollar= amt1.substring(1);
     amtfloat1=Float.parseFloat(amt1nodollar); 
    
     amt2 = cs.txt_val_2.getText();
    if(cs.txt_val_2.size()!= 0){
    	System.out.println("Element is Present");
    	}else{
    	System.out.println("Element is Absent");
    	}
    String amt2nodollar=amt2.substring(1);
     amtfloat2=Float.parseFloat(amt2nodollar);
    
     amt3=cs.txt_val_3.getText();
    if(cs.txt_val_3.size()!= 0){
    	System.out.println("Element is Present");
    	}else{
    	System.out.println("Element is Absent");
    	}
    String amt3nodollar=amt3.substring(1);
     amtfloat3=Float.parseFloat(amt3nodollar);
    
     amt4 = cs.txt_val_4.getText();
    if(cs.txt_val_4.size()!= 0){
    	System.out.println("Element is Present");
    	}else{
    	System.out.println("Element is Absent");
    	}
    String amt4nodollar=amt4.substring(1);
     amtfloat4=Float.parseFloat(amt4nodollar);
    
     amt5=cs.txt_val_5.getText();
    if(cs.txt_val_5.size()!= 0){
    	System.out.println("Element is Present");
    	}else{
    	System.out.println("Element is Absent");
    	}
    String amt5nodollar=amt5.substring(1);
     amtfloat5=Float.parseFloat(amt5nodollar);
        
    
    
	}

	@Then("Check the amounts appeared are greater than 0")
	public void check_the_amounts_appeared_are_greater_than() {
		
		boolean b2=amtfloat1>0&&amtfloat2>0&&amtfloat3>0&&amtfloat4>0&&amtfloat5>0;
		if (b2=true)
		{
		System.out.println("Amount appeared on screen are positive");	
		}
		else
		{
			System.out.println("Amount are not positive");
			}
		
	    
	}

	@When("Check the total balance field is appeared")
	public void check_the_total_balance_field_is_appeared() {
	  
		boolean b3 =cs.lbl_ttl_val.isDisplayed();
		if (b3=true)
		{
			System.out.println("total balance field is displayed");
		}
		else
		{
			System.out.println("Total balance field is not displayed");
		}
	}

	@Then("Check the total balance is correct")
	public void check_the_total_balance_is_correct() {
	
		 amttotal = cs.txt_ttl_val.getText();
		String amttotalnodollar=amttotal.substring(1);
		 amttotalfloat= Float.parseFloat(amttotalnodollar);
		amttotalfloat=amtfloat1+amtfloat2+amtfloat3+amtfloat4+amtfloat5;
		boolean b4 =AssertJUnit.assertEquals(amttotalfloat, 1000000.00);
		if(b4=true)
		{
			System.out.println("Total balance is correct");
		}
		else
		{
			System.out.println("Total balance is not correct");
		}
	  
	}

	@When("Check all the amounts appeared")
	public void check_all_the_amounts_appeared() {
		System.out.println("To check all the amounts are appeared");
		
	}
	

	@Then("Check the amounts are prefixed with dollar symbol")
	public void check_the_amounts_are_prefixed_with_dollar_symbol() {
	   
		
		boolean b5=amt1.startsWith("$");
	    if(b5=true)
	    {
	    	System.out.println("US dollar amount displayed");
	    }
	    else
	    {
	    	System.out.println("Amount is not prefixed with USD");
	    }
	    boolean b6=amt2.startsWith("$");
	    if(b6=true)
	    {
	    	System.out.println("US dollar amount displayed");
	    }
	    else
	    {
	    	System.out.println("Amount is not prefixed with USD");	    }
		
	boolean b7=amt3.startsWith("$");
	if(b7=true)
	{
		System.out.println("US dollar amount displayed");
    }
    else
    {
    	System.out.println("Amount is not prefixed with USD");	    }
	
	boolean b8=amt4.startsWith("$");
	if(b8=true)
	{
		System.out.println("US dollar amount displayed");
    }
    else
    {
    	System.out.println("Amount is not prefixed with USD");	    }
	
	
	boolean b9=amt5.startsWith("$");
	if(b9=true)
	{
		System.out.println("US dollar amount displayed");
    }
    else
    {
    	System.out.println("Amount is not prefixed with USD");	    }
	
	boolean b10=amttotal.startsWith("$");
	if(b10=true)
	{
		System.out.println("Total amount in USD is displayed");
	}
	else
	{
		System.out.println("Amount is not prefixed with USD");
		
	}
		
	}

	@Then("Check Total matches with summation of all the amounts")
	public void check_total_matches_with_summation_of_all_the_amounts() {
		
		amttotalfloat=amtfloat1+amtfloat2+amtfloat3+amtfloat4+amtfloat5;
		boolean b4 =AssertJUnit.assertEquals(amttotalfloat, 1000000.00);
		if(b4=true)
		{
			System.out.println("Total balance is correct");
		}
		else
		{
			System.out.println("Total balance is not correct");
		}
	    
		
	}






}
