package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LangaugePortalPage {
    public LangaugePortalPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath="(//span[@style='vertical-align: middle;'])/a/span[1]")
    public WebElement languageButton;

    @FindBy(xpath="(//div[@class='drainagebanner'])/a/div")
    public WebElement norwegianLanguage;

    @FindBy(xpath = "(//span[@style='vertical-align: middle;'])/a/span[1]")
    public WebElement actualText;


}
