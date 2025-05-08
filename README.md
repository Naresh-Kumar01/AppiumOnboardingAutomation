Appium Onboarding Automation Framework
Overview
A robust mobile automation framework built using Appium and Java for testing the complete onboarding flow including login, OTP handling, profile setup, and waitlist screen functionality on Android emulators and real devices.
Features

Page Object Model: Clean separation between test logic and UI elements
Cross-Device Testing: Compatible with both Android emulators and physical devices
Comprehensive Test Coverage:

Login functionality (email, social, phone)
OTP validation and handling
User profile setup and validation
Waitlist functionality testing


Robust Reporting: Detailed test reports with screenshots
Flexible Configuration: Easily configurable for different environments

Prerequisites

Java JDK 11 or higher
Maven 3.6.3 or higher
Appium 2.0+
Android SDK (for emulator testing)
Android device with USB debugging enabled (for real device testing)
Node.js (for Appium server)

Project Structure
AppiumOnboardingAutomation/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── onboarding/
│   │   │           ├── pages/           # Page Object classes
│   │   │           ├── utils/           # Utility helpers
│   │   │           └── driver/          # Driver management
│   │   └── resources/                   # Configuration files
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── onboarding/
│       │           ├── tests/           # Test classes
│       │           └── suites/          # Test suites
│       └── resources/
│           └── testdata/                # Test data files
├── target/                              # Compiled code
├── test-output/                         # Test reports
├── pom.xml                              # Maven dependencies
└── README.md                            # Project documentation
Setup Instructions
1. Environment Setup
bash# Install Node.js and npm
sudo apt install nodejs npm

# Install Appium
npm install -g appium

# Install Appium Doctor to verify setup
npm install -g appium-doctor
appium-doctor --android

# Install Maven
sudo apt install maven
2. Clone Repository
bashgit clone https://github.com/YourUsername/AppiumOnboardingAutomation.git
cd AppiumOnboardingAutomation
3. Configure Environment

Update config.properties with your device details and app path
Ensure Android SDK environment variables are set correctly

4. Run Tests
bash# Start Appium server
appium --base-path /wd/hub

# Run tests using Maven
mvn clean test
Key Test Scenarios
1. Login Flow

Email login with valid/invalid credentials
Phone number login with OTP verification
Social login integration testing

2. OTP Handling

OTP request and validation
OTP resend functionality
OTP timeout handling

3. Profile Setup

Mandatory field validation
Profile photo upload
User preferences selection

4. Waitlist Functionality

Waitlist registration
Position checking
Notification opt-in

Configuration Options
Configuration can be modified in src/main/resources/config.properties:
properties# Device Configuration
platform=Android
deviceName=Pixel_4_API_30
platformVersion=11.0

# Application Details
appPackage=com.yourcompany.app
appActivity=com.yourcompany.app.MainActivity

# Test Settings
implicitWait=10
explicitWait=15
screenshotOnFailure=true

# Environment
environment=QA
Reporting
Test reports are generated in the test-output directory after execution. The framework uses:

Extent Reports for HTML reporting
Screenshots attached for failed tests
Test execution logs with timestamps

CI/CD Integration
This framework can be integrated with CI/CD pipelines:

Jenkins pipeline configuration included in Jenkinsfile
GitHub Actions workflow in .github/workflows/android-tests.yml
BrowserStack/SauceLabs integration for cloud testing

Troubleshooting
Common Issues

Connection Refused: Ensure Appium server is running
Device Not Found: Check USB debugging is enabled or emulator is running
Element Not Found: May require increasing wait times in high-latency environments

For additional support, please create an issue in the GitHub repository.
Contributing

Fork the repository
Create feature branch (git checkout -b feature/amazing-feature)
Commit changes (git commit -m 'Add amazing feature')
Push to branch (git push origin feature/amazing-feature)
Open a Pull Request

License
This project is licensed under the MIT License - see the LICENSE file for details.
