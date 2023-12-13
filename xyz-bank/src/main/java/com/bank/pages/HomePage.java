package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;


public class HomePage extends Utility {

    //************************************  HomePage Methods  **********************************//

    //Click On "Bank Manager Login" Tab
    By bankManagerLoginTab = By.xpath("//button[normalize-space()='Bank Manager Login']");
    public void mouseHoverAndClickOnBankManagerLoginTab() {
        mouseHoverToElementAndClick(bankManagerLoginTab);
    }
    //=========================================================================================================//

    //Click on "Home" Button
    By homeButton = By.xpath("//button[normalize-space()='Home']");
    public void clickOnHomeButton(){
        clickOnElement(homeButton);
    }
    //==========================================================================================================//

    //Click on "Customer Login"
    By customerLoginButton = By.xpath("//button[normalize-space()='Customer Login']");
    public void clickOnCustomerLoginButton(){
        clickOnElement(customerLoginButton);
    }

}
