package com.vytrack.step_definitions;

import com.vytrack.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.concurrent.TimeUnit;

public class Hooks {


    @Before
public void setup(Scenario scenario){
        System.out.println(scenario.getSourceTagNames());
        System.out.println(":::Automation is starting:::");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}

// this hook will run only before scenarios that have tag @db
@Before("@db")
public void dbSetup(){
    System.out.println(":::Connecting to the database:::");
}


@After("@db")
public void dbTearDown(){
        System.out.println(":::Disconnecting from the database:::");
}


// hook after = after method in testng
@After
public void tearDown(){
    Driver.closeDriver();
    System.out.println(":::End of test execution:::");
}

}
