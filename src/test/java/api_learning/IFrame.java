package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import support.ui.SelectEx;
import url.Urls;

public class IFrame {
    //iframe[^id="mce]
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();

        try{
            // Navigate to the dropdown page
            driver.get(Urls.HEROKU_BASE_URL.concat(Urls.IFRAME_SLUG));

            //Locate the iframe
            WebElement IFrameElem = driver.findElement(By.cssSelector("iframe[^id='mce']"));
            SelectEx select = new SelectEx(IFrameElem);
            //switch to the iframe
            driver.switchTo().frame(IFrameElem);

            //input the text into input text area
            WebElement edittorInputElem = driver.findElement(By.cssSelector("#tinymce"));
            edittorInputElem.click();
            edittorInputElem.clear();
            edittorInputElem.sendKeys("The is the new value ");

            //switch to the parent iframe
            driver.switchTo().defaultContent();
            System.out.println(driver.findElement(By.partialLinkText("Selenium")).getAttribute("href"));

            //debug purpose value
            Thread.sleep(2000);

        }catch (Exception e){
            e.printStackTrace();
        }

        driver.quit();
    }
}
