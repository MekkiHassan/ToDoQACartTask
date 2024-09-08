package com.qacart.todo.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePages {
     protected static WebDriver driver;
    public BasePages(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

}
