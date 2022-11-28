package tests.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.Verifier;

import java.util.List;

public class TestNgOrder {
    @Test(dependsOnMethods = {"testB"})
    public void testA(){
        System.out.println("TestA");
    }

    @Test
    public void testB(){
        System.out.println("TestB");
        SoftAssert softAssert = new SoftAssert();
        //throw new RuntimeException("Err.....................");
       // Verifier.equals(1,2);
        softAssert.assertEquals(1, 2, "[ERR] failed in the filed.....");
        softAssert.assertEquals(1,1);
        softAssert.assertAll();
        //Assert.assertTrue(true);
        System.out.println("Hello");

    }

}
