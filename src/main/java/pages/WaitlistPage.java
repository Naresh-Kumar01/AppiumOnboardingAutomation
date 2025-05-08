package pages;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitlistPage {
	
	 private AndroidDriver<MobileElement> driver;
	    private WebDriverWait wait;

	    public WaitlistPage(AndroidDriver<MobileElement> driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, 15);
	    }

	    // Locators
	    private By waitlistHeader = By.id("com.example.app:id/tvWaitlistHeader");
	    private By descriptionText = By.id("com.example.app:id/tvWaitlistDescription");
	    private By backToHomeBtn = By.id("com.example.app:id/btnBackToHome"); // optional

	    // Actions
	    public boolean isWaitlistDisplayed() {
	        return wait.until(ExpectedConditions.visibilityOfElementLocated(waitlistHeader)).isDisplayed();
	    }

	    public String getWaitlistDescription() {
	        return wait.until(ExpectedConditions.visibilityOfElementLocated(descriptionText)).getText();
	    }

	    public void clickBackToHome() {
	        wait.until(ExpectedConditions.elementToBeClickable(backToHomeBtn)).click();
	    }

}
