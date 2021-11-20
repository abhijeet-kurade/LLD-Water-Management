package Model.WaterModel;

public class BorewellWater extends FixedRateWater{
    public final static String waterType = "BorewellWater";
    final static double RATE = 1.5;
    public BorewellWater() {
        super(waterType);
        super.setRate(RATE);
    }

    @Override
    public double getRate() {
        return this.rate;
    }
}
