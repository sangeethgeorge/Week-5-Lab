package Week5;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumValues {
	public static void main(String[] args) {
		String fileName = "input.csv";
		File f = new File(fileName);
		System.out.println("Maximum Values");
		try {
			Scanner fileScan = new Scanner(f);
			while(fileScan.hasNext()) {
				String data = fileScan.next();
				String[] values = data.split(",");
				double[] array = new double[values.length];
				for(int i = 0; i<values.length; i++) {
				array[i] = Double.parseDouble(values[i]);
			}
				double max = Arrays.stream(array).max().getAsDouble();
				System.out.println(max);
		}	
			fileScan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}