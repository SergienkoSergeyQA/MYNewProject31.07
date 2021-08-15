package com.it.driver;

import com.it.common.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

import static com.it.common.Constants.Base_URL;

public class DriverFactory {
    public static WebDriver getWebDriver() {
        WebDriver driver = null;
        String driverNmae = System.getProperty("driver");
        if (driverNmae != null){
            if ("fireFox".equals(driverNmae)) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if ("ie".equals(driverNmae)) {
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
            } else if ("edge".equals(driverNmae)) {
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            } else if ("chrome".equals(driverNmae)) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else {
                throw new UnsupportedOperationException();
            }
    }else {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(Base_URL);
            return driver;
        }
    }

