package com.it.tests;

import com.it.users.User;
import com.it.users.UserFactory;
import org.seleniumhq.jetty9.server.Authentication;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MyTest extends BaseTest{
//    public static final String AUTOMATE_USERNAME = "";
//    public static final String AUTOMATE_ACCESS_KEY = "";
//    public static final String MY_URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
    private static int count;

    @Test
    public void myTest(){
        app.login.login(validUser);
        Assert.assertEquals(app.board.getLbUserEmail(),validUser.email);

    }


}