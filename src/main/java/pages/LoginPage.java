package pages;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
public class LoginPage {
	AndroidDriver driver;

    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }

    By mobileField = By.id("com.example.app:id/mobile_input");
    By loginButton = By.id("com.example.app:id/login_button");

    public void enterMobile(String mobile) {
        driver.findElement(mobileField).sendKeys(mobile);
    }

    public void tapLogin() {
        driver.findElement(loginButton).click();
    }

}
