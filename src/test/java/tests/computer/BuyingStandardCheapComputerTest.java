package tests.computer;
import models.components.order.CheapComputerComponent;
import models.components.order.StandardComputerComponent;
import org.testng.annotations.Test;
import test_flows.computer.OrderComputerFlow;
import tests.BaseTest;
import url.Urls;

public class BuyingStandardCheapComputerTest extends BaseTest implements Urls {
    @Test
    public void testCheapComputerBuying(){
        driver.get(BASE_URL.concat("/build-your-cheap-own-computer"));
        OrderComputerFlow<StandardComputerComponent> orderComputerFlow =
                new OrderComputerFlow<>(driver, StandardComputerComponent.class);

        orderComputerFlow.buildCompSpecAndAddToCart();
    }

}
