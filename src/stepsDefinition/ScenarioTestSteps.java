package stepsDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import dataProviders.ConfigsFileReader;
import manager.PageObjectManager;
import pageObjects.HomePage;
import cucumber.api.java.en.Then;

public class ScenarioTestSteps {

//====== Class Varaibles ============================	
  WebDriver driver;
  HomePage homePage;
  ConfigsFileReader configsFileReader;
  PageObjectManager pageObjectManager;
//===================================================
  
  
  @Given("^user is on application home page$")
   public void invokeApplication() {
	  configsFileReader = new ConfigsFileReader();
	  System.setProperty("webdriver.chrome.driver", configsFileReader.getDriverPath());
	  driver = new ChromeDriver();
	  driver.get(configsFileReader.getApplicationUrl());
	  driver.manage().window().maximize();
	  pageObjectManager = new PageObjectManager(driver);
	  homePage = pageObjectManager.getHomePage();
	  //homePage.click_searchDeButton();  
  }
  
  @When("^user select \"(.*)\" in From field$")
  public void selectDepartStation(String departStn) {
	  
	  homePage.set_departStation(departStn);
	  
  }
  
  @When("^user clicks on Login link$")
  public void clickLoginLink() {
	  
	  homePage.click_loginLink(); 
  }
  
  
  
  @And("^user select \"(.*)\" in To field$")
  public void selectArrivalStation(String arrivalStn) {
	  
	  homePage.set_arrivalStation(arrivalStn); 
  }
  
  
  @And("^user select date \"(.*)\" in Depart on field$")
  public void selectDepartOn(String departDate) {
	  
	  homePage.set_departureDate(departDate);
  }
  
  @And("^user select date \"(.*)\" in Return on field$")
  public void selectArrivalon(String arrivalDate) {
	  
	  homePage.set_arrivalDate(arrivalDate);
  }
  
  @And("^user select adults, children, babies in who will be travelling field$")
  public void selectTravellingMembers(DataTable travellingFields) {
	 
	  List<Map<String, String>> data = travellingFields.asMaps(String.class, String.class);
	  //List<List<String>> data = travellingFields.raw();
	  homePage.travellingMembers(data.get(0).get("Adults"),"Adults");
	  homePage.travellingMembers(data.get(0).get("Children"),"Children");
	  homePage.travellingMembers(data.get(0).get("Babies"),"Babies");
  }
  
  @And("^user check the option for Show prices in flying Blue Miles$")
  public void checkShowPrices(){
	
	   homePage.click_chckBoxShowPrice();
	  
	  }
  
  @And("^user click Search button$")
  public void clickkSearchButton(){
	  
	   homePage.click_SearchButton();
	  }
  
 
  
  @Then("^user is navigated to Book a flight page$")
  public void verifyPage(){

	  String rtTitle = driver.getTitle();
	  if(rtTitle.equalsIgnoreCase(configsFileReader.getBookFlightTitle()))
	    {
	        System.out.println("Page successfully verified");
	    }
	  driver.quit();
  }
  
  
  @Then("^user is navigated to application logon page$")
  public void verifyText(){

	  homePage.verifyLogin(configsFileReader.getLoginText());
	  driver.quit();
  }
  
  
}
