package Model.Apartment;

public enum ApartmentType {

    APT_2BHK (2, 3),
    APT_3BHK(3, 5);

    int type;
    private int people;

    ApartmentType(int type, int people){
        this.people = people;
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public int getPeople() {
        return people;
    }
}
