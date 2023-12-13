package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {

    //************************** Add Customer Page *************************//

    //enter FirstName
    By enterFirstName = By.xpath("//input[@placeholder='First Name']");
    public void enterCustomerFirstName(String name) {
        sendTextToElement(enterFirstName, name);
    }
    //====================================================================================================//

    //enter LastName
    By enterLastName = By.xpath("//input[@placeholder='Last Name']");

    public void enterCustomerLastName(String sureName) {
        sendTextToElement(enterLastName, sureName);
    }
    //=================================================================================================//

    //enter PostCode
    By enterPostCode = By.xpath("//input[@placeholder='Post Code']");

    public void enterCustomerPostCode(String postcode) {
        sendTextToElement(enterPostCode, postcode);
    }
    //======================================================================================================//

    //click On "Add Customer" Button
    By addCustomerButton = By.xpath("//button[@type='submit']");
    public void clickOnAddCustomerButton() {
        clickOnElement(addCustomerButton);
    }

}
