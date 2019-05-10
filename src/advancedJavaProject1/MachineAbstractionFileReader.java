package advancedJavaProject1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class MachineAbstractionFileReader {
	
	public static final String FILE_PATH_EOD ="C:\\Users\\sstan\\Desktop\\EndofDay.txt";		

	public static List<Close> ReadArrFromFile() {
	try {
		FileInputStream fileIn = new FileInputStream(FILE_PATH_EOD);
		ObjectInputStream objectIn = new ObjectInputStream(fileIn);

		List<Close> BusinessToDate =  (ArrayList<Close>) objectIn.readObject();
		objectIn.close();
		fileIn.close();
		System.out.println("The carlist  was succesfully read");
		

		return BusinessToDate;


	} catch (Exception ex) {
		ex.printStackTrace();    }
	return null;

}
}
