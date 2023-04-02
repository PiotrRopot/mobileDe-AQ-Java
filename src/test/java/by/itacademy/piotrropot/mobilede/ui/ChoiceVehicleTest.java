package by.itacademy.piotrropot.mobilede.ui;

import by.itacademy.piotrropot.mobilede.steps.ChoiceSteps;
import by.itacademy.piotrropot.mobilede.steps.LoginSteps;
import by.itacademy.piotrropot.mobilede.pages.ChoiceVehiclePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static by.itacademy.piotrropot.mobilede.pages.BasePage.URL;

public class ChoiceVehicleTest {
    WebDriver driver;
    LoginSteps steps;
    ChoiceSteps stepsBy;

    @BeforeEach
    public void openMobilede() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        steps = new LoginSteps(driver);
        stepsBy = new ChoiceSteps(driver);
    }

    @Test
    public void testChoiceVehicle() {
        stepsBy.choiceVehicle();
        Assertions.assertEquals(ChoiceVehiclePage.CHOICE_ELEMENT,
                driver.findElement(By.xpath(ChoiceVehiclePage.TXT_CHOICE)).getText());
    }

    @Test
    public void testFindElement() {
        stepsBy.findElement();
        Assertions.assertTrue((driver.findElements(By.xpath(ChoiceVehiclePage.ELEMENT))).size() >= 1);
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
