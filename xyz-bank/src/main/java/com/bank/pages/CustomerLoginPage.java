package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    //************************** Customer Login Page *************************//

//click on "Deposit" Tab
    By depositTab = By.xpath("//button[normalize-space()='Deposit']");
    public void mouseHoverAndClickOnDepositTab(){
        mouseHoverToElementAndClick(depositTab);
    }

}
