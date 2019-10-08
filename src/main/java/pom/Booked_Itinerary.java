package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary {
	public WebDriver driver;
	 public Booked_Itinerary(WebDriver ldriver) {
this.driver=ldriver;
PageFactory.initElements(driver, this);
	}
@FindBy(id="order_id_text")
private WebElement order_id_text;
@FindBy(id="search_hotel_id")
private WebElement search_hotel_id;
@FindBy(xpath="(//input[@type='text'])[3]")
private WebElement order_id_editable;
@FindBy(xpath="//input[@value='Cancel Selected']")
private WebElement cancel_order;
@FindBy(xpath="//input[@type='checkbox']")
private WebElement select_checkbox;
@FindBy(id="search_result_error")
private WebElement search_result;
public WebElement getSearch_result() {
	return search_result;
}


public WebElement getSelect_checkbox() {
	return select_checkbox;
}


public WebElement getCancel_order() {
	return cancel_order;
}


public WebElement getOrder_id_editable() {
	return order_id_editable;
}


public WebElement getSearch_hotel_id() {
	return search_hotel_id;
}


public WebDriver getDriver() {
	return driver;
}
public WebElement getOrder_id_text() {
	return order_id_text;
}
}
