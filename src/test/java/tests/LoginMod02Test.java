package tests;

import driver.DriverFactory;
import models.pages.LoginPageMod02;
import org.openqa.selenium.WebDriver;
import url.Urls;

public class LoginMod02Test {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try{
            driver.get(Urls.HEROKU_BASE_URL.concat(Urls.LOGIN_FORM_SLUG));

            LoginPageMod02 loginPage = new LoginPageMod02(driver);
            loginPage.inputUsername("Teo");
            loginPage.inputPassword("12345678");
            loginPage.clickOnLoginBtn();

            //debug
            Thread.sleep(2000);

        }catch (Exception e){
            e.printStackTrace();
        }
        driver.quit();
    }
}
