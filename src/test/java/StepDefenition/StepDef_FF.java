package StepDefenition;

import java.io.IOException;

import commonFunctions.functionLibrary;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef_FF extends functionLibrary {


@Given("launch Browser")
public void launch_browser() throws Throwable, Throwable {
    driver =functionLibrary.startBsr(driver);
}
@Given("launch Url")
public void launch_url() {
    functionLibrary.url();
}
@When("wait for username with {string} and {string}")
public void wait_for_username_with_and(String loctype, String locval) {
    functionLibrary.waitforElement(loctype, locval, "10");
}
@When("enter username with {string} and {string} and {string}")
public void enter_username_with_and_and(String loctype, String locval, String testdata) throws Throwable {
   functionLibrary.typeAction(loctype,locval,testdata);
}
@When("enter password with {string} and {string} and {string}")
public void enter_password_with_and_and(String loctype, String locval,String testdata) throws Throwable {
    functionLibrary.typeAction(loctype, locval, testdata);
}
@When("click Login Button with {string} and {string}")
public void click_login_button_with_and(String loctype, String locval) throws Throwable {
	functionLibrary.clickAction(loctype, locval);
    
}
@When("wait for logoutlink with {string} and {string}")
public void wait_for_logoutlink_with_and(String loctype, String locval) {
    functionLibrary.waitforElement(loctype, locval, "10");
}
@When("verify that page title with {string}")
public void verify_that_page_title_with(String actual) {
	functionLibrary.Page_Title(actual);
    
}
@When("wait for supplier link with {string} and {string}")
public void wait_for_supplier_link_with_and(String loctype, String locval) {
    functionLibrary.waitforElement(loctype, locval, "10");
}
@When("click that supplier link with {string} and {string}")
public void click_that_supplier_link_with_and(String loctype, String locval) throws Throwable {
	functionLibrary.clickAction(loctype, locval);
   
}
@When("wait for add btn with {string} and {string}")
public void wait_for_add_btn_with_and(String loctype, String locval) {
	functionLibrary.waitforElement(loctype, locval, "10");
   
}
@When("click that add btn with {string} and {string}")
public void click_that_add_btn_with_and(String loctype, String locval) throws Throwable {
    functionLibrary.clickAction(loctype, locval);
}
@When("wait for supplier number with {string} and {string}")
public void wait_for_supplier_number_with_and(String loctype, String locval) {
	functionLibrary.waitforElement(loctype, locval, "10");
    
}
@When("capture that supplier number with {string} and {string}")
public void capture_that_supplier_number_with_and(String loctype, String locval) {
    functionLibrary.supplierNum(loctype, locval);
}
@When("Enter in {string} with {string} and {string}")
public void fillSupplierForm(String testdata, String loctype, String locval) throws Throwable {
    functionLibrary.typeAction(loctype, locval, testdata);
}
@When("click add btn with {string} and {string}")
public void click_add_btn_with_and(String loctype, String locval) throws Throwable {
	functionLibrary.clickAction(loctype, locval);
    
}
@When("wait for confirm btn with {string} and {string}")
public void wait_for_confirm_btn_with_and(String loctype, String locval) {
   functionLibrary.waitforElement(loctype, locval, "10");
}
@When("I click confrim btn with {string} and {string}")
public void i_click_confrim_btn_with_and(String loctype, String locval) throws Throwable {
    functionLibrary.clickAction(loctype, locval);
}
@When("wait for alert btn with {string} and {string}")
public void wait_for_alert_btn_with_and(String loctype, String locval) {
    functionLibrary.waitforElement(loctype, locval, "10");
}
@When("i click alert btn with {string} and {string}")
public void i_click_alert_btn_with_and(String loctype, String locval) throws Throwable {
	functionLibrary.clickAction(loctype, locval);
    
}
@Then("Verify supplier number")
public void verify_supplier_number() throws Throwable {
    functionLibrary.supplierTable();
}
@When("Close app browser")
public void close_app_browser() {
    functionLibrary.closeBwsr();
}

}
