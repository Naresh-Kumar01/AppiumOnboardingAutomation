package pages;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OnboardingPage {
	private AndroidDriver<MobileElement> driver;
    private WebDriverWait wait;

    public OnboardingPage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 15);
    }

    // Locators (Use Accessibility ID or Resource ID if possible)
    private By uploadProfilePicBtn = By.id("com.example.app:id/btnUpload"); // Example ID
    private By skipProfilePicBtn = By.id("com.example.app:id/btnSkip");     // Example ID
    private By interestOption1 = By.id("com.example.app:id/interest_music");
    private By interestOption2 = By.id("com.example.app:id/interest_sports");
    private By nextBtn = By.id("com.example.app:id/btnNext");
    private By preferenceSlider = By.id("com.example.app:id/sliderVolume");
    private By toggleSwitch = By.id("com.example.app:id/switchNotifications");
    private By submitBtn = By.id("com.example.app:id/btnSubmit");
    private By alertMessage = By.id("android:id/message");
    private By waitlistPageText = By.id("com.example.app:id/waitlistText");

    // Actions
    public void skipProfilePicture() {
        wait.until(ExpectedConditions.elementToBeClickable(skipProfilePicBtn)).click();
    }

    public void uploadProfilePicture() {
        wait.until(ExpectedConditions.elementToBeClickable(uploadProfilePicBtn)).click();
        // Add logic for selecting image from gallery if applicable
    }

    public void answerQuestionnaire() {
        wait.until(ExpectedConditions.elementToBeClickable(interestOption1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(interestOption2)).click();
        driver.findElement(nextBtn).click();

        // Interact with slider (if any)
        MobileElement slider = driver.findElement(preferenceSlider);
        int startX = slider.getLocation().getX();
        int width = slider.getSize().getWidth();
        driver.swipe(startX, slider.getLocation().getY(), startX + (int)(width * 0.8), slider.getLocation().getY(), 1000);

        // Toggle a switch
        driver.findElement(toggleSwitch).click();
    }

    public void submitOnboarding() {
        driver.findElement(submitBtn).click();
    }

    public boolean isOnWaitlistPage() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(waitlistPageText)).isDisplayed();
    }

    public boolean isValidationAlertShown() {
        try {
            return driver.findElement(alertMessage).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}
