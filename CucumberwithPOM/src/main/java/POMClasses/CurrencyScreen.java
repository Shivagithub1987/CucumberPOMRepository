package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CurrencyScreen {
	
	WebDriver driver;
	//public WebElement lbl_val_i;

	public CurrencyScreen(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this );
	}
	
	@FindBy(id="lbl_val_1")
	public WebElement lbl_val_1;
	
	@FindBy(id="lbl_val_2")
	public WebElement lbl_val_2;
	
	@FindBy(id="lbl_val_3")
	public WebElement lbl_val_3;
	
	@FindBy(id="lbl_val_4")
	public WebElement lbl_val_4;
	
	@FindBy(id="lbl_val_5")
	public WebElement lbl_val_5;
	
	@FindBy(id="lbl_ttl_val")
	public WebElement lbl_ttl_val;
	
	@FindBy(id="txt_val_1")
	public WebElement txt_val_1;
	
	@FindBy(id="txt_val_2")
	public WebElement txt_val_2;
	
	@FindBy(id="txt_val_3")
	public WebElement txt_val_3;
	
	@FindBy(id="txt_val_4")
	public WebElement txt_val_4;
	
	@FindBy(id="txt_val_5")
	public WebElement txt_val_5;
	
	@FindBy(id="txt_ttl_val")
	public WebElement txt_ttl_val;
	
	public void typelblval1(String labelval1 )
	
	{
		lbl_val_1.sendKeys(labelval1);	
	}
	
    public void typelblval2(String labelval2 )
	
	{
		lbl_val_2.sendKeys(labelval2);	
	}
    
    public void typelblval3(String labelval3 )
	
  	{
  		lbl_val_3.sendKeys(labelval3);	
  	}
    
public void typelblval4(String labelval4 )
	
	{
		lbl_val_4.sendKeys(labelval4);	
	}
    
    public void typelblval5(String labelval5 )
	
  	{
  		lbl_val_5.sendKeys(labelval5);	
  	}
    
 public void typelblttlval(String lblttlval )
	
  	{
	 lbl_ttl_val.sendKeys(lblttlval);	
  	}
    
    
    
public void typetxtval1(String textval1 )
	
	{
	txt_val_1.sendKeys(textval1);	
	}
    
    public void typetxtval2(String textval2 )
	
  	{
    	txt_val_2.sendKeys(textval2);	
  	}
    
 public void typetxtval3(String textval3 )
	
  	{
    	txt_val_3.sendKeys(textval3);	
  	}
 
 public void typetxtval4(String textval4 )
	
	{
 	txt_val_4.sendKeys(textval4);	
	}
	
 public void typetxtval5(String textval5 )
	
	{
 	txt_val_5.sendKeys(textval5);	
	}
 public void typetxtttlval(String txtttlval )
 {
	 txt_ttl_val.sendKeys(txtttlval);
 }
	
	public void Currencylabelvalue(String labelval1,String labelval2,String labelval3,String labelval4,String labelval5,String lblttlval) {
		
		typelblval1(labelval1);
		typelblval2(labelval2);
		typelblval3(labelval3);
		typelblval4(labelval4);
		typelblval5(labelval5);
		typelblttlval(lblttlval);
		
			
	}
	
	public void Currencytextvalue(String textval1,String textval2,String textval3,String textval4,String textval5,String txtttlval)
	{
		typetxtval1(textval1);
		typetxtval2(textval2);
		typetxtval3(textval3);
		typetxtval4(textval4);
		typetxtval5(textval5);
		typetxtttlval(txtttlval);
		
		
	}
	
}

