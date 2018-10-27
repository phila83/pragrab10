package com.bulsoft.zoomautomation.drivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    private String browerType = "chrome";

    private  static WebDriver driver;

    private DriverManager(){
        if(browerType.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","/Users/atinsingh/Downloads/chromedriver");
            driver = new ChromeDriver();
        }else {
            if(browerType.equals("firefox")){
                System.setProperty("webdriver.gecko.driver","/Users/atinsingh/Downloads/chromedriver");
                driver = new FirefoxDriver();
            }
        }

    }
    public static WebDriver getInstance(){
        if(driver==null){
            new DriverManager();
        }
        return driver;
    }


}
