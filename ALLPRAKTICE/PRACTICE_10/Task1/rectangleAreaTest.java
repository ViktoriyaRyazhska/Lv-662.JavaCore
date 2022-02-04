package Task_10Praktice.Task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class rectangleAreaTest {

    @Test
    void squareRectangle() {
       rectangleArea.squareRectangle(10,5);
       assertEquals(50,rectangleArea.squareRectangle(10,5));
    }
}