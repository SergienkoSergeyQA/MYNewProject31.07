package com.it.tests;

import com.it.helpers.CommonHelper;
import com.it.helpers.DashBoardHelper;
import com.it.helpers.LoginHelper;

public class App {
    public CommonHelper common;
    public LoginHelper login;
    public DashBoardHelper board;

    public App(){
        common = new CommonHelper();
        login = new LoginHelper();
        board = new DashBoardHelper();
    }

}
