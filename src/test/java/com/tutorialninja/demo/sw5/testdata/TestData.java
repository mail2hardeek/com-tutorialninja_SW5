package com.tutorialninja.demo.sw5.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "credentials")
    public Object[][] getData(){
        Object[][] data =new Object[][]{
                {"HARRY", "VD", "Prim9223323@gmail.com","02089233466", "Prime1234", "Prime1234"},
        };
        return data;
    }


    @DataProvider(name = "details")
    public Object[][] getData1(){
        Object[][] data =new Object[][]{
                {"Prim98473@gmail.com", "Prime1234"},
        };
        return data;
    }
}

