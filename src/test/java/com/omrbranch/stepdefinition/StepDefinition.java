package com.omrbranch.stepdefinition;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClassHotel 	 {
	//omr login page

		@Given("User is on the omrlogin page")
		public void user_is_on_the_omrlogin_page() {
			chromeBrowserLaunch();
			enterUrl("https://www.omrbranch.com/");
			maximizeWindow();
			implicitWait(30);
		}

		@When("user enter {string} and {string}")
		public void user_enter_and(String email, String pass) {
			findLocatorByIdElement("email").sendKeys(email);
			findLocatorByIdElement("pass").sendKeys(pass);
		}

		@When("User click the login button")
		public void user_click_the_login_button() {
			findLocatorByxpathElement("//button[contains(text(),'Login')]").click();
		}

		@Then("User should verify success message after login")
		public void user_should_verify_success_message_after_login() {
		}

	//Explore Hotel page

		@Given("User is on the Explore Hotel page")
		public void user_is_on_the_explore_hotel_page() {
		}

		@When("User print Welcome username and Explore Hotels")
		public void user_print_welcome_username_and_explore_hotels() {
			String textWelcome = findLocatorByxpathElement("//a[contains(@class,'icoTwitter mr-2')]").getText();
			System.out.println(textWelcome);
			String textHotel = findLocatorByxpathElement("//h5[text()='Explore Hotels']").getText();
			System.out.println(textHotel);
		}

		@When("select details and All room type")
		public void select_details_and_all_room_type() throws AWTException {
			WebElement ddstate = findLocatorByIdElement("state");
			selectDropDownTextElement(ddstate, "Tamil Nadu");
			findLocatorByxpathElement("//span[text()='Select City *']").click();
			findLocatorByxpathElement("//li[text()='Chennai']").click();
			//selectDropDownTextElement(ddCity, "Chennai");
			findLocatorByxpathElement("//textarea[@class='select2-search__field']").click();
			findLocatorByxpathElement("//li[text()='Standard']").click();
			findLocatorByxpathElement("//textarea[@class='select2-search__field']").click();
			findLocatorByxpathElement("//li[text()='Deluxe']").click();
			findLocatorByxpathElement("//textarea[@class='select2-search__field']").click();
			findLocatorByxpathElement("//li[text()='Suite']").click();
			findLocatorByxpathElement("//textarea[@class='select2-search__field']").click();
			findLocatorByxpathElement("//li[text()='Luxury']").click();
			findLocatorByxpathElement("//textarea[@class='select2-search__field']").click();
			findLocatorByxpathElement("//li[text()='Studio']").click();
			
			//selectAllDropdownElement(roomType);
			//findLocatorBynameElement("check_in").click();
			enterCheckInDate();
			//findLocatorByIdElement("check_out").click();
			enterCheckOutDate();
			WebElement noOfRooms = findLocatorByIdElement("no_rooms");
			selectDropDownTextElement(noOfRooms, "2-Two");
			WebElement noOfAdults = findLocatorByIdElement("no_adults");
			selectDropDownTextElement(noOfAdults, "4-Four");
			
			/*WebElement btnSrch = findLocatorByxpathElement("//button[text()='Search']");
			explicitWait(btnSrch);
			btnSrch.click();*/
			//findLocatorByIdElement("searchBtn").click();
			robotButtonSrch();
		}

		@Then("User verify All details are filled")
		public void user_verify_all_details_are_filled() {
		}

	//Select hotel page

		@Given("User is on the select hotel page")
		public void user_is_on_the_select_hotel_page() {
		}

		@When("user print select hotel and all hotel names ,all hotel price without and with tax")
		public void user_print_select_hotel_and_all_hotel_names_all_hotel_price_without_and_with_tax() {
			String txtSelectHotel = findLocatorByxpathElement("//h5[text()='Select Hotel']").getText();
			System.out.println(txtSelectHotel);
			
			String hotel1 = findLocatorByxpathElement("//h5[text()='Hyatt Regency Chennai Studio']").getText();
			System.out.println(hotel1);
			String h1Price = findLocatorByxpathElement("(//h2[text()='$ 1,500'])[1]").getText();
			System.out.println(h1Price);
			//WebElement h1TaxPrice = findLocatorByxpathElement("(//strong[text()='$ 7,080'])[1]");
			//String  txtTaxPrice= getTextUsingJS(h1TaxPrice);
			String h1TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[1]").getText();
			System.out.println(h1TaxPrice);
			
			String hotel2 = findLocatorByxpathElement("//h5[text()='Hyatt Regency Chennai Luxury']").getText();
			System.out.println(hotel2);
			String h2Price = findLocatorByxpathElement("(//h2[text()='$ 1,400'])[1]").getText();
			System.out.println(h2Price);
			String h2TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[2]").getText();
			System.out.println(h2TaxPrice);
			
			String hotel3 = findLocatorByxpathElement("//h5[text()='Hyatt Regency Chennai Suite']").getText();
			System.out.println(hotel3);
			String h3Price = findLocatorByxpathElement("(//h2[text()='$ 1,300'])[1]").getText();
			System.out.println(h3Price);
			String h3TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[3]").getText();
			System.out.println(h3TaxPrice);
			
			String hotel4 = findLocatorByxpathElement("//h5[text()='Hyatt Regency Chennai Deluxe']").getText();
			System.out.println(hotel4);
			String h4Price = findLocatorByxpathElement("(//h2[text()='$ 1,200'])[1]").getText();
			System.out.println(h4Price);
			String h4TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[4]").getText();
			System.out.println(h4TaxPrice);
			String hotel5 = findLocatorByxpathElement("//h5[text()='Hyatt Regency Chennai Standard']").getText();
			System.out.println(hotel5);
			String h5Price = findLocatorByxpathElement("//h2[text()='$ 1,100']").getText();
			System.out.println(h5Price);
			String h5TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[5]").getText();
			System.out.println(h5TaxPrice);
			
			String hotel6 = findLocatorByxpathElement("//h5[text()='ITC Grand Chola Hotel Studio']").getText();
			System.out.println(hotel6);
			String h6Price = findLocatorByxpathElement("(//h2[text()='$ 1,800'])[1]").getText();
			System.out.println(h6Price);
			String h6TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[6]").getText();
			System.out.println(h6TaxPrice);
			
			String hotel7 = findLocatorByxpathElement("//h5[text()='ITC Grand Chola Hotel Luxury']").getText();
			System.out.println(hotel7);
			String h7price = findLocatorByxpathElement("(//h2[text()='$ 1,700'])[1]").getText();
			System.out.println(h7price);
			String h7TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[7]").getText();
			System.out.println(h7TaxPrice);
			
			String hotel8 = findLocatorByxpathElement("//h5[text()='ITC Grand Chola Hotel Suite']").getText();
			System.out.println(hotel8);
			String h8Price = findLocatorByxpathElement("(//h2[text()='$ 1,600'])[5]").getText();
			System.out.println(h8Price);
			String h8TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[8]").getText();
			System.out.println(h8TaxPrice);
			
			String hotel9 = findLocatorByxpathElement("//h5[text()='ITC Grand Chola Hotel Deluxe']").getText();
			System.out.println(hotel9);
			String h9Price = findLocatorByxpathElement("(//h2[text()='$ 1,500'])[2]").getText();
			System.out.println(h9Price);
			String h9TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[9]").getText();
			System.out.println(h9TaxPrice);
			
			String hotel10 = findLocatorByxpathElement("//h5[text()='ITC Grand Chola Hotel Standard']").getText();
			System.out.println(hotel10);
			String h10Price = findLocatorByxpathElement("(//h2[text()='$ 1,400'])[2]").getText();
			System.out.println(h10Price);
			String h10TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[10]").getText();
			System.out.println(h10TaxPrice);
			
			String hotel11 = findLocatorByxpathElement("//h5[text()='Radisson Blu Resort Temple Bay Studio']").getText();
			System.out.println(hotel11);
			String h11Price = findLocatorByxpathElement("(//h2[text()='$ 1,700'])[2]").getText();
			System.out.println(h11Price);
			String h11TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[11]").getText();
			System.out.println(h11TaxPrice);
			
			String hotel12 = findLocatorByxpathElement("//h5[text()='Radisson Blu Resort Temple Bay Luxury']").getText();
			System.out.println(hotel12);
			String h12Price = findLocatorByxpathElement("(//h2[text()='$ 1,600'])[2]").getText();
			System.out.println(h12Price);
			String h12TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[12]").getText();
			System.out.println(h12TaxPrice);
			
			String hotel13 = findLocatorByxpathElement("//h5[text()='Radisson Blu Resort Temple Bay Suite']").getText();
			System.out.println(hotel13);
			String h13Price = findLocatorByxpathElement("(//h2[text()='$ 1,500'])[3]").getText();
			System.out.println(h13Price);
			String h13TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[13]").getText();
			System.out.println(h13TaxPrice);
			
			String hotel14 = findLocatorByxpathElement("//h5[text()='Radisson Blu Resort Temple Bay Deluxe']").getText();
			System.out.println(hotel14);
			String h14Price = findLocatorByxpathElement("(//h2[text()='$ 1,400'])[3]").getText();
			System.out.println(h14Price);
			String h14TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[14]").getText();
			System.out.println(h14TaxPrice);
			
			String hotel15 = findLocatorByxpathElement("//h5[text()='Radisson Blu Resort Temple Bay Standard']").getText();
			System.out.println(hotel15);
			String h15Price = findLocatorByxpathElement("(//h2[text()='$ 1,300'])[2]").getText();
			System.out.println(h15Price);
			String h15TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[15]").getText();
			System.out.println(h15TaxPrice);
			
			String hotel16 = findLocatorByxpathElement("//h5[contains(text(),'Cove Resort & Spa Studio')]").getText();
			System.out.println(hotel16);
			String h16Price = findLocatorByxpathElement("//h2[text()='$ 2,000']").getText();
			System.out.println(h16Price);
			String h16TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[16]").getText();
			System.out.println(h16TaxPrice);
			
			String hotel17 = findLocatorByxpathElement("//h5[contains(text(),'Cove Resort & Spa Luxury')]").getText();
			System.out.println(hotel17);
			String h17Price = findLocatorByxpathElement("(//h2[text()='$ 1,900'])[1]").getText();
			System.out.println(h17Price);
			String h17TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[17]").getText();
			System.out.println(h17TaxPrice);
			
			String hotel18 = findLocatorByxpathElement("//h5[contains(text(),'Cove Resort & Spa Suite')]").getText();
			System.out.println(hotel18);
			String h18Price = findLocatorByxpathElement("//h2[text()='$ 1,800']").getText();
			System.out.println(h18Price);
			String h18TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[18]").getText();
			System.out.println(h18TaxPrice);
			
			String hotel19 = findLocatorByxpathElement("//h5[contains(text(),'Cove Resort & Spa Deluxe')]").getText();
			System.out.println(hotel19);
			String h19Price = findLocatorByxpathElement("//h2[text()='$ 1,700']").getText();
			System.out.println(h19Price);
			String h19TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[19]").getText();
			System.out.println(h19TaxPrice);
			
			String hotel20 = findLocatorByxpathElement("//h5[contains(text(),'Cove Resort & Spa Standard')]").getText();
			System.out.println(hotel20);
			String h20Price = findLocatorByxpathElement("//h2[text()='$ 1,600']").getText();
			System.out.println(h20Price);
			String h20TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[20]").getText();
			System.out.println(h20TaxPrice);
			
			String hotel21 = findLocatorByxpathElement("//h5[contains(text(),'Taj Coromandel Studio')]").getText();
			System.out.println(hotel21);
			String h21Price = findLocatorByxpathElement("(//h2[text()='$ 1,600'])[4]").getText();
			System.out.println(h21Price);
			String h21TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[21]").getText();
			System.out.println(h21TaxPrice);
			
			String hotel22 = findLocatorByxpathElement("//h5[contains(text(),'Taj Coromandel Luxury')]").getText();
			System.out.println(hotel22);
			String h22Price = findLocatorByxpathElement("(//h2[text()='$ 1,500'])[4]").getText();
			System.out.println(h22Price);
			String h22TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[22]").getText();
			System.out.println(h22TaxPrice);
			
			String hotel23 = findLocatorByxpathElement("//h5[contains(text(),'Taj Coromandel Suite')]").getText();
			System.out.println(hotel23);
			String h23Price = findLocatorByxpathElement("(//h2[text()='$ 1,400'])[4]").getText();
			System.out.println(h23Price);
			String h23TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[23]").getText();
			System.out.println(h23TaxPrice);
			
			String hotel24 = findLocatorByxpathElement("//h5[contains(text(),'Taj Coromandel Deluxe')]").getText();
			System.out.println(hotel24);
			String h24Price = findLocatorByxpathElement("(//h2[text()='$ 1,300'])[3]").getText();
			System.out.println(h24Price);
			String h24TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[24]").getText();
			System.out.println(h24TaxPrice);
			
			String hotel25 = findLocatorByxpathElement("//h5[contains(text(),'Taj Coromandel Standard')]").getText();
			System.out.println(hotel25);
			String h25Price = findLocatorByxpathElement("//h2[text()='$ 1,200']").getText();
			System.out.println(h25Price);
			String h25TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[25]").getText();
			System.out.println(h25TaxPrice);
			
			String hotel26 = findLocatorByxpathElement("//h5[contains(text(),'Taj Connemara Studio')]").getText();
			System.out.println(hotel26);
			String h26Price = findLocatorByxpathElement("(//h2[text()='$ 1,900'])[2]").getText();
			System.out.println(h26Price);
			String h26TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[26]").getText();
			System.out.println(h26TaxPrice);
			
			String hotel27 = findLocatorByxpathElement("//h5[contains(text(),'Taj Connemara Luxury')]").getText();
			System.out.println(hotel27);
			String h27Price = findLocatorByxpathElement("(//h2[text()='$ 1,800'])[3]").getText();
			System.out.println(h27Price);
			String h27TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[27]").getText();
			System.out.println(h27TaxPrice);
			
			String hotel28 = findLocatorByxpathElement("//h5[contains(text(),'Taj Connemara Suite')]").getText();
			System.out.println(hotel28);
			String h28Price = findLocatorByxpathElement("(//h2[text()='$ 1,700'])[4]").getText();
			System.out.println(h28Price);
			String h28TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[28]").getText();
			System.out.println(h28TaxPrice);
			
			String hotel29 = findLocatorByxpathElement("//h5[contains(text(),'Taj Connemara Deluxe')]").getText();
			System.out.println(hotel29);
			String h29Price = findLocatorByxpathElement("(//h2[text()='$ 1,600'])[5]").getText();
			System.out.println(h29Price);
			String h29TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[29]").getText();
			System.out.println(h29TaxPrice);
			
			String hotel30 = findLocatorByxpathElement("//h5[contains(text(),'Taj Connemara Standard')]").getText();
			System.out.println(hotel30);
			String h30Price = findLocatorByxpathElement("(//h2[text()='$ 1,500'])[5]").getText();
			System.out.println(h30Price);
			String h30TaxPrice = findLocatorByxpathElement("(//strong[@class='total-prize'])[30]").getText();
			System.out.println(h30TaxPrice);
			
		}



		@When("select Fourth hotel from last")
		public void select_fourth_hotel_from_last() {
		
			List<WebElement> fourthContinue = findElementsssByXpath("//a[text()='Continue']");
			clickContinueFourthFromLast(fourthContinue);
			alertClickOk();
		}

	//Book hotel page

		//firstName, lastName, mobileNo, eMail

		@Given("User is on the Book hotel page")
		public void user_is_on_the_book_hotel_page() {
		}
		@When("User print book hotel and enter  guest details {string},{string},{string},{string}")
		public void user_print_book_hotel_and_enter_guest_details(String firstName, String lastName, String mobileNo, String eMail) {
			String txtBookHotel = findLocatorByxpathElement("//h2[contains(text(),'Book Hotel -')]").getText();
			System.out.println(txtBookHotel);
			findLocatorByIdElement("own").click();
			//WebElement ddselect = findLocatorByxpathElement("//option[text()='Select Salutation ']");
			WebElement ddselect = findLocatorByIdElement("user_title");
			selectDropDownTextElement(ddselect, "Mr.");
			findLocatorByIdElement("first_name").sendKeys(firstName);
			findLocatorByIdElement("last_name").sendKeys(lastName);
			findLocatorByIdElement("user_phone").sendKeys(mobileNo);
			findLocatorByIdElement("user_email").sendKeys(eMail);
			WebElement checkBoxGst = findLocatorByxpathElement("//label[contains(text(),'Enter GST Details (Optional)')]");
			jsClickElement(checkBoxGst);
		}
		
			//regNo, compName, compAddr
		
			   
			@When("user enter GST {string},{string},{string}")
			public void user_enter_gst(String Regno, String compName, String compAddr) {
				findLocatorByIdElement("gst_registration").sendKeys(Regno);
				findLocatorByIdElement("company_name").sendKeys(compName);
				findLocatorByIdElement("company_address").sendKeys(compAddr);
				findLocatorByIdElement("step1next").click();
			  
			}
		
		@When("User enter the special request {string}")
		public void user_enter_the_special_request(String request) {
			//WebElement clkHigh = findLocatorByIdElement("high");
			//jsClickElement(clkHigh);
			findLocatorByIdElement("other_request").sendKeys(request);
			findLocatorByIdElement("step2next").click();
		}
		
			@When("User enter payment Details")
			public void user_enter_payment_details() {
				WebElement clkCard = findLocatorByxpathElement("//h5[text()='Credit/Debit/ATM Card']");
				jsClickElement(clkCard);
				WebElement ddCard = findLocatorByIdElement("payment_type");
				selectDropDownTextElement(ddCard, "Debit Card");
				WebElement ddCardType = findLocatorByIdElement("card_type");
				selectDropDownTextElement(ddCardType, "Visa");
				findLocatorByIdElement("card_no").sendKeys("5555555555552222");
				findLocatorByIdElement("card_name").sendKeys("Nithish");
				WebElement ddmonth = findLocatorByIdElement("card_month");
				selectDropDownTextElement(ddmonth, "September");
				WebElement cardYear = findLocatorByIdElement("card_year");
				selectDropDownTextElement(cardYear, "2027");
				findLocatorByIdElement("cvv").sendKeys("836");
				findLocatorByIdElement("submitBtn").click();
			}
		


	//Booking confirmation page

		@Given("User is on the Booking confirmation page")
		public void user_is_on_the_booking_confirmation_page() {
		}

		@When("user print booking is confirmed ,order id and booked hotel name")
		public void user_print_booking_is_confirmed_order_id_and_booked_hotel_name() {
			String textconfrmBooking = findLocatorByxpathElement("//h2[text()=' Booking is Confirmed ']").getText();
	System.out.println(textconfrmBooking);
	String textbooked = findLocatorByxpathElement("//p[text()=' is booked!']").getText();
	System.out.println(textbooked);
		}

}
