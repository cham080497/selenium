package models.components.order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheapComputerComponent extends ComputerEssentialComponent{
    public CheapComputerComponent(WebDriver driver, WebElement component) {
        super(driver, component);
    }

    @Override
    public String selectProcessortype(String type) {
        return null;
    }

    @Override
    public String selectRAMType(String type) {
        return null;
    }
}
