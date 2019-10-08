package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation {
	public WebDriver driver;
	public Booking_Confirmation(WebDriver ldriver) {
this.driver=ldriver;
PageFactory.initElements(driver, this);
	}
	@FindBy(id="hotel_name")
	private WebElement Hotel_name;
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="room_type")
	private WebElement room_type ;
	@FindBy(id="arrival_date")
	private WebElement arrival_date;	
	@FindBy(id="departure_text")
	private WebElement departure_text;
	@FindBy(id="total_rooms")
	private WebElement total_rooms ;
	@FindBy(id="adults_room")
	private WebElement adults_room ;
	@FindBy(id="children_room")
	private WebElement children_room ;
	@FindBy(id="price_night")
	private WebElement price_night;
	@FindBy(id="total_price")
	private WebElement total_price ;
	@FindBy(id="gst")
	private WebElement gst;
	@FindBy(id="final_price")
	private WebElement final_price ;
	@FindBy(id="first_name")
	private WebElement first_name;
	@FindBy(id="last_name")
	private WebElement last_name ;
	@FindBy(id="address")
	private WebElement address ;
	@FindBy(id="order_no")
	private WebElement order_no;
	@FindBy(id="search_hotel")
	private WebElement search_hotel ;
	@FindBy(id="my_itinerary")
	private WebElement my_itinerary ;
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getHotel_name() {
		return Hotel_name;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getRoom_type() {
		return room_type;
	}
	public WebElement getArrival_date() {
		return arrival_date;
	}
	public WebElement getDeparture_text() {
		return departure_text;
	}
	public WebElement getTotal_rooms() {
		return total_rooms;
	}
	public WebElement getAdults_room() {
		return adults_room;
	}
	public WebElement getChildren_room() {
		return children_room;
	}
	public WebElement getPrice_night() {
		return price_night;
	}
	public WebElement getTotal_price() {
		return total_price;
	}
	public WebElement getGst() {
		return gst;
	}
	public WebElement getFinal_price() {
		return final_price;
	}
	public WebElement getFirst_name() {
		return first_name;
	}
	public WebElement getLast_name() {
		return last_name;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getOrder_no() {
		return order_no;
	}
	public WebElement getSearch_hotel() {
		return search_hotel;
	}
	public WebElement getMy_itinerary() {
		return my_itinerary;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
