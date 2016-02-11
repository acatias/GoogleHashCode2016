package ghc2016;

import java.util.Hashtable;

public class State {

	// tine nr items pentru o drona data x de un tip dat x pe un drum sursa x dest x la tura data x pentru ordinul dat
	
	public Hashtable<int, V>
	
	public int stOrderOrder[][][][][][];
	public int stWhsWhs[][][][][][];
	public int stOrderWhs[][][][][][];
	public int stWhsOrder[][][][][][];
	
	// umplem la fiecare fiecare repriza pentru fiecare order si pastram cel mai mic si-l fixam.
	// stergem toate cele nefixate si o luam de la capat.
	// daca depaseste numarul de ture pentru toate ne putem opri.
	
	State(InputData data) {
		stOrderOrder = new int[data.nDrones][data.nProdTypes][data.nOrders][data.nOrders][data.nTurns][data.nOrders];
		stWhsWhs = new int[data.nDrones][data.nProdTypes][data.nWHs][data.nWHs][data.nTurns][data.nOrders];
		stOrderWhs = new int[data.nDrones][data.nProdTypes][data.nOrders][data.nWHs][data.nTurns][data.nOrders];
		stWhsOrder = new int[data.nDrones][data.nProdTypes][data.nWHs][data.nOrders][data.nTurns][data.nOrders];
		
	}
}

public class Orders {
	public Drones[] order;
	
	Orders(int noOrders) {
		order = new Drones[noOrders];
	}
}

public class Drones {
	public Hashtable<int, Path> drones;
}

public class Path {
	public int source;
	public boolean isWhsSource;
	public int dest;
	public boolean isWhsDest;
	public int cost;
	public Hashtable<int, product> products;
}
