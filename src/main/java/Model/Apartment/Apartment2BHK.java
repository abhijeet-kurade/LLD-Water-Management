package Model.Apartment;

public class Apartment2BHK extends Apartment{
    final static int PEOPLE = 3;
    public static final int APT_TYPE = 2;
    public Apartment2BHK(int corporationWaterRatio, int borewellWaterRatio) {
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
