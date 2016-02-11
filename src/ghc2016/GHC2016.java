package ghc2016;

public class GHC2016 {

	public static void main(String[] args) {


		long startTime = System.nanoTime();		
		
		System.out.println("Hello, World!");
		
		InputData id1 = new InputData();
		
		id1.readFromFile("busy_day.in");
		
		InputData id2 = new InputData();
		
		id2.readFromFile("redundancy.in");
		
		InputData id3 = new InputData();
		
		id3.readFromFile("mother_of_all_warehouses.in");
		
		long endTime = System.nanoTime();
		
		System.out.println("Running time: " + ((endTime - startTime) / 1000000.0) + " seconds");

	}

}
