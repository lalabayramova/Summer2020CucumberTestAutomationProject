package com.vytrack.pages;

import com.vytrack.utils.BrowserUtils;
import com.vytrack.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateCarPage extends BasePage {


    @FindBy(css = "[title='Create Car']")
    private WebElement createCarButton;


    @FindBy(name = "custom_entity_type[LicensePlate]")
    private WebElement licensePlateBox;

    @FindBy(name = "custom_entity_type[ModelYear]")
    private WebElement modelYearInputBox;

    public void clickOnCreateCarBtn(){
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),20);
        wait.until(ExpectedConditions.elementToBeClickable(createCarButton)).click();
        System.out.println("Clicking on 'Create car' button");

    }

    public void enterLicensePlate(String licensePlate){
        BrowserUtils.enterText(licensePlateBox,licensePlate);
    }
public void enterModelYear(String modelYear){
        BrowserUtils.enterText(modelYearInputBox,modelYear);
}








}
