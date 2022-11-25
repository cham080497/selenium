package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import url.Urls;

public class JsExecutor implements Urls {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();

        try {
            driver.get(HEROKU_BASE_URL.concat(FLOATING_MENUS_SLUG));
            JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
            PageHelper pageHelper = new PageHelper(jsExecutor);

            // scroll to bottom
//            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
            pageHelper.scrollToBottom();

            //debug purpose only
            Thread.sleep(2000);

            //scroll to top
//            jsExecutor.executeScript("window.scrollTo( document.body.scrollHeight, 0)");

            pageHelper.scrollToTop();
            //debug purpose only
            Thread.sleep(2000);

            //go to dynamic control page
            driver.get(HEROKU_BASE_URL.concat(DYNAMIC_CONTROL_SLUG));
            By checkboxFormSel = By.id("checkbox-example");
            By inputFormSel = By.cssSelector("#input-example");

            WebElement checkboxFormElem = driver.findElement(checkboxFormSel);
            WebElement inputFormElem = driver.findElement(inputFormSel);

//            jsExecutor.executeScript("arguments[0].remove()", inputFormElem);
//            jsExecutor.executeScript("arguments[0].setAttribute('style','background:blue; border: 4p solid red; ')", checkboxFormElem);
            pageHelper.removeElement(checkboxFormElem);
            pageHelper.changeElemStyleToFocusMode(inputFormElem);


            // Debug purpose ONLY
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}
