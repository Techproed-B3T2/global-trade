package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.Select;
import pages.LangaugePortalPage;
import utilities.ConfigReader;
import utilities.Driver;

public class LanguagePortalStepsDefinitions {

    LangaugePortalPage langaugePortalPage=new LangaugePortalPage();

    @Given("user is on the global trader page")
    public void user_is_on_the_global_trader_page()  throws InterruptedException{
        Driver.getDriver().get(ConfigReader.getProperty("glb_trader"));
        Thread.sleep(3000);

    }
 @Given("user click on the Language Portal")
    public void user_click_on_the_Language_Portal() throws InterruptedException {
        langaugePortalPage.languageButton.click();
        Thread.sleep(3000);

    }

    @Given("user select the Norwegian language")
    public void user_select_the_Norwegian_language() throws InterruptedException {
        langaugePortalPage.norwegianLanguage.click();
        Thread.sleep(3000);
    }

    @Then("verify on the language portal box and language is selected Norwegian")
    public void verify_on_the_language_portal_box_and_language_is_selected_Norwegian() {

    }

}
