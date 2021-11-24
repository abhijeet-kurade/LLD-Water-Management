package Model.Apartment;

public class CreateApartment {
    /*public static Apartments create(int type, int corporationWaterRatio, int borewellWaterRatio){
        Apartments apartments = null;
        switch (type){
            case Apartments2BHK.APT_TYPE:
                apartments = new Apartments2BHK(corporationWaterRatio, borewellWaterRatio);
                break;
            case Apartments3BHK.APT_TYPE:
                apartments = new Apartments3BHK(corporationWaterRatio, borewellWaterRatio);
                break;
        }
        return apartments;
    }*/

    public static Apartment create1(int type, int corporationWaterRatio, int borewellWaterRatio){
        Apartment apartment = null;
        switch (type){
            case 2:
                apartment = new Apartment(ApartmentType.APT_2BHK, corporationWaterRatio, borewellWaterRatio);
                break;
            case 3:
                apartment = new Apartment(ApartmentType.APT_3BHK, corporationWaterRatio, borewellWaterRatio);
                break;
        }
        return apartment;
    }

}
