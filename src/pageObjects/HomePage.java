package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
//================ Home Page Web Elements ====================================================================	
	@FindBy(xpath = "//a[contains(text(),'Log in')]") 
	private WebElement link_Login;
	
	@FindBy(xpath = "//input[@id='routeSelection_DepartureStation-input']") 
	private WebElement input_DepartStation;
	
	@FindBy(xpath = "//input[@id='routeSelection_ArrivalStation-input']") 
	private WebElement input_ArrivalStation;
	
	@FindBy(xpath = "//input[@id='dateSelection_OutboundDate-datepicker']") 
	private WebElement input_DepartureDate;
	
	@FindBy(xpath = "//input[@id='dateSelection_IsReturnFlight-datepicker']") 
	private WebElement input_ArrivalDate;
	
	@FindBy(xpath = "//div[@class='selectfield babies']//child::input") 
	private WebElement inputBabies;
	
	@FindBy(xpath = "//div[@class='selectfield babies']//child::button[@class='button button-secondary decrease']") 
	private WebElement numBabiesDec;
	
	@FindBy(xpath = "//div[@class='selectfield babies']//child::button[@class='button button-secondary increase']") 
	private WebElement numBabiesInc;
	
	@FindBy(xpath = "//div[@class='selectfield children']//child::input") 
	private WebElement inputChildren;
	
	@FindBy(xpath = "//div[@class='selectfield children']//child::button[@class='button button-secondary decrease']") 
	private WebElement numChildrenDec;
	
	@FindBy(xpath = "//div[@class='selectfield children']//child::button[@class='button button-secondary increase']") 
	private WebElement numChildrenInc;
	
	@FindBy(xpath = "//div[@class='selectfield adults']//child::input") 
	private WebElement inputAdults;
	
	@FindBy(xpath = "//div[@class='selectfield adults']//child::button[@class='button button-secondary decrease']") 
	private WebElement numAdultsDec;
	
	@FindBy(xpath = "//div[@class='selectfield adults']//child::button[@class='button button-secondary increase']") 
	private WebElement numAdultsInc;
	
	@FindBy(xpath = "//div[@id='buttonContainer']//child::button") 
	private WebElement btnSave;
	
	//@FindBy(xpath = "//span[@class='icon-font icon-passenger']")
	@FindBy(id = "booking-passengers-input")
	private WebElement iconPassenger;
	
	@FindBy(xpath = "//label[@for='flyingBlueSearch_FlyingBlueSearch']") 
	private WebElement chkBoxShowPrice;
	
	@FindBy(xpath = "//form[@id='desktop']//child::button[@type='submit']")
	private WebElement btn_Seacrh;
	
	@FindBy(xpath = "((//h1[contains(@class,'h4 no-margin-bottom')])[1]")
	private WebElement verLoginText;
	
	@FindBy(xpath = "//span[@data-togglepanel-container='[data-togglepanel=dp1531920812246]']")
	private WebElement departureCal;
	
	@FindBy(xpath = "//span[@data-togglepanel-container='[data-togglepanel=dp1531920812106]']")
	private WebElement arrivalCal;
//=====================================================================================	
	
	public void click_loginLink() {
		link_Login.click();
	}
	
	public void verifyLogin(String text){
		String loginText =  link_Login.getText();
		
		if(loginText.equalsIgnoreCase(text)){
			System.out.println("Login text verified successfully");
		}
	}
	
	public void click_searchButton() {
		btn_Seacrh.click();
	}
	
	public void set_departStation(String departStn) {
		input_DepartStation.sendKeys(departStn);
	}
	
	public void set_arrivalStation(String arrivalStn) {
		input_ArrivalStation.sendKeys(arrivalStn);
	}
	
	public void set_departureDate(String departStn) {
		input_DepartureDate.sendKeys(departStn);
	}
	
	public void set_arrivalDate(String arrivalDate) {
		input_ArrivalDate.sendKeys(arrivalDate);
	}
	
	public void travellingMembers(String value, String memberType) {
		
		
		input_DepartStation.click();
		iconPassenger.click();
		
		if (memberType.equalsIgnoreCase("Adults")) {
//			inputAdults.click();
//			inputAdults.sendKeys(Keys );;
//			inputAdults.sendKeys(value);}
			for(int i=0;i<Integer.parseInt(value);i++)
			{
				numAdultsInc.click();
			}
			}
		
			
		else if(memberType.equalsIgnoreCase("Children")) {
			for(int i=0;i<Integer.parseInt(value);i++)
			{
				numChildrenInc.click();
			}}
		else if(memberType.equalsIgnoreCase("babies")) {
			for(int i=0;i<Integer.parseInt(value);i++)
			{
				numBabiesInc.click();
			}}
		
		 btnSave.click();
		
	}
	
	public void click_chckBoxShowPrice() {
		chkBoxShowPrice.click();
	}
	
	
	
	public void click_SearchButton() {
		btn_Seacrh.click();
	}
	
}
