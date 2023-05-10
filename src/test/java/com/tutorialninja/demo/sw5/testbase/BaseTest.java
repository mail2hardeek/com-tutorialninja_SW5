package com.tutorialninja.demo.sw5.testbase;

import com.tutorialninja.demo.sw5.propertyreader.PropertyReader;
import com.tutorialninja.demo.sw5.utility.Utilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utilities {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
