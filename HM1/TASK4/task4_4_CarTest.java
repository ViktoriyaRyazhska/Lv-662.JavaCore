package Task_4HM;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class task4_4_CarTest {

    @Test
    void getInstances() {
        task4_4_Car one = new task4_4_Car("Sedan",2010,2.1);
        assertEquals("Sedan",one.getType());
        assertEquals(2010,one.getYearOfProduction());
        assertEquals(2.1,one.getEngineCapacity());
    }

}