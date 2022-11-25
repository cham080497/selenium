package tests;

import driver.DriverFactory;
import models.pages.LoginPageMod03;
import org.openqa.selenium.WebDriver;
import url.Urls;

public class LoginMod03Test {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try{
            driver.get(Urls.HEROKU_BASE_URL.concat(Urls.LOGIN_FORM_SLUG));

            LoginPageMod03 loginPage = new LoginPageMod03(driver);
            loginPage
                    .inputUsername("Teo")
                    .inputPassword("12345678")
                    .clickOnLoginBtn();

            //debug
            Thread.sleep(2000);

        }catch (Exception e){
            e.printStackTrace();
        }
        driver.quit();
    }
}
