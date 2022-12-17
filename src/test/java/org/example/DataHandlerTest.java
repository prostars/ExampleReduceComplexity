package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataHandlerTest {

    @Test
    void buildData() {
        DataHandlerBefore handlerBefore = new DataHandlerBefore();
        DataHandlerAfter handlerAfter = new DataHandlerAfter();
        Data dataBefore = handlerBefore.buildData(false, false, true, "");
        Data dataAfter = handlerAfter.buildData(false, false, true, "");
        assertEquals(31, dataBefore.getA());
        assertEquals(32, dataBefore.getB());
        assertEquals(33, dataBefore.getC());
        assertEquals(dataBefore, dataAfter);
    }
}
