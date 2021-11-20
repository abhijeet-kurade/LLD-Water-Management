package Billing.Strategies;

import Model.Apartment.Apartment;
import Model.WaterModel.Water;

import java.util.HashMap;

public abstract class Strategy {
    Apartment apartment;
    HashMap<String, Water> waterTypes;

    public Strategy(Apartment apartment, HashMap<String, Water> waterTypes) {
        this.apartment = apartment;
        this.waterTypes = waterTypes;
    }

    public abstract double calculateBill();
}
