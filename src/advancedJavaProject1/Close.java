package advancedJavaProject1;

import java.io.*;

public class Close implements Serializable {
	public static final String FILE_PATH_EOD = "C:\\Users\\sstan\\Desktop\\EndofDay.txt";


	@Override
	public String toString() {

		return "Close [moneyTotal=" + moneyTotal + ", carTotal=" + carTotal + ", tickets=" + tickets + ", lostTicket="
				+ lostTicket + "]";
	}


	public float moneyTotal;
	public float carTotal;
	public Integer tickets;
	public Integer lostTicket;
	public Integer eventParking;

	public Close(float moneyTotal, float carTotal, int tickets, int lostTicket) {
		this.moneyTotal = moneyTotal;
		this.carTotal = carTotal;
		this.tickets = tickets;
		this.lostTicket = lostTicket;
	}



	public void addLostTicket() {		lostTicket = lostTicket + 1;
	}

	//addevent

//	add

	public void addCarTotal() {
		carTotal = carTotal + 1;
	}

	public void addTicketToMoney(int calcPrice) {
		moneyTotal = moneyTotal + calcPrice;
	}


	public void addTicketToCount() {
		tickets = tickets + 1;
	}


	public float addLostToMoney() {
		moneyTotal = moneyTotal + 25;
		return moneyTotal;
	}

	public float addEventToMoney() {
		moneyTotal = moneyTotal + 20;
		return moneyTotal;
	}


	public float getMoneyTotal() {
		return moneyTotal;
	}


	public void setMoneyTotal(float moneyTotal) {
		this.moneyTotal = moneyTotal;
	}

	public float getCarTotal() {
		return carTotal;
	}

	public void setCarTotal(float carTotal) {
		this.carTotal = carTotal;
	}

	public Integer getTickets() {
		return tickets;
	}

	public void setTickets(Integer tickets) {
		this.tickets = tickets;
	}


	public void WriteCloseToFile(Object serObj) {

		try {

			FileOutputStream fileOut = new FileOutputStream(FILE_PATH_EOD);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(serObj);
			objectOut.close();
			System.out.println("The Object  was succesfully written to a file");

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}


	public Close ReadCloseFromFile() {
		try {
			FileInputStream fileIn = new FileInputStream(FILE_PATH_EOD);
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			Close closeDay = (Close) objectIn.readObject();
			System.out.println("The Object has been read from the file");
			objectIn.close();
			return closeDay;


		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;


	}

}
