package Model.Apartment;

public class Apartment {
    private ApartmentType type;
    private int guests;
    private Ratio ratio;

    public Apartment(ApartmentType type, int corporationWaterRatio, int borewellWaterRatio) {
        this.type = type;
        this.ratio = new Ratio(corporationWaterRatio, borewellWaterRatio);
    }

    public void addGuests(int guests){
        this.guests += guests;
    }

    public int getPeople() {
        return type.getPeople();
    }

    public int getGuests() {
        return guests;
    }

    public Ratio getRatio() {
        return this.ratio;
    }
}
