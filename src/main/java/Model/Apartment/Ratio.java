package Model.Apartment;

public class Ratio {
    private int corporationWaterRatio;
    private int borewellWaterRatio;

    public Ratio(int corporationWaterRatio, int borewellWaterRatio) {
        this.corporationWaterRatio = corporationWaterRatio;
        this.borewellWaterRatio = borewellWaterRatio;
    }

    public int getCorporationWaterRatio() {
        return corporationWaterRatio;
    }

    public int getBorewellWaterRatio() {
        return borewellWaterRatio;
    }
}
