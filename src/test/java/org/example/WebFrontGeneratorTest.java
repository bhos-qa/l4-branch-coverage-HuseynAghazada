package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class WebFrontGeneratorTest {

    @Test
    void testAdd() {
        WebFrontGenerator math = new WebFrontGenerator();
        int result = math.add(5, 3);
        assertEquals(8, result);
    }

    @Test
    void testSubtract() {
        WebFrontGenerator math = new WebFrontGenerator();
        int result = math.subtract(10, 4);
        assertEquals(6, result);
    }

    @Test
    void testMultiply() {
        WebFrontGenerator math = new WebFrontGenerator();
        int result = math.multiply(6, 7);
        assertEquals(42, result);
    }

    @Test
    void testDivide() {
        WebFrontGenerator math = new WebFrontGenerator();
        int result = math.divide(15, 3);
        assertEquals(5, result);
    }

    @Test
    void testConcatenateStrings() {
        WebFrontGenerator math = new WebFrontGenerator();
        String result = math.concatenateStrings("Hello, ", "World!");
        assertEquals("Hello, World!", result);
    }
}