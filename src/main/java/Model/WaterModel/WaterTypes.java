package Model.WaterModel;

import java.util.HashMap;

public class WaterTypes {
    private static HashMap<String, Water> waterTypes;
    private WaterTypes(){

    }
    public static HashMap<String, Water> getWaterTypes(){
        if(WaterTypes.waterTypes != null) return WaterTypes.waterTypes;
        WaterTypes.waterTypes = new HashMap<>();
        WaterTypes.waterTypes.put(CorporationWater.waterType, new CorporationWater());
        WaterTypes.waterTypes.put(BorewellWater.waterType, new BorewellWater());
        WaterTypes.waterTypes.put(TankerWater.waterType, new TankerWater());
        return WaterTypes.waterTypes;
    }
}
