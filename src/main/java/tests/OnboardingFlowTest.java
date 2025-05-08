package tests;

import config.BaseTest;

public class OnboardingFlowTest  extends BaseTest{
	 @Test
	    public void completeOnboardingFlow() {
	        LoginPage login = new LoginPage(driver);
	        login.enterMobile("9999999999");
	        login.tapLogin();

}
