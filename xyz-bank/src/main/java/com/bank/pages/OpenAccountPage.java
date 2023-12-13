package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

/**
 * AccountPage - store Transaction, deposit and withdraw
 */
public class OpenAccountPage extends Utility {

    //*********************  OpenAccountPage Methods  ***************************//

    //Search customer that created in first test
    By searchCustomerName = By.id("userSelect");
    public void searchCustomerNameThatCreatedInFirstTest(){
        selectByValueFromDropDown(searchCustomerName, "3");
    }
    //=================================================================================================================//

    //Select currency "Pound"
    By selectCurrency = By.id("currency");
    public void selectCurrency(){
        selectByValueFromDropDown(selectCurrency, "Pound");
}
    //==========================================================================================//

    //click on "process" button
    By processButton = By.xpath("//button[normalize-space()='Process']");
    public void mouseHoverAndClickOnProcessButton(){
        mouseHoverToElementAndClick(processButton);
    }
}
