package tests;

import driver.DriverFactory;
import models.pages.LoginPageMod01;
import org.openqa.selenium.WebDriver;
import url.Urls;

public class LoginMod01Test {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try{
            driver.get(Urls.HEROKU_BASE_URL.concat(Urls.LOGIN_FORM_SLUG));

            LoginPageMod01 loginPage = new LoginPageMod01(driver);
            loginPage.usernameElem().sendKeys("Teo");
            loginPage.passwordElem().sendKeys("12345678");
            loginPage.loginBtnElem().click();

            //debug
            Thread.sleep(2000);

        }catch (Exception e){
            e.printStackTrace();
        }
        driver.quit();
    }
}
