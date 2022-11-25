package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import url.Urls;

import java.util.List;

public class MouseHover {

    private static final By figureSel = By.className("figure");
    private static final By profileNameSel = By.cssSelector(".figcaption > h5");
    private static final By profileLinkSel = By.className(".figcaption a");

    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();

        try{
            // Navigate to the dropdown page
            driver.get(Urls.HEROKU_BASE_URL.concat(Urls.HOVER_SLUG));

            //locate to the all image
            List<WebElement> figuresElem = driver.findElements(figureSel);
            if(figuresElem.isEmpty()){
                throw new RuntimeException("[ERR] There is no figure to test");
            }

            Actions actions = new Actions(driver);
            for (WebElement figureElem : figuresElem) {
                WebElement profileNameElem = figureElem.findElement(profileNameSel);
                WebElement profileLinkElem = figureElem.findElement(profileLinkSel);

                System.out.println((profileNameElem.getText() + ": " + profileLinkElem.isDisplayed()));
                actions.moveToElement(figureElem).perform();

                System.out.println("After mouse hover");
                System.out.println((profileNameElem.getText() + ": " + profileLinkElem.isDisplayed()));

            }

            //debug purpose value
            Thread.sleep(2000);

        }catch (Exception e){
            e.printStackTrace();
        }

        driver.quit();
    }
}

