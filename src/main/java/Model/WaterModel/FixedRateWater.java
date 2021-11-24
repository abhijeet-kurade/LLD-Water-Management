package Model.WaterModel;

public class FixedRateWater extends Water{
    FixRateWaterType waterType;
    public FixedRateWater(FixRateWaterType waterType) {
        super(waterType.getWaterType());
        this.waterType = waterType;
    }
    public double getRate(){
        return this.waterType.getRate();
    }
}
