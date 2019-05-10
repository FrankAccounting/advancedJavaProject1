package advancedJavaProject1;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InAndOutMachineAbstraction {
	static DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
	private static final int PRICE_PER_HOUR  = 6;
	private static final int LOST_TICKET = 25;
	boolean quit = false;






					public static void main(String[] args) {
					SingletonChargeObjectFactory SingleCharge =  new SingletonChargeObjectFactory();
					menuItem UserInterface = new menuItem();
					Scanner keyboard = new Scanner(System.in);
					List<Close> BusinessToDate = new ArrayList<Close>();
					boolean quit = false;
					int menuItem;
					Close closeDay = new Close(0, 0, 0, 0);
					do {
						UserInterface.inMenuPrint();
						menuItem = keyboard.nextInt();

						switch (menuItem) {
							case 1:
								ChargeTypeFactory UseSingleton = ChargeTypeFactory.getInstance();
								UseSingleton.makeChangeType("I");
								ChargeType InCarTicket = UseSingleton.makeChangeType("I");
								InCarTicket.setTimeIn(LocalTime.now());
								InCarTicket.setTimeOutMIN(LocalTime.MIN);
								// Make A Car Object with the Vars
								System.out.println(InCarTicket.toString());
								UserInterface.carInLotWindow((InAndOut) InCarTicket);
								UserInterface.secondMenuPrint();

								menuItem = keyboard.nextInt(); // switch on user
								System.out.println("Enter Car ID HERE");

								switch (menuItem){

									case 2:
										InCarTicket.setTimeOutMIN(LocalTime.now());


										// dont nneed id
					int ID = keyboard.nextInt(); //get it

					// dont need to interate though
					// write out direclty
					//update out time

						UserInterface.outMenuReceipt((InAndOut) InCarTicket); // use the reciept	menu
						closeDay.addCarTotal(); // add to count
						closeDay.addTicketToMoney(priceClac.calcPrice(((InAndOut) InCarTicket).getTime())); //get money yo
						closeDay.addTicketToCount();  // Add to count 
						closeDay.WriteCloseToFile(closeDay); // write to object



					break;
					//close
				case 3:
					String typeOfTicket = "L";

					ChargeType lost = SingleCharge.UseSingleton.makeChangeType(typeOfTicket);

					UserInterface.outMenuReceiptLost();  //lost ticket menu
					closeDay.addCarTotal();  //add car
					closeDay.addLostToMoney();  //add money
					closeDay.addLostTicket(); // lost ticket
					closeDay.WriteCloseToFile(closeDay); //write object					
					UserInterface.inMenuPrint(); // intake
				}
				break;

			case 4:
				Close totalToDate = closeDay.ReadCloseFromFile();  //read from object
				UserInterface.endOfDay(totalToDate); // calc
			}

		}
		while (!quit);
		System.out.println("Good luck finding parking elsewhere!");
	}



}


// questions
//how to make public finals public and shareable