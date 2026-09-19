package com.omrbranch.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.jspecify.annotations.Nullable;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClassHotel {
	public static WebDriver driver;
	Alert alert;
	Select select;
	JavascriptExecutor js;
	Actions actions;
	WebElement element;
	//1. Write a code to Launch chrome Browser
	public static void chromeBrowserLaunch() {
	driver = new ChromeDriver();
	}
	//Write a code to Launch Firefox Browser
	public void fireFoxBrowserLaunch() {
		driver = new FirefoxDriver();
	}
	//3. Write a code to Launch Edge Browser
	public void  edgeBrowserLaunch() {
		driver = new EdgeDriver();
	}
	//4.Write a code to Enter URL
	public static void enterUrl(String url) {
		driver.get(url);
	}
	//5. Write a code to maximize window
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	//6. Write a code to insert value in textbox
	public void sendkeysElement(WebElement element,String data) {

		element.sendKeys(data);
	}
	//7. Write a code to click button
	public void clickButtonElement(WebElement element) {
		element.click();
	}
	//8. Write a code to click ok in alert  
	public void alertClickOk() {
		alert = driver.switchTo().alert();
		alert.accept();
	}
	//9. Write a code to click cancel in alert box
	public void alertClickCancel() {
		driver.switchTo().alert().dismiss();
	}
	//10. Write a code to get the text from webpage
//	public void getTextValueElement(WebElement element) {
//		element.getText();
//	}
	public String getTextValueElement(WebElement element) {
	    String text = element.getText();
	    return text;
	}
	//11. Write a code to Get the Inserted value from textbox 
//	public void getInsertedValueElement(WebElement element, String value) {
//		element.getDomAttribute(value);
//	}
	public String getInsertedValueElement(WebElement element) {
	    return element.getDomProperty("value");
	}
	//12. Write a code to close window
	public void closeWindow() {
		driver.close();
	}
	//13. Write a code to get the title
	public String getTitle() {
		@Nullable
		String title = driver.getTitle();
		return title;
	}
	//14. Write a code to Get the entered URL
	public String getEnteredUrl () {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	
	//15. Write a code to select dropdown option by text
	public void selectDropDownTextElement(WebElement element, String text) {
		select = new Select(element);
		select.selectByVisibleText(text);
	}
	//16. Write a code to Select dropdown option by attribute
	public void selectDropdownAttributeElement(WebElement element, String text) {
		select = new Select(element);
		select.selectByValue(text);
	}
	//17. Write a code to Select dropdown option by index
	public void selectDropdownIndexElement(WebElement element, int index) {
		select = new Select(element);
		select.selectByIndex(index);
	}
	//18. Write a code to Insert value in textbox by java script
	public void jsExecutorSendKeysElement(WebElement element, String data) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+data+"')", element);
	}
	//19. Write a code to Click button by java script
	public void jsClickElement (WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	//20. Write a code to Switch to Child window
		public void  switchChildWindow() {
			String windowHandle = driver.getWindowHandle();
			Set<String> windowHandles = driver.getWindowHandles();
			for (String eachWindowId :windowHandles ) {
				if(!windowHandle.equals(eachWindowId)) {
					driver.switchTo().window(eachWindowId);
					
				}
				
			}
			
		}
		//21. Write a code to Switch to frame by index
		public void switchFrameIndex(int index) {
			driver.switchTo().frame(index);
			
		}
		//22. Write a code to Switch to frame by frame Id/name
		public void switchFrameName (String name) {
			driver.switchTo().frame(name);
		}
		//23. Write a code to Switch to frame by WebElement
		public void switchFrameElement(WebElement element) {
			driver.switchTo().frame(element);
		}
		//24. Write a code to Find locator by Id
		public WebElement findLocatorByIdElement (String attributeValue) {
		WebElement	element = driver.findElement(By.id(attributeValue));
		return element;
		}
		
		//25. Write a code to Find Locator by name
		public WebElement findLocatorBynameElement(String attributeValue) {
			WebElement element = driver.findElement(By.name(attributeValue));
			return element;
		}
		//26. Write a code to Find Locator by className
				public WebElement findLocatorByClassNameElement(String attributeValue) {
					WebElement element = driver.findElement(By.name(attributeValue));
					return element;
				}
		//27. Write a code to Find Locator by xpath
		public WebElement findLocatorByxpathElement (String expression) {
			WebElement element = driver.findElement(By.xpath(expression));
			return element;
		}

//////		//28. Write a code to Get all options from dropdown as text
		public List<String> getAllOptionsDropdownText(WebElement element) {
			List<String> allOptionText = 	new ArrayList<String>();
			select = new Select(element);
			List<WebElement> options = select.getOptions();
			for (WebElement webElement : options) {
				String text = webElement.getText();
				allOptionText.add(text);
			}
			return allOptionText;
		}
///////		//29. Write a code to Get all options from dropdown as value
		public List<String> getAllOPtionsDropdownValue(WebElement element, String value ) {
			List<String> allOptionValues = new ArrayList<String>();
			select = new Select(element);
			List<WebElement> options = select.getOptions();
			for (WebElement webElement : options) {
				webElement.getDomProperty(value);
				
			}
			return allOptionValues;
		}
	/*public List<String> getAllOptionsDropdownValue(WebElement element, String attributeName) {
    List<String> allOptionValues = new ArrayList<String>();

    select = new Select(element);
    List<WebElement> options = select.getOptions();

    for (WebElement webElement : options) {
        String value = webElement.getDomAttribute(attributeName);
        allOptionValues.add(value);
    }

    return allOptionValues;
}
}*/
		//30. Write a code to Get the First selected option text in dropdown
		public String firstSelectedOptionText(WebElement element) {
			select = new Select(element);
			WebElement option = select.getFirstSelectedOption();
			String text = option.getText();
			return text;
		}
		//31. Write a code to Verify in dropdown is multi select option?
		public boolean multipleSelectOption(WebElement element) {
			select = new Select(element);
			boolean multiple = select.isMultiple();
			return multiple;
		}
		//32. Write a code to Implicit wait
		public static void implicitWait (int seconds) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
			
		}
		//33.Write a code to Explicit Wait for visibilityOf
		public void explicitWait(WebElement element) {
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.visibilityOf(element));
		}
