package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel {
	public WebDriver driver;
	public Book_A_Hotel(WebDriver localdriverd) {
this.driver=localdriverd;
PageFactory.initElements(driver, this);
	
	}
	@FindBy(id="hotel_name_dis")
	private WebElement hotel_name_field;
	@FindBy(id="location_dis")
	private WebElement location_field;
	@FindBy(id="room_type_dis")
	private WebElement room_type_field;

	@FindBy(id="room_num_dis")
	private WebElement room_num_field;

	@FindBy(id="total_days_dis")
	private WebElement total_days_field;
	@FindBy(id="price_night_dis")
	private WebElement price_perNight_field;

	@FindBy(id="total_price_dis")
	private WebElement total_price_field;

	@FindBy(id="gst_dis")
	private WebElement gst_field;

	@FindBy(id="final_price_dis")
	private WebElement final_price_field;

	@FindBy(id="first_name")
	private WebElement first_name_field;

	@FindBy(id="last_name")
	private WebElement last_name_field;

	@FindBy(id="address")
	private WebElement address_field;

	@FindBy(id="cc_num")
	private WebElement card_number;
	
	@FindBy(id="cc_type")
	private WebElement card_type;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCard_type() {
		return card_type;
	}
	@FindBy(id="cc_exp_month")
	private WebElement card_expiry_month;

	@FindBy(id="cc_exp_year")
	private WebElement card_expiry_year;
	

	@FindBy(id="cc_cvv")
	private WebElement card_cvv_number;

	@FindBy(id="book_now")
	private WebElement booknow_field;

	public WebElement getHotel_name_field() {
		return hotel_name_field;
	}

	public WebElement getLocation_field() {
		return location_field;
	}

	public WebElement getRoom_type_field() {
		return room_type_field;
	}

	public WebElement getRoom_num_field() {
		return room_num_field;
	}

	public WebElement getTotal_days_field() {
		return total_days_field;
	}

	public WebElement getPrice_perNight_field() {
		return price_perNight_field;
	}

	public WebElement getTotal_price_field() {
		return total_price_field;
	}

	public WebElement getGst_field() {
		return gst_field;
	}

	public WebElement getFinal_price_field() {
		return final_price_field;
	}

	public WebElement getFirst_name_field() {
		return first_name_field;
	}

	public WebElement getLast_name_field() {
		return last_name_field;
	}

	public WebElement getAddress_field() {
		return address_field;
	}

	public WebElement getCard_number() {
		return card_number;
	}

	public WebElement getCard_expiry_month() {
		return card_expiry_month;
	}

	public WebElement getCard_expiry_year() {
		return card_expiry_year;
	}

	public WebElement getCard_cvv_number() {
		return card_cvv_number;
	}

	public WebElement getBooknow_field() {
		return booknow_field;
	}


}
