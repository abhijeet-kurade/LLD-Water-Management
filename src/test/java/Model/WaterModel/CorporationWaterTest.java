package Model.WaterModel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CorporationWaterTest {

    @Test
    void getRate() {
        CorporationWater cw = new CorporationWater();
        assertEquals(1, cw.getRate());
    }
}