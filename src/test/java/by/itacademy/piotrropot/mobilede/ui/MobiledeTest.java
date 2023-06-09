package by.itacademy.piotrropot.mobilede.ui;

import by.itacademy.piotrropot.mobilede.steps.LoginSteps;
import by.itacademy.piotrropot.mobilede.pages.LoginPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static by.itacademy.piotrropot.mobilede.pages.BasePage.URL;

public class MobiledeTest {
    WebDriver driver;
    LoginSteps steps;

    @BeforeEach
    public void OpenMobilede() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        steps = new LoginSteps(driver);
    }

    @Test
    public void testLoginWithCorrectData() {
        steps.loginWithCorrectData();
        WebElement user = driver.findElement(By.xpath(LoginPage.INPUT_USER_PROFILE));
        Assertions.assertTrue(user.isDisplayed());
    }

    @Test
    public void testLoginIncorrectEmail() {
        steps.loginIncorrectEmail();
        Assertions.assertEquals(LoginPage.INPUT_REPEAT,
                driver.findElement(By.xpath(LoginPage.REPEAT_LOGIN)).getText());
    }

    @Test
    public void testLoginWithoutEmail() {
        steps.loginWithoutEmail();
        Assertions.assertEquals(LoginPage.INPUT_REPEAT,
                driver.findElement(By.xpath(LoginPage.REPEAT_LOGIN)).getText());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
