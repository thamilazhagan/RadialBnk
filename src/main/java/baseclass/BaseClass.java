package baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;

import com.google.common.base.Throwables;
import com.google.common.io.Files;

public class BaseClass {
	public static WebDriver driver;
	public  static WebDriver browserLaunch(String browserName) throws Exception {
		try {
			if(browserName.equalsIgnoreCase("Chrome")) {
				//String path = System.getProperty("user.dir")+"\\Driver\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver","C:\\Users\\anbaz\\workspace\\core_java_prgrms\\Driver_1\\chromedriver.exe");
				driver=new ChromeDriver();
				
			}else if(browserName.equalsIgnoreCase("ie")){
				String path=System.getProperty("user.dir")+"//DriverIEDriverServer.exe";
				System.setProperty("webdriver.ie.driver", path);
			}
			else {
				throw new Exception("invalid browser name"+browserName);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
		
	}
	
	public static void url(String Enterurl) {
		driver.get(Enterurl);
	}
public static void visible_wait(WebElement element ,long time) {
 WebDriverWait wb =new WebDriverWait(driver, time);
 wb.until(ExpectedConditions.visibilityOf(element));
}

public static boolean is_Displayed(WebElement element) {
	 boolean displayed=false;
	 boolean display = element.isDisplayed();
return display;

}
public static boolean is_selected(WebElement element) {
	boolean selected=false;
	boolean select = element.isSelected();

	return select;
	
}
public static boolean is_enabled(WebElement element) {
	boolean enabled=false;
	boolean enable = element.isEnabled();
	return enable ;
	
}
public static  void send_Keys(WebElement element,String Enter_value) throws Exception {
	visible_wait(element, 2);
	try {
		if (is_Displayed(element)&& is_enabled(element)) {
			element.clear();
			element.sendKeys(Enter_value);
			//System.out.println(Enter_value);
			
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new Exception("invalid catch");
		
	}
	
		
	}
	
	
	
	


public static void Enter(WebElement element) {
element.sendKeys(Keys.ENTER);



}
public static void send_Keys_1(WebElement element,String Enter_text) {
element.sendKeys(Enter_text);
}
public static void mouseOverAction(WebElement element) {

Actions a=new Actions(driver);
a.click(element).build().perform();


}
public static void scroll() throws Exception {
	try {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		throw new Exception("harish error");
	}
}
public static void title() {
	String titles = driver.getTitle();
	System.out.println(titles);
}
public static void drop_down(WebElement element,String value_type,String value) {

Select s=new Select(element);
if(value_type.equalsIgnoreCase("text")) {
	s.selectByVisibleText(value);
}else if(value_type.equalsIgnoreCase("value")) {
	s.selectByValue(value);
}else if (value_type.equalsIgnoreCase("index")) {
	s.selectByIndex(Integer.parseInt(value));
}


}
public static void click(WebElement element ,String type ) {
if (type.equalsIgnoreCase("click")) {
	visible_wait(element, 10);
	element.click();
}else if (type.equalsIgnoreCase("rightClick")) {
	Actions a=new Actions(driver);
	a.contextClick(element).build().perform();
}
	
	
}

public static void navigate(String action) {
if(action.equalsIgnoreCase("forward")) {
	driver.navigate().forward();
}else if(action.equalsIgnoreCase("back")) {
	driver.navigate().back();
}else if(action.equalsIgnoreCase("refresh")) {
	driver.navigate().refresh();
}
	
		
	}public static void  maximize() {
		driver.manage().window().maximize();
}

	public static void text(WebElement element) {
		String text1 = element.getText();
		System.out.println(text1);
		
		
	}
	public static void getattribute(WebElement element, String type) {
		try {
			String attribute = element.getAttribute(type);
			System.out.println(attribute);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void get_options(WebElement element) {
		Select s=new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement web : options) {
			String text = web.getText();
			System.out.println(text);
		}
		
		}

	public static void screenShot() throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
                  File screenshotfile = ts.getScreenshotAs(OutputType.FILE);
	File save_file =new File("C://Users//anbaz//eclipse-workspace//selenium_practice//Screen_Shot/harishthamil.png");
FileUtils.copyFile(screenshotfile, save_file);
	}
	public static void robots(String action) throws AWTException {
		Robot r=new Robot();
		if(action.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		}else if(action.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}else if(action.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
	
	}
	
	
	public static void switchwindow() {
         String windowHandle = driver.getWindowHandle();
         Set<String> windowHandles = driver.getWindowHandles();
         for (String string : windowHandles) {
			if (!string.equals(windowHandle)) {
				driver.switchTo().window(string);
				
			}
		}
	}
	public static void windowsHandling_title(String title) {
       String windowHandle = driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		for (String single_window: set) {
			String title2 = driver.getTitle();
			if(title2.equalsIgnoreCase(title)) {
				driver.switchTo().window(single_window);
			}
			
		}
		
	

	}
	public static void stringToIneger(String string) {
		for (int i = 0; i <string.length(); i++) {
			char c = string.charAt(i);
			if (Character.isDigit(c)) {
				System.out.print(i);
			}
			
		}
		

	}
}
