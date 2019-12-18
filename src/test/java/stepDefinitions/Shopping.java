package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Shopping {
	WebDriver driver;
	
	@Given("application is lauched by user")
	public void application_is_lauched_by_user() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
	}

	@Given("user verifies the DemoWebShop website")
	public void user_verifies_the_DemoWebShop_website() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}


	@Given("user clicks on Register button")
	public void user_clicks_on_Register_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
	}

	@When("user enters proper information")
	public void user_enters_proper_information() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Raa");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Paa");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("paa54@raa.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("123456");
	}

	@Then("clicks on submit button for Registration")
	public void clicks_on_submit_button_for_Registration() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		driver.close();
	}

	@Given("registered user clicks on Login link")
	public void registered_user_clicks_on_Login_link() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		
	}
	@Then("he provides valid username {string}")
	public void he_provides_valid_username(String mail) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.name("Email")).getText());
		driver.findElement(By.name("Email")).sendKeys(mail);
	}

	@Then("provides valid password {string}")
	public void provides_valid_password(String pwd) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("Password")).sendKeys(pwd);
	}

	@Then("verifies Login status")
	public void verifies_Login_status() throws InterruptedException {
		Thread.sleep(2000);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		driver.close();
	}


	@Given("user clicks on Search Item box")
	public void user_clicks_on_Search_Item_box() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	
		
	}

	@Then("he types which item he want to buy")
	public void he_types_which_item_he_want_to_buy() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).sendKeys("diamond");
	}

	@Then("clicks on search button")
	public void clicks_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
	}

	@Then("the item which user selected is displayed")
	public void the_item_which_user_selected_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("user searched item is displayed")
	public void user_searched_item_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String sg="diamond";
		WebElement dmd=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/div[2]/h2/a"));
        
	}

	@Then("user selects the required item")
	public void user_selects_the_required_item() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[3]/div[1]/div[1]/div/div[2]/h2/a")).click();
	}

	@Then("clicks on add to cart button")
	public void clicks_on_add_to_cart_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-14\"]")).click();
	}

	@Then("selected item is added to the cart")
	public void selected_item_is_added_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
		WebElement cart=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[3]/a"));
		Assert.assertEquals(cart, "Black & White Diamond Heart");
	}


}
