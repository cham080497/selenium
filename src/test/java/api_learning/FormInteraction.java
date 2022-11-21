package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.WebDriver;

public class FormInteraction {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();

        try{
            // Navigate to the dropdown page
            driver.get("https://the-internet.herokuapp.com/");

            //Locate the select tag / Dropdown

            //Select by visible text

            //select by index

            //select by value

            //debug purpose value

        }catch (Exception e){
            e.printStackTrace();
        }
        driver.quit();
    }
}
