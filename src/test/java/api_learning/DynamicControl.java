package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import support.ui.SelectEx;
import url.Urls;

public class DynamicControl {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();

        try{


        }catch (Exception e){
            e.printStackTrace();
        }

        driver.quit();
    }
}
