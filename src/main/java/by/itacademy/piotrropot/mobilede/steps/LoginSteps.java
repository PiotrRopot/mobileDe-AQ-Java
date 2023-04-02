package by.itacademy.piotrropot.mobilede.steps;

import by.itacademy.piotrropot.mobilede.pages.BasePage;

import by.itacademy.piotrropot.mobilede.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginSteps {

    WebDriver driver;

    public LoginSteps(WebDriver driver) {

        this.driver = driver;
    }

    public void loginWithCorrectData() {
        driver.findElement(By.xpath(BasePage.IN)).click();
        driver.findElement(By.xpath(LoginPage.BTN_ACCAUNT)).click();
        driver.findElement(By.xpath(LoginPage.INPUT_EMAIL)).sendKeys("Ropot.piotr@gmail.com");
        driver.findElement(By.xpath(LoginPage.INPUT_PASSWORD)).sendKeys("MinskBelarus123");
        driver.findElement(By.xpath(LoginPage.BTN_REGISTER)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.xpath(LoginPage.INPUT_PASSWORD)).sendKeys("MinskBelarus123");
        driver.findElement(By.xpath(LoginPage.BTN_REGISTER)).click();
    }

    public void loginIncorrectEmail() {
        driver.findElement(By.xpath(BasePage.IN)).click();
        driver.findElement(By.xpath(LoginPage.BTN_ACCAUNT)).click();
        driver.findElement(By.xpath(LoginPage.INPUT_EMAIL)).sendKeys("R@gmail.com");
        driver.findElement(By.xpath(LoginPage.INPUT_PASSWORD)).sendKeys("MinskBelarus123");
        driver.findElement(By.xpath(LoginPage.BTN_REGISTER)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public void loginWithoutEmail() {
        driver.findElement(By.xpath(BasePage.IN)).click();
        driver.findElement(By.xpath(LoginPage.BTN_ACCAUNT)).click();
        driver.findElement(By.xpath(LoginPage.INPUT_PASSWORD)).sendKeys("MinskBelarus123");
        driver.findElement(By.xpath(LoginPage.BTN_REGISTER)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }
}
