package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import url.Urls;

import java.time.Duration;

public class JsAlerts implements Urls {

    private final static By jsAlertSel = By.cssSelector("button[onclick=\"jsAlert()\"]");
    private final static By jsConfirmSel = By.cssSelector("button[onclick=\"jsConfirm()\"]");
    private final static By jsPromptSel = By.cssSelector("button[onclick=\"jsPrompt()\"]");
    private final static By resultTextSel = By.cssSelector("#result");


    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();
        try {

            //navigate to the target page
            driver.get(BASE_URL.concat(JS_ALERT_SLUG));
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5L));
            boolean isAcceptedAlert = true;

            // js alert
            WebElement triggerJsAlertBtnElem = driver.findElement(jsAlertSel);
//            triggerJsAlertBtnElem.click();
//            Alert jsAlert = wait.until(ExpectedConditions.alertIsPresent());
//            jsAlert.accept();
            handleAlert(wait, triggerJsAlertBtnElem, isAcceptedAlert);
            System.out.println("Result: " + driver.findElement(resultTextSel).getText());

            // js confirm
            WebElement triggerJsConfirmBtnElem = driver.findElement(jsConfirmSel);
//            triggerJsConfirmBtnElem.click();
//            Alert jsConfirm = wait.until(ExpectedConditions.alertIsPresent());
//            jsConfirm.dismiss();
            isAcceptedAlert = false;
            handleAlert(wait, triggerJsConfirmBtnElem, isAcceptedAlert);

            System.out.println("Result: " + driver.findElement(resultTextSel).getText());

            //jsPromt
            WebElement triggerJsPromptBtnElem = driver.findElement(jsPromptSel);
            //triggerJsPromptBtnElem.click();
//            Alert jsPrompt = wait.until(ExpectedConditions.alertIsPresent());
//            jsPrompt.sendKeys("my name is ...");
//            jsPrompt.accept();
            handleAlert(wait, triggerJsPromptBtnElem, "My name is ...");
            System.out.println("Result: " + driver.findElement(resultTextSel).getText());


        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    private static void handleAlert(WebDriverWait wait, WebElement alertElem, boolean isAccepted) {
        alertElem.click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        if (isAccepted) alert.accept();
        else alert.dismiss();
    }

    private static void handleAlert(WebDriverWait wait, WebElement alertElem, String inputStr) {
        alertElem.click();
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys(inputStr);
        alert.accept();

    }
}
