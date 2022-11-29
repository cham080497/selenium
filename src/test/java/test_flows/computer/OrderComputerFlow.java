package test_flows.computer;

import models.components.order.ComputerEssentialComponent;
import models.pages.ComputerItemDetailPage;
import org.openqa.selenium.WebDriver;

public class OrderComputerFlow<T extends ComputerEssentialComponent> {
    private final WebDriver driver;
    private final Class<T> computerEssentialComponent;
    public OrderComputerFlow(WebDriver driver, Class<T> computerEssentialComponent){
        this.driver = driver;
        this.computerEssentialComponent = computerEssentialComponent;
    }

    public void buildCompSpecAndAddToCart(){
        ComputerItemDetailPage computerItemDetailPage = new ComputerItemDetailPage(driver);
       T computerEssentialComp =  computerItemDetailPage.computerComp(computerEssentialComponent);
       computerEssentialComp.selectProcessortype("2.5GHz");
       computerEssentialComp.selectRAMType("2GB");

    }
}
