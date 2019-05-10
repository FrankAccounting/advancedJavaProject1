package advancedJavaProject1;

public class ChargeTypeFactory {

    private static ChargeTypeFactory instance = null;

    public ChargeType makeChangeType(String newChargeType) {

        ChargeType newCharge = null;

        if (newChargeType.equals("L")) {
            return new LostTicket();
        }
        if (newChargeType.equals("E")) {
            return new EventParking();
        }
        if (newChargeType.equals("I")) {
            return new InAndOut();
        }


        return newCharge;
    }

    private ChargeTypeFactory (){};


    public static ChargeTypeFactory getInstance() {
        if (instance == null) {
            instance = new ChargeTypeFactory();
        }
        return instance;
    }
}




