package advancedJavaProject1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class MachineAbstractionWriter {
	public static final String FILE_PATH = "C:\\Users\\sstan\\Desktop\\YourTicket.txt";
	public static final String FILE_PATH_EOD ="C:\\Users\\sstan\\Desktop\\EndofDay.txt";		


	public static void WriteArrToFile(List<Close> businessToDate) {
		try {

			FileOutputStream fileOut = new FileOutputStream(FILE_PATH_EOD);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(businessToDate);
			objectOut.close();
			System.out.println("The array was succesfully written to a file");
			} 
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}



}


