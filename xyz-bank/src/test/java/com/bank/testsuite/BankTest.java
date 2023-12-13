package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

//1.BankTest - Inside This create test methods
public class BankTest extends BaseTest {
    HomePage homePage = new HomePage();
    AccountPage accountPage = new AccountPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    CustomersPage customersPage = new CustomersPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();

    //--------------------------------------------------------------------------------------------------------------//
//1.bankManagerShouldAddCustomerSuccessfully.
    @Test
    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {

//click On "Bank Manager Login" Tab - HomePage
        Thread.sleep(2000);
        homePage.mouseHoverAndClickOnBankManagerLoginTab();

//click On "Add Customer" Tab - BankManagerLoginPage
        Thread.sleep(2000);
        bankManagerLoginPage.mouseHoverAndClickOnAddCustomerTab();

//enter FirstName - AddCustomerPage
        Thread.sleep(2000);
        addCustomerPage.enterCustomerFirstName("Ron");

//enter LastName - AddCustomerPage
        Thread.sleep(2000);
        addCustomerPage.enterCustomerLastName("Weasly");

//enter PostCode - AddCustomerPage
        Thread.sleep(2000);
        addCustomerPage.enterCustomerPostCode("320056");

//click On "Add Customer" Button - AddCustomerPage
        Thread.sleep(2000);
        addCustomerPage.clickOnAddCustomerButton();

//popup display - AddCustomerPage
        Thread.sleep(2000);
        switchToAlert();

//verify message "Customer added successfully" - AddCustomerPage
        Thread.sleep(2000);
        getTextFromAlert();

//click on "ok" button on popup - AddCustomerPage
        Thread.sleep(2000);
        acceptAlert();

// click on Home Button - HomePage
        Thread.sleep(2000);
        homePage.clickOnHomeButton();

    }

    //--------------------------------------------------------------------------------------------------------------------//
//2. bankManagerShouldOpenAccountSuccessfully.
    @Test
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {

//click On "Bank Manager Login" Tab - HomePage
        Thread.sleep(2000);
        homePage.mouseHoverAndClickOnBankManagerLoginTab();

//click On "Open Account" Tab - BankManagerPage
        Thread.sleep(2000);
        bankManagerLoginPage.mouseHoverAndClickOnOpenAccountTab();

//Search customer that created in first test - OpenAccountPage
        Thread.sleep(2000);
        openAccountPage.searchCustomerNameThatCreatedInFirstTest();

//Select currency "Pound" - OpenAccountPage
        Thread.sleep(2000);
        openAccountPage.selectCurrency();

//click on "process" button - OpenAccountPage
        Thread.sleep(2000);
        openAccountPage.mouseHoverAndClickOnProcessButton();

//popup displayed - OpenAccountPage
        Thread.sleep(2000);
        switchToAlert();

//verify message "Account created successfully" - OpenAccountPage
        Thread.sleep(2000);
        getTextFromAlert();

//click on "ok" button on popup - OpenAccountPage
        Thread.sleep(2000);
        acceptAlert();

// click on Home Button - HomePage
        Thread.sleep(2000);
        homePage.clickOnHomeButton();

    }

    //--------------------------------------------------------------------------------------------------------------------//
//3. customerShouldLoginAndLogoutSuccessfully.
    @Test
    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException {

//click on "Customer Login" Tab - CustomerLoginPage
        Thread.sleep(2000);
        homePage.clickOnCustomerLoginButton();

//search customer that you created. - OpenAccountPage
        Thread.sleep(2000);
        openAccountPage.searchCustomerNameThatCreatedInFirstTest();

//click on "Login" Button - CustomersPage
        Thread.sleep(2000);
        customersPage.mouseHoverAndClickOnLoginButton();

//verify "Logout" Tab displayed. - CustomerLoginPage
        Thread.sleep(2000);
        String actualDisplayedTab = customersPage.verifyLogOutTabIsDisplay();
        String expectedDisplayedTab = "Logout";
        Assert.assertEquals(actualDisplayedTab, expectedDisplayedTab, "Logout Tab is not displayed.");

//click on "Logout" - CustomersPage
        Thread.sleep(2000);
        customersPage.mouseHoverAndClickOnLogOutButton();

//verify "Your Name" text displayed. - CustomersPage
        Thread.sleep(2000);
        String actualYourNameText = customersPage.verifyYourNameTextIsDisplayed();
        String expectedYourNameText = customersPage.verifyYourNameTextIsDisplayed();
        Assert.assertEquals(actualYourNameText, expectedYourNameText, "Your Name Text is not displayed.");

//click on Home Button - HomePage
        Thread.sleep(2000);
        homePage.clickOnHomeButton();
    }

    //--------------------------------------------------------------------------------------------------------------------//
//4. customerShouldDepositMoneySuccessfully.
    @Test
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {

//click on "Customer Login" Tab - Home Page
        Thread.sleep(2000);
        homePage.clickOnCustomerLoginButton();

//search customer that you created. - OpenAccountPage
        Thread.sleep(2000);
        openAccountPage.searchCustomerNameThatCreatedInFirstTest();

//click on "Login" Button - CustomersPage
        Thread.sleep(2000);
        customersPage.mouseHoverAndClickOnLoginButton();

//click on "Deposit" Tab - CustomersLoginPage
        Thread.sleep(2000);
        customerLoginPage.mouseHoverAndClickOnDepositTab();

//Enter amount 100 - AccountPage
        Thread.sleep(2000);
        accountPage.enterDepositAmount();

//click on "Deposit" Button - AccountPage
        Thread.sleep(2000);
        accountPage.mouseHoverAndClickOnDepositButton();

//verify message "Deposit Successful" - BankManagerLoginPage
        Thread.sleep(2000);
        String actualDepositSuccessfulMessage = accountPage.verifyDepositSuccessfulMessage();
        String expectedDepositSuccessfulMessage = "Deposit Successful";
        Assert.assertEquals(actualDepositSuccessfulMessage, expectedDepositSuccessfulMessage, "Denied.");

//click on Home Button - HomePage
        Thread.sleep(2000);
        homePage.clickOnHomeButton();
//    }

        //--------------------------------------------------------------------------------------------------------------------//
//5. customerShouldWithdrawMoneySuccessfully
//    @Test
//    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {

//click on "Customer Login" Tab - HomePage
        Thread.sleep(2000);
        homePage.clickOnCustomerLoginButton();

//search customer that you created. - CustomerLoginPage
        Thread.sleep(2000);
        openAccountPage.searchCustomerNameThatCreatedInFirstTest();

//click on "Login" Button - CustomersPage
        Thread.sleep(2000);
        customersPage.mouseHoverAndClickOnLoginButton();

//click on "Withdrawal" Tab - AccountPage
        Thread.sleep(2000);
        accountPage.mouseHoverAndClickOnWithdrawalTab();

//Enter amount 50 - AccountPage
        Thread.sleep(2000);
        accountPage.enterWithdrawalAmount();

//click on "Withdraw" Button - AccountPage
        Thread.sleep(2000);
        accountPage.mouseHoverAndClickOnWithdrawalButton();

//verify message "Transaction Successful" - AccountPage
        Thread.sleep(2000);
        String actualTransactionMessage = accountPage.verifyTransactionSuccessfulMessage();
        String expectedTransactionMessage = "Transaction successful";
        Assert.assertEquals(actualTransactionMessage, expectedTransactionMessage, "Transaction is not successful.");

//click on Home Button - HomePage
        Thread.sleep(2000);
        homePage.clickOnHomeButton();
    }
}//End of project