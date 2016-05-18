package com.michaelcane;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSumOfNumbers {

    SumOfNumbers sumOfNumbers;
    @Before public void setupInitializer() {
        sumOfNumbers = new SumOfNumbers();
    }

    @Test
    public void testDoSums() {
        int expectedValue = 10;
        int actualValue = sumOfNumbers.doSums(1, 4);
        assertEquals("actualValue should return 10, same as expectedValue", expectedValue, actualValue);
    }
}
