package Model.WaterModel;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class WaterTypesTest {

    @Test
    void getWaterTypes() {
        HashMap<String, Water> wtype = WaterTypes.getWaterTypes();
        assertEquals(1, ((FixedRateWater)wtype.get(CorporationWater.waterType)).getRate() );
        assertEquals(1.5, ((FixedRateWater)wtype.get(BorewellWater.waterType)).getRate() );
        assertEquals(5, ((SlabRateWater)wtype.get(TankerWater.waterType)).getSlabs().get(2).getSlabRate() );
        assertEquals(8, ((SlabRateWater)wtype.get(TankerWater.waterType)).getSlabs().get(3).getSlabRate() );
    }
}