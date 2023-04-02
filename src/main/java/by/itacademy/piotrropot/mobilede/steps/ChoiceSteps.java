package by.itacademy.piotrropot.mobilede.steps;

import by.itacademy.piotrropot.mobilede.pages.BasePage;

import by.itacademy.piotrropot.mobilede.pages.ChoiceVehiclePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ChoiceSteps {

    WebDriver driver;

    public ChoiceSteps(WebDriver driver) {

        this.driver = driver;
    }

    public void choiceVehicle() {
        driver.findElement(By.xpath(BasePage.IN)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_BRAND)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_BRAND_BMW)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_MODEL)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_MODEL_BMW)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_SELECT)).click();
    }

    public void findElement() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath(BasePage.IN)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_BRAND)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_BRAND_BMW)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_MODEL)).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_MODEL_BMW)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.BTN_SELECT)).click();
        driver.findElement(By.xpath(ChoiceVehiclePage.ELEMENT));
    }
}
