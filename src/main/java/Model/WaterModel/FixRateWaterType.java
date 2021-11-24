package Model.WaterModel;

public enum FixRateWaterType {

    CorporationWater("CorporationWater", 1),
    BorewellWater("BorewellWater", 1.5);

    private String waterType;
    private double rate;
    FixRateWaterType(String waterType, double rate){
        this.waterType = waterType;
        this.rate = rate;
    }

    public String getWaterType() {
        return waterType;
    }

    public double getRate() {
        return rate;
    }
}
