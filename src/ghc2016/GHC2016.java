package ghc2016;

public class GHC2016 {

	public static void main(String[] args) {


		long startTime = System.nanoTime();		
		
		System.out.println("Hello, World!");
		

		InputData id = new InputData();
		
		id.readFromFile("busy_day.in");
		
		long endTime = System.nanoTime();
		
		System.out.println("Running time: " + ((endTime - startTime) / 1000000.0) + " seconds");

	}

}
