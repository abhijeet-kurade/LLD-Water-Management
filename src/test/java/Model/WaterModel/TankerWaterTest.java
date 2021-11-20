package Model.WaterModel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TankerWaterTest {

    @Test
    void getSlabs() {
        TankerWater tw = new TankerWater();
        assertEquals(3000, tw.getSlabs().get(2).slabEnd);
    }
}