package com.it.tests;

import com.it.users.User;
import com.it.users.UserFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    static App app = new App();
    static User validUser = UserFactory.getValidUser();

    @AfterSuite
    public void tearDown(){
        app.common.stopApp();
    }
}
