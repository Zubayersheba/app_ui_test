package app_ui_test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.testproject.sdk.drivers.ReportingDriver;
import io.testproject.sdk.drivers.android.AndroidDriver;
import io.testproject.sdk.interfaces.junit5.ExceptionsReporter;
import java.lang.Exception;
import java.lang.Override;
import java.time.Duration;
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


@DisplayName("sManager")
public class smanagerLogin implements ExceptionsReporter {
  public static AndroidDriver<? extends MobileElement> driver;

  @BeforeAll
  static void setup() throws Exception {
    driver = new AndroidDriver<>("fs7Aqt1fkyX50ldF_72aDAFaxi3wsFJ9fOzUrYAjZc8", getCapabilities(), "Md. Zubayer Alam Shuvo");
  }
  @DisplayName("sManager")
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

    // 2. Click 'লগইন করুন'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.TextView[@text = 'লগইন করুন']");
    driver.findElement(by).click();

    // 3. Click 'মোবাইল নাম্বার *'
    GeneratedUtils.sleep(500);
    by = By.id("xyz.sheba.managerapp.dev:id/etPhoneNumber");
    driver.findElement(by).click();

    // 4. Type '01755883543' in 'মোবাইল নাম্বার *'
    GeneratedUtils.sleep(500);
    by = By.id("xyz.sheba.managerapp.dev:id/etPhoneNumber");
    driver.findElement(by).sendKeys("01755883543");

    // 5. Make a Swipe gesture from ('764','787') to ('758','534')
    GeneratedUtils.sleep(500);
    (new TouchAction(driver)).press(PointOption.point(764,787))
        				.waitAction(WaitOptions.waitOptions(Duration.ofMillis(300)))
        				.moveTo(PointOption.point(758,534)).release().perform();

    // 6. Click 'পিন কোড *'
    GeneratedUtils.sleep(500);
    by = By.id("xyz.sheba.managerapp.dev:id/etPassword");
    driver.findElement(by).click();

    // 7. Type '14725' in 'পিন কোড *'
    GeneratedUtils.sleep(500);
    by = By.id("xyz.sheba.managerapp.dev:id/etPassword");
    driver.findElement(by).sendKeys("14725");

    // 8. Click 'লগইন করুন1'
    GeneratedUtils.sleep(500);
    by = By.xpath("//android.widget.FrameLayout/android.widget.TextView[@text = 'লগইন করুন']");
    driver.findElement(by).click();

    // 9. Does 'CONTINUE' contain 'CONTINUE'?
    GeneratedUtils.sleep(500);
    by = By.id("xyz.sheba.managerapp.dev:id/btn_submit");
    Assertions.assertTrue(driver.findElement(by).getText().contains("CONTINUE"));

    // 10. Click 'CONTINUE'
    GeneratedUtils.sleep(500);
    by = By.id("xyz.sheba.managerapp.dev:id/btn_submit");
    driver.findElement(by).click();

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