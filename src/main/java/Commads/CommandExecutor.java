package Commads;

import Billing.Billing;
import Billing.Strategies.Strategy;
import Billing.Strategies.Strategy1;
import Model.Apartment.Apartment;
import Model.Apartment.CreateApartment;
import Model.WaterModel.Water;
import Model.WaterModel.WaterTypes;

import java.util.HashMap;

public class CommandExecutor {
    Command cmnd;
    HashMap<String, Water> waterTypes;
    Apartment apartment;
    Strategy strategy;
    Billing billing;

    public CommandExecutor(){
        this.waterTypes = WaterTypes.getWaterTypes();
    }

    public void runCommand(String command){
        if(command.startsWith(AllotWaterCommand.CMD)){
            cmnd = new AllotWaterCommand(command);
            String[] params = cmnd.getParams();
            String ratio = params[2];
            String[] ratioValue = ratio.split(":");
            int apartmentType = Integer.parseInt(params[1]);
            int corp = Integer.parseInt(ratioValue[0]);
            int borewell= Integer.parseInt(ratioValue[1]);
            //System.out.println(apartmentType +" "+corp +" "+borewell);
            this.apartment = CreateApartment.create1(2, corp, borewell);
            this.strategy = new Strategy1(this.apartment, this.waterTypes);
            this.billing = new Billing(this.apartment, this.strategy);
        }
        else if(command.startsWith(AddGuestsCommand.CMD)){
            cmnd = new AddGuestsCommand(command);
            int guests = Integer.parseInt(cmnd.getParams()[1]);
            //System.out.println("Guests "+guests);
            this.apartment.addGuests(guests);
        }
        else if(command.startsWith(BillCommand.CMD)){
            cmnd = new BillCommand(command);
            //System.out.println("Total Guests " +this.apartment.getGuests());
            int bill = this.billing.generateBill();
            int water = this.billing.getTotalWater();
            System.out.println(water+" "+bill);
        }
    }

}
