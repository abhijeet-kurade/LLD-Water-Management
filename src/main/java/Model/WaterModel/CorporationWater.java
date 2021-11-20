package Model.WaterModel;

public class CorporationWater extends FixedRateWater{
    public final static String waterType = "CorporationWater";
    final static double RATE = 1;
    public CorporationWater() {
        super(waterType);
        super.setRate(CorporationWater.RATE);
    }

    @Override
    public double getRate() {
        return this.rate;
    }
}
