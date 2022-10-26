import org.junit.jupiter.api.*;

public class SalesManagerTest {

    @Test
    @DisplayName("Test for Max")
    void max() {
        System.out.println("Running Setup");
        long[] saleManagerArray = {2, 5, 19, 25, 55, 99,};
        SalesManager salesManager = new SalesManager(saleManagerArray);
        long exp = 99;
        Assertions.assertEquals(exp, salesManager.max());
        System.out.println("Expected = " + exp + ", Actual = " + salesManager.max());
    }
    @Test
    @DisplayName("Test for Min")
    void min() {
        System.out.println("Running Setup");
        long[] saleManagerArray = {2, 5, 19, 25, 55, 99,};
        SalesManager salesManager = new SalesManager(saleManagerArray);
        long exp = 2;
        Assertions.assertEquals(exp, salesManager.getMinValue());
        System.out.println("Expected = " + exp + ", Actual = " + salesManager.getMinValue());
    }
    @Test
    @DisplayName("Test for Average without min and max")
    void getAverage() {
        System.out.println("Running Setup");
        long[] saleManagerArray = {1, 5, 151, 50, 125, 20,};
        SalesManager salesManager = new SalesManager(saleManagerArray);
        long exp = 50;
        Assertions.assertEquals(exp, salesManager.getAverage());
        System.out.println("Expected = " + exp + ", Actual = " + salesManager.getAverage());
    }
}