//		public void explicitWait(WebElement element) {
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//			wait.until(ExpectedConditions.visibilityOf(element));
//		}
		//34.Write a code to verify isDisplayed?
		public boolean isDisplayedElement(WebElement element) {

			boolean displayed = element.isDisplayed();

			return displayed;

			}
		//35.Write a code to Verify isEnabled?
		public boolean isEnabledElement(WebElement element) {

			boolean displayed = element.isEnabled();

			return displayed;

			}
		//36.Write a code to Verify isSelected?
		public boolean isSelectedElement(WebElement element) {
			boolean displayed = element.isSelected();
			return displayed;

			}
		//37.Write a code to de select all selected options
		public void deselectAllOption(WebElement element) {
			select = new Select(element);
			select.deselectAll();
		}
		//38.Write a code to Clear values text Box
		public void clearValueTextBox(WebElement element) {
			element.clear();
		}
		//39.Write a code to TakeScreenshot
		public void takeScreenShot(File desFile) throws IOException {
			TakesScreenshot screenshot =(TakesScreenshot) driver;
			File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, desFile);
		}
		//40.Write a code to TakeScreenshot for Element
			public void takeScreenshotElement(File desFile,WebElement element) throws IOException {
				File srcFile = element.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(srcFile, desFile);
			}
			//41.Write a code to MouseOverAction for single option
			public void mouseOverAction(WebElement element) {
				actions = new Actions(driver);
				actions.moveToElement(element).perform();
				
			}
			//42.Write a code to DragAndDrop
			public void dragAndDrop(WebElement srcElement,WebElement desElement) {
				actions = new Actions(driver);
				actions.dragAndDrop(srcElement, desElement).perform();
			}
			//43.Write a code to RightClick
			public void rightClick(WebElement element) {
				actions = new Actions(driver);
				actions.contextClick(element).perform();
			}
			//44. Write a code to DoubleClick

			public void doubleClick(WebElement element) {
				actions = new Actions(driver);
				actions.doubleClick(element).perform();
			}
			//45.Write a code to Insert value in textBox and Enter
			public void insertValueTextBoxEnter(WebElement element, String data) {
				element.sendKeys(data,Keys.ENTER);
			}
			//46.Write a code for navigation commands (to,forward,backward,refresh)
			public void navigationToCommands(String url) {
				driver.navigate().to(url);
			}
			
			public void navigationBackwardCommands() {
				driver.navigate().back();
			}
			public void navigationForwardCommands() {
				driver.navigate().forward();
			}
			public void navigationRefreshCommands() {
				driver.navigate().refresh();
			}
			//47.Write a code for page scroll down/up 
			public void pageScrollUp(WebElement element) {
				js.executeScript("arguments[0].scrollIntoView(false);", element);
			}
			public void pageScrollDown(WebElement element) {
				js.executeScript("arguments[0].scrollIntoView(true);", element);
			}
			public void sendKeysEnterSearch(WebElement element,String data) {
				element.sendKeys(data,Keys.ENTER);
			}
			public static void quitWindow() {
				driver.quit();
			}
			//Assertequal
			public void assertEqual(String message,String expected, String element) {
				 Assert.assertEquals(message,expected, element);
			}
			//AssertTrue
			public void assertTrue(boolean condition,String message) {
				Assert.assertTrue(message, condition);
			}
			

			///click fourth hotel from last
		public void clickContinueFourthFromLast(List<WebElement> elements) {
    elements.get(elements.size() - 4).click();
		}
    
  //new	//WebElements locator
    public List<WebElement> findElementsssByXpath(String expression) {
        List<WebElement> elements = driver.findElements(By.xpath(expression));
        return elements;
    }
    
    public void enterCheckInDate() throws AWTException {
    	Robot robot = new Robot();
    	robot.keyPress(KeyEvent.VK_TAB);
    	robot.keyRelease(KeyEvent.VK_TAB);
    	
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
	}
    public void enterCheckOutDate() throws AWTException {
    	Robot robot = new Robot();
    	robot.keyPress(KeyEvent.VK_TAB);
    	robot.keyRelease(KeyEvent.VK_TAB);
    	
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
	}
    public void robotButtonSrch() throws AWTException {
    	Robot robot = new Robot();
    	robot.keyPress(KeyEvent.VK_TAB);
    	robot.keyRelease(KeyEvent.VK_TAB);
    	
    	robot.keyPress(KeyEvent.VK_TAB);
    	robot.keyRelease(KeyEvent.VK_TAB);
    	
    	robot.keyPress(KeyEvent.VK_ENTER);
    	robot.keyRelease(KeyEvent.VK_ENTER);
    	
	}
    //get Text JS
    public String getTextUsingJS(String string) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return (String) js.executeScript("return arguments[0].innerText;", string);
    }
  		
    
    public String getTextUsingJSN(String string) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return (String) js.executeScript("return arguments[0].innerText;", string);
    }
  	
}
