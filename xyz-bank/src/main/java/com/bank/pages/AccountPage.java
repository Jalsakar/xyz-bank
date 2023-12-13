package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
//**************************   Account Page    *********************************//

//Enter amount 100
    By enterDepositAmount = By.xpath("//input[@placeholder='amount']");
    public void enterDepositAmount(){
        sendTextToElement(enterDepositAmount,"1000");
    }
//==========================================================================================================//

//click on "Deposit" Button
    By depositButton = By.xpath("//button[@type='submit']");
    public void mouseHoverAndClickOnDepositButton(){
        mouseHoverToElementAndClick(depositButton);
    }
//==========================================================================================================//

//verify message "Deposit Successful"
    By depositSuccessfulMessage = By.xpath(" //span[@class='error ng-binding']");
    public String verifyDepositSuccessfulMessage(){
        return getTextFromElement(depositSuccessfulMessage);
    }
//==========================================================================================================//

//click on "Withdrawal" Tab - AccountPage
    By withdrawalTab = By.xpath("//button[normalize-space()='Withdrawl']");
    public void mouseHoverAndClickOnWithdrawalTab(){
        mouseHoverToElementAndClick(withdrawalTab);
    }
//==========================================================================================================//

//Enter amount 50 - BankManagerLoginPage
    By enterWithdrawalAmount = By.xpath("//input[@placeholder='amount']");
    public void enterWithdrawalAmount(){
        sendTextToElement(enterWithdrawalAmount,"50");
    }
//==========================================================================================================//

//click on "Withdraw" Button - BankManagerLoginPage
    By withdrawalButton = By.xpath("//button[normalize-space()='Withdraw']");
    public void mouseHoverAndClickOnWithdrawalButton(){
        mouseHoverToElementAndClick(withdrawalButton);
    }
//==========================================================================================================//

//verify message "Transaction Successful" - BankManagerLoginPage
    By transactionSuccessfulMessage = By.xpath("//span[contains(text(),'Transaction successful')]");
    public String verifyTransactionSuccessfulMessage(){
        return getTextFromElement(transactionSuccessfulMessage);
    }

}
