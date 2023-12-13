package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {

    //************************** Bank Manager Page *************************//

    //Click On "Add Customer" Tab
    By addCustomerTab = By.xpath("//button[normalize-space()='Add Customer']");

    public void mouseHoverAndClickOnAddCustomerTab() {
        mouseHoverToElementAndClick(addCustomerTab);
    }
    //=======================================================================================//

    //click On "Open Account" Tab
    By openAccountTab = By.xpath("//button[normalize-space()='Open Account']");
    public void mouseHoverAndClickOnOpenAccountTab(){
        mouseHoverToElementAndClick(openAccountTab);
    }
    //=======================================================================================//

    //Click On "Customers" Tab
    By customersTab = By.xpath("//button[normalize-space()='Customers']");
    public void mouseHoverAndClickObCustomersTab(){
        mouseHoverToElementAndClick(customersTab);
    }
}
