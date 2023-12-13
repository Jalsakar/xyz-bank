package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {

    //****************  CustomersPage Methods  ***************************//

    //click on "Login" Button
    By loginButton = By.xpath("//button[normalize-space()='Login']");
    public void mouseHoverAndClickOnLoginButton(){
        mouseHoverToElementAndClick(loginButton);
    }

    //=======================================================================================//
    By logOutButton = By.xpath("//button[normalize-space()='Logout']");
    //1.verify "Logout" Tab displayed.
    public String verifyLogOutTabIsDisplay(){
       return getTextFromElement(logOutButton);
    }
    //2.click on "Logout" - CustomersPage
    public void mouseHoverAndClickOnLogOutButton(){
        mouseHoverToElementAndClick(logOutButton);
    }

    //=======================================================================================//

    //verify "Your Name" text displayed.
    By yourNameText = By.xpath("//select[@id='userSelect']");
    public String verifyYourNameTextIsDisplayed(){
        return getTextFromElement(yourNameText);
    }

}
