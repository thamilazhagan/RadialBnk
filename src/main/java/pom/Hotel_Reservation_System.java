package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Reservation_System {
	public WebDriver driver;
	 public Hotel_Reservation_System(WebDriver localDriver) {
		this.driver=localDriver;
		PageFactory.initElements(driver, this);
		
	}
        @FindBy(id="username")
        private WebElement nameField;
        
        @FindBy(id="password")
	private WebElement passwordField;
        
        @FindBy(id="login")
        private WebElement loginField;
        
        @FindBy(xpath="//a[text()='Click here to login again']")
        private WebElement logout;
        
        @FindBy(xpath="/html/body/table[2]/tbody/tr[1]/td[2]/a[2]")
        private WebElement booked_itenerary_field;

		public WebElement getBooked_itenerary_field() {
			return booked_itenerary_field;
		}

		public WebDriver getDriver() {
			return driver;
		}

		public WebElement getLogout() {
			return logout;
		}

		public WebElement getNameField() {
			return nameField;
		}

		public WebElement getPasswordField() {
			return passwordField;
		}

		public WebElement getLoginField() {
			return loginField;
		}
        
}
