package com.levelup.forestsandmonsters;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class PositionTest {
    @Test
    public void initializationSetsCoordinates() {
        Position testObj = new Position(0, 4);
        assertEquals(0, testObj.coordinates.x);
    
    }

}
