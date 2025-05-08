package pages;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
public class PermissionHandlePage {
	
	 AndroidDriver driver;

	    // Standard ID for "Allow" button on Android permission popups
	    private By allowButton = By.id("com.android.packageinstaller:id/permission_allow_button");

	    public PermissionHandlePage(AndroidDriver driver) {
	        this.driver = driver;
	    }

	    public void handlePermissions() {
	        for (int i = 0; i < 3; i++) { // Try up to 3 permission popups
	            try {
	                if (driver.findElement(allowButton).isDisplayed()) {
	                    driver.findElement(allowButton).click();
	                    Thread.sleep(500); // slight delay to allow UI update
	                }
	            } catch (NoSuchElementException | InterruptedException e) {
	                // No more permission popups or UI not ready
	                break;
	            }
	        }
	    }
	

}
