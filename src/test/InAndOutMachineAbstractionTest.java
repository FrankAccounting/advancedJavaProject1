package test;
//import org.junit.*

import advancedJavaProject1.*;
import org.junit.Ignore;
import org.junit.Test;

public class InAndOutMachineAbstractionTest {

    private ChargeType NewTicket;

    @Ignore
    @Test
    public void doatest(){
        System.out.println("Good luck finding parking elsewhere!");
    }

    @Ignore
    @Test
    public void doaasserttest(){
        Boolean A = true;
        System.out.println( assertTrue("Will it blend, youtube sensation. ", A));

    }
    @Ignore
    @Test
    public void getACharge(){
        LostTicket now = new LostTicket();

    }

    @Ignore
    @Test
    public void useTheFactory(){
        getACharge();

        InAndOut inAndOut = new InAndOut();
    }
    @Ignore
    @Test
    public void makeAnInAndOut(){
    }
    @Ignore
    @Test
    public void makeAEventTicket(){
        ChargeType Event = new EventParking();
        System.out.println(Event.getPrice());
        System.out.println(Event.getChargeType());

    }
    @Ignore
    @Test
    public void makeALostTicket(){
        ChargeType Lost = new LostTicket();
        System.out.println(Lost.getPrice());
        System.out.println(Lost.getChargeType());

    }
    @Ignore
    @Test
    public void actuallyUseTheFActoryInsteadOfLying(){
       ChargeTypeFactory.getInstance();
        EventParking event = null;

        String typeOfTicket = "L";

        NewTicket = ChargeTypeFactory.getInstance().makeChangeType(typeOfTicket);


    }

    @Ignore
    @Test
    public void UsaASingleTon(){
        ChargeTypeFactory UseSingleton = ChargeTypeFactory.getInstance();
        String typeOfTicket = "L";

        NewTicket = UseSingleton.makeChangeType(typeOfTicket);

        System.out.println(NewTicket.getChargeType());

        typeOfTicket = "E";

        NewTicket = UseSingleton.makeChangeType(typeOfTicket);

        System.out.println(NewTicket.getChargeType());

        typeOfTicket = "I";

        NewTicket = UseSingleton.makeChangeType(typeOfTicket);

        System.out.println(NewTicket.getChargeType());


    }

    @Test
    public void moveStuffToBeMoreOOO() {
    }






        private String assertTrue(String message, Boolean A) {

        return message;
    }
}