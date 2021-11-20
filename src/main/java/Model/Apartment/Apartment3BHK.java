package Model.Apartment;

public class Apartment3BHK extends Apartment{
    final static int PEOPLE = 5;
    public static final int APT_TYPE = 3;
    public Apartment3BHK(int corporationWaterRatio, int borewellWaterRatio ) {
        super(PEOPLE, new Ratio(corporationWaterRatio, borewellWaterRatio));
    }

    @Override
    public void addGuests(int guests) {
        this.guests += guests;
    }

    @Override
    public int getPeople() {
        return PEOPLE;
    }

    @Override
    public int getGuests() {
        return this.guests;
    }

    @Override
    public Ratio getRatio() {
        return this.ratio;
    }
}
