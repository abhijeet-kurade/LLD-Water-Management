package Model.WaterModel;

import java.util.HashMap;

public class WaterTypes {
    private static HashMap<String, Water> waterTypes;
    private WaterTypes(){

    }
    public static HashMap<String, Water> getWaterTypes(){
        if(WaterTypes.waterTypes != null) return WaterTypes.waterTypes;
        WaterTypes.waterTypes = new HashMap<>();
        WaterTypes.waterTypes.put(FixRateWaterType.CorporationWater.getWaterType(), new FixedRateWater(FixRateWaterType.CorporationWater));
        WaterTypes.waterTypes.put(FixRateWaterType.BorewellWater.getWaterType(), new FixedRateWater(FixRateWaterType.BorewellWater));
        WaterTypes.waterTypes.put(SlabRateWaterTypes.TankerWater.getWaterType(), new SlabRateWater(SlabRateWaterTypes.TankerWater));
        return WaterTypes.waterTypes;
    }
}
