package Model.Apartment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Apartment2BHKTest {

    @Test
    void getPeople() {
        Apartment2BHK apt2bhk = new Apartment2BHK(1, 5);
        assertEquals(3, apt2bhk.getPeople());
    }

    @Test
    void getGuests() {
        Apartment2BHK apt2bhk = new Apartment2BHK(1, 5);
        apt2bhk.addGuests(5);
        apt2bhk.addGuests(3);
        assertEquals(8, apt2bhk.getGuests());
    }

    @Test
    void getRatio() {
        Apartment2BHK apt2bhk = new Apartment2BHK(1, 5);
        apt2bhk.addGuests(5);
        apt2bhk.addGuests(3);
        assertEquals(5, apt2bhk.getRatio().getBorewellWaterRatio());
        assertEquals(1, apt2bhk.getRatio().getCorporationWaterRatio());
    }
}