package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public WebDriver driver;
	public Select_Hotel(WebDriver localdriver) {
this.driver=localdriver;
PageFactory.initElements(driver, this);
	}
	@FindBy(id="hotel_name_0")
	private WebElement hotel_name;
	@FindBy(id="location_0")
	private WebElement location_field;
	@FindBy(id="rooms_0")
	private WebElement rooms_field;
	@FindBy(id="no_days_0")
	private WebElement no_days;
	@FindBy(id="price_night_0")
	private WebElement price_night_price;
	@FindBy(id="total_price_0")
	private WebElement total_price;
	public WebElement getHotel_name() {
		return hotel_name;
	}
	public WebElement getLocation_field() {
		return location_field;
	}
	public WebElement getRooms_field() {
		return rooms_field;
	}
	public WebElement getNo_days() {
		return no_days;
	}
	public WebElement getPrice_night_price() {
		return price_night_price;
	}
	public WebElement getTotal_price() {
		return total_price;
	}
	@FindBy(id="arr_date_0")
	private WebElement checkin_date;
	@FindBy(id="dep_date_0")
	private WebElement checkout_date;
	@FindBy(id="room_type_0")
	private WebElement roomType;
	@FindBy(id="radiobutton_0")
	private WebElement radio_button_field;
	@FindBy(id="continue")
	private WebElement continue_click_field;
	public WebElement getRadio_button_field() {
		return radio_button_field;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getContinue_click_field() {
		return continue_click_field;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getCheckin_date() {
		return checkin_date;
	}
	public WebElement getCheckout_date() {
		return checkout_date;
	}

}
