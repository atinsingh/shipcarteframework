package io.pragra.testing.framework.pages.home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopBar {

    WebDriver driver ;

    @FindBy(css = "#black-topbar ul>li:nth-child(1)")
    WebElement requestDemo;
    @FindBy(css = "#black-topbar ul>li:nth-child(2)")
    WebElement one800Number;

    @FindBy(css = "#black-topbar ul>li:nth-child(3)")
    WebElement resoueces;

    @FindBy(css = "#black-topbar ul>li:nth-child(4)")
    WebElement support;

    public TopBar(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickRequestDemo(){
        this.requestDemo.click();
    }


}
