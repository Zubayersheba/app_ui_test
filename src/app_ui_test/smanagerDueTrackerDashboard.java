package app_ui_test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.android.AndroidDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


@DisplayName("sManager Due tracker dashboard")
public class smanagerDueTrackerDashboard implements ExceptionsReporter {
  public static AndroidDriver<? extends MobileElement> driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new AndroidDriver<>("fs7Aqt1fkyX50ldF_72aDAFaxi3wsFJ9fOzUrYAjZc8", getCapabilities(), "Md. Zubayer Alam Shuvo");
  }

  @DisplayName("sManager Due tracker dashboard")
  @ParameterizedTest
  @MethodSource("provideParameters")
  void execute() throws Exception {
    // set timeout for driver actions (similar to step timeout)
    driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    By by;
    boolean booleanResult;

    // 1. Reset App
    //    Clear application data and restart (Auto-generated)
    GeneratedUtils.sleep(500);
    driver.resetApp();

    // 2. Click 'ANDROID.WIDGET.RELATIVELAYOUT'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.FrameLayout[2]/android.widget.RelativeLayout");
    driver.findElement(by).click();

    // 3. Does '১৫ জন কাস্টমার' contain '[NONE]'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.view.View[@content-desc = '১৫ জন কাস্টমার']");
    Assertions.assertTrue(driver.findElement(by).getText().contains(""));

    // 4. Click 'সাপ্লায়ার\nTab 2 of 2'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.view.View[@content-desc = 'সাপ্লায়ার\nTab 2 of 2']");
    driver.findElement(by).click();

    // 5. Does '১৫ জন সাপ্লায়ার' contain '[NONE]'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.view.View[@content-desc = '১৫ জন সাপ্লায়ার']");
    Assertions.assertTrue(driver.findElement(by).getText().contains(""));

    // 6. Click 'Ashik\n১৯ দিন আগে\n৳\n৭০০\nঅগ্রীম পেমেন্ট'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.ImageView[@content-desc = 'Ashik\n১৯ দিন আগে\n৳\n৭০০\nঅগ্রীম পেমেন্ট']");
    driver.findElement(by).click();

    // 7. Does 'Ashik\n+8801755883605\nসাপ্লায়ার' contain '[NONE]'?
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.ImageView[@content-desc = 'Ashik\n+8801755883605\nসাপ্লায়ার']");
    Assertions.assertTrue(driver.findElement(by).getText().contains(""));

  }

  @Override
  public ReportingDriver getDriver() {
    return (ReportingDriver) driver;
  }

  @AfterAll
  static void tearDown() {
    if (driver != null) {
      driver.quit();
    }
  }

  private static Stream provideParameters() throws Exception {
    return Stream.of(Arguments.of());
  }

  public static DesiredCapabilities getCapabilities() {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
    capabilities.setCapability(MobileCapabilityType.UDID, "73a9ccfb0405");
    capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
    capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "YOUR_APP_PACKAGE");
    capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "YOUR_APP_ACTIVITY");
    capabilities.setCapability(MobileCapabilityType.APP, "APP_FILE_PATH");
    return capabilities;
  }
}
