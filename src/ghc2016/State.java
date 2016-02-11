package ghc2016;

public class State {

	// tine nr items pentru o drona data x de un tip dat x pe un drum dat x la tura data x pentru ordinul dat
	
	public int stOrderOrder[][][][][][];
	public int stWhsWhs[][][][][][];
	public int stOrderWhs[][][][][][];
	public int stWhsOrder[][][][][][];
	
	// umplem la fiecare fiecare repriza pentru fiecare order si pastram cel mai mic si-l fixam.
	// stergem toate cele nefixate si o luam de la capat.
	// daca depaseste numarul de ture pentru toate ne putem opri.
}
