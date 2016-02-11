package ghc2016;

public class GHC2016 {

	public static void main(String[] args) {


		long startTime = System.nanoTime();		
		
		System.out.println("Hello, World!");
		
		InputData id1 = new InputData();
		
		id1.readFromFile("busy_day.in");
		
		Dists dists1 = new Dists(id1);
		
		InputData id2 = new InputData();
		
		id2.readFromFile("redundancy.in");
		
		Dists dists2 = new Dists(id2);
		
		InputData id3 = new InputData();
		
		id3.readFromFile("mother_of_all_warehouses.in");
		
		Dists dists3 = new Dists(id3);
		
		long endTime = System.nanoTime();
		
		System.out.println("Running time: " + ((endTime - startTime) / 1000000.0) + " seconds");

	}

}
