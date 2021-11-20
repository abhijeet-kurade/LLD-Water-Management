package Model.Apartment;

public abstract class Apartment {
    protected int people;
    protected int guests;
    protected Ratio ratio;

    public Apartment(int people, Ratio ratio) {
        this.people = people;
        this.guests = 0;
        this.ratio = ratio;
    }

    public abstract void addGuests(int guests);
    public abstract int getPeople();
    public abstract int getGuests();
    public abstract Ratio getRatio();
}
