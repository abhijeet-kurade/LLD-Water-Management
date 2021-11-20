package Model.WaterModel;

public abstract class FixedRateWater extends Water{
    double rate;
    public FixedRateWater(String waterType) {
        super(waterType);
    }
    protected void setRate(double rate){
        this.rate = rate;
    }
    public abstract double getRate();
}
