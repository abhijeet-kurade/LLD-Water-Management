package Model.Apartment;

public class CreateApartment {
    public static Apartment create(int type, int corporationWaterRatio, int borewellWaterRatio){
        Apartment apartment = null;
        switch (type){
            case Apartment2BHK.APT_TYPE:
                apartment = new Apartment2BHK(corporationWaterRatio, borewellWaterRatio);
                break;
            case Apartment3BHK.APT_TYPE:
                apartment = new Apartment3BHK(corporationWaterRatio, borewellWaterRatio);
                break;
        }
        return apartment;
    }

}
