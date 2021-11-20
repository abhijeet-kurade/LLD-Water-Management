package Model.WaterModel;

import java.util.List;

public class TankerWater extends SlabRateWater{
    public final static String waterType = "TankerWater";
    public TankerWater() {
        super(waterType);
        super.addSlab(1, 500, 2);
        super.addSlab(501, 1500, 3);
        super.addSlab(1501, 3000, 5);
        super.addSlab(3001, Integer.MAX_VALUE, 8);
    }

    @Override
    public List<Slab> getSlabs() {
        return this.slabs;
    }
}
