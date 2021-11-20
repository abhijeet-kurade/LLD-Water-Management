package Billing;

import Billing.Strategies.Strategy;
import Model.Apartment.Apartment;
import Model.CONSTS;
import Model.WaterModel.FixedRateWater;

public class Billing {
    Apartment apartment;
    Strategy strategy;


    public Billing(Apartment apartment, Strategy strategy){
        this.apartment = apartment;
        this.strategy = strategy;
    }

    public int generateBill(){
        return (int)this.strategy.calculateBill();
    }

    public int getTotalWater(){
        int people = this.apartment.getPeople();
        int guests = this.apartment.getGuests();
        int total = people + guests;
        return total * CONSTS.waterPerPerson * CONSTS.daysInMonth;
    }
}
