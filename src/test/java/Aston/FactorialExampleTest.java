package Aston;

import org.testng.annotations.Test;
import org.testng.Assert;
import static org.testng.AssertJUnit.assertEquals;

public class FactorialExampleTest {

    @Test
    public void testFactorialExample() {
        int n = 6;
        long expected = 720;
        long actual = FactorialCalculator.calculateFactorial(n);
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateFactorialWithNegativeNumber() {
        FactorialCalculator.calculateFactorial(-1);
    }

    @Test
    public void testFactorialUpperBound() {
        assertEquals(FactorialCalculator.calculateFactorial(6), 720);

    }

    @Test
    public void testHandleLowerBound() {
        FactorialCalculator.handleLowerBound();

    }
}