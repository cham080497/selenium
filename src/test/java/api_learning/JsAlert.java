package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;

import java.sql.Driver;

public class JsAlert {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();

        try{

        }catch (Exception e){
            e.printStackTrace();
        }
        driver.quit();
    }
}
