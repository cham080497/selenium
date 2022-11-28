package tests;

import driver.DriverFactory;
import models.components.LoginFormComponent;
import models.pages.HerokuLoginPage;
import org.openqa.selenium.WebDriver;
import url.Urls;

public class LoginPageTest {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try{
            driver.get(Urls.HEROKU_BASE_URL.concat(Urls.LOGIN_FORM_SLUG));
            //input login creds
//            LoginPageMod03 loginPage = new LoginPageMod03(driver);
//            loginPage
//                    .inputUsername("Teo")
//                    .inputPassword("12345678")
//                    .clickOnLoginBtn();
//
          HerokuLoginPage loginPage = new HerokuLoginPage(driver);
//            System.out.println(loginPage.footerComp().getLinkText());

//            LoginFormComponent loginFormComp = loginPage.loginFormComp();
//            loginFormComp.usernameElem.senKeys("teo");
            //debug
            Thread.sleep(2000);

        }catch (Exception e){
            e.printStackTrace();
        }
        driver.quit();
    }
}
