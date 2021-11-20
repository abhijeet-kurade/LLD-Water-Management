package Model.WaterModel;

import java.util.ArrayList;
import java.util.List;

public abstract class SlabRateWater extends Water {
    List<Slab> slabs;
    public SlabRateWater(String waterType) {
        super(waterType);
        this.slabs = new ArrayList<>();
    }
    public boolean addSlab(int slabStart, int slabEnd, int rate ){
        if(validateSlab(slabStart, slabEnd)){
            this.slabs.add(new Slab(slabStart, slabEnd, rate));
            return true;
        }
        else return false;
    }
    private boolean validateSlab(int slabStart, int slabEnd){
        if (this.slabs.size() == 0) return (slabStart == 1) && (slabStart < slabEnd);
        Slab lastSlab = this.slabs.get(this.slabs.size()-1);
        if(lastSlab.slabEnd+1 != slabStart) return false;
        return slabStart < slabEnd;
    }
    public abstract List<Slab> getSlabs();
}
