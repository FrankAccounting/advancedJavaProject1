package advancedJavaProject1;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class menuItem {
    static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");



    public  menuItem(){

    }

    public void inMenuPrint() {
        System.out.println("=========================");
        System.out.println("\n Best Value Parking Garage\r\n" +
                "\r\n" +
                           " ========================= \n" );
        System.out.println("1 Check/In ");
        System.out.println("4 Close Garage");

    }



    public void carInLotWindow(InAndOut newInandOut) {

        System.out.println("\n Best Value Parking Garage\r\n" +
                "\r\n" +
                           " ========================= \n" );
        System.out.println("Check In Time " + newInandOut.timeIn );
        System.out.println("Car ID: " + newInandOut.toString());
        System.out.println("||| ||| || || ||| ||| |||" );
        System.out.println("||| ||| *Barcode* ||| |||" );
        System.out.println("||| ||| || || ||| ||| |||" );
        System.out.println(" ========================= \n");
        System.out.println("Please Keep your Car ID in your window (Copy paste car ID) \n");
        System.out.println("Press enter when you are ready to leave!");


        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

    }



    public  void outMenuReceipt(InAndOut newInandOut) {
        System.out.println("=========================");
        System.out.println("\n Best Value Parking Garage\r\n" +
                "\r\n" +
                         " ========================= \n" );
        System.out.println(" Receipt for Car ID: " + newInandOut.toString() );
        System.out.println( newInandOut.timeOut.format(timeFormatter) + " - " +  newInandOut.timeOut.format(timeFormatter));
        System.out.println("$" + priceClac.calcPrice(newInandOut.getTime()));

        System.out.println("||| ||| || || ||| ||| |||" );
        System.out.println("||| ||| *Barcode* ||| |||" );
        System.out.println("||| ||| || || ||| ||| |||" );
        System.out.println(" ========================= \n");
        System.out.println("\n");
        System.out.println("\n");

    }


    public  void outMenuReceiptLost() {

        System.out.println("\n Best Value Parking Garage\r\n" +
                "\r\n" +
                           " ========================= \n" );
        System.out.println(" LOST TICKET $ 25");
        System.out.println("||| ||| || || ||| ||| |||" );
        System.out.println("||| ||| *Barcode* ||| |||" );
        System.out.println("||| ||| || || ||| ||| |||" );
        System.out.println(" ========================= \n");
        System.out.println("\n");
        System.out.println("\n");

    }


    public  void secondMenuPrint() {
        System.out.println("=========================");
        System.out.println("\n Best Value Parking Garage\r\n" +
                "\r\n" +
                " ========================= \n" );
        System.out.println("2 Checkout");
        System.out.println("3 Lost Ticket");

    }

    public void endOfDay(Close close){
        System.out.println("=========================");

        System.out.println("\n Best Value Parking Garage\r\n" +
                "\r\n" +
                            " ========================= \n" );
        System.out.println("Total Money Collected: " + close.moneyTotal);
        System.out.println("Total Cars: " + close.carTotal);
        System.out.println("Total Lost Tickets Collected: " + close.lostTicket);
        System.out.println("Total Tickets Collected: " + close.tickets);

        System.out.println("||| ||| || || ||| ||| |||" );
        System.out.println("||| ||| *Barcode* ||| |||" );
        System.out.println("||| ||| || || ||| ||| |||" );
        System.out.println(" ========================= \n");
        System.out.println("\n");
        System.out.println("\n");
    }

}
