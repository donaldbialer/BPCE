package BPCE;

import org.openqa.selenium.By;

public class BasePage extends DriverWrapper {


    //Click locator
    public void clickOn(By locator) {
        DriverWrapper.getDriver().findElement(locator).click();
    }

    //Enter value to Input Fields
    public void setValueToInputField(By locator, String value) {
        DriverWrapper.getDriver().findElement(locator).sendKeys(value);
    }

    //Convert the locator value to text.  Use in Assertions.
    public String getTextFromElement(By locator) {
        return DriverWrapper.getDriver().findElement(locator).getText();
    }

    //isSelected command
    public boolean getIsSelected(By locator) {
        return DriverWrapper.getDriver().findElement(locator).isSelected();
    }

    //isEnabled command
    public boolean getIsEnabled(By locator) {
        return DriverWrapper.getDriver().findElement(locator).isEnabled();

    }

    //isDisplayed command
    public boolean isDisplayed(By locator) {
        return DriverWrapper.getDriver().findElement(locator).isDisplayed();

    }
}
