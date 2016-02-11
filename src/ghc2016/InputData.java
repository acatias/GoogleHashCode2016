package ghc2016;

public class InputData {
	
	public int nRows;
	public int nCols;
	public int nDrones;
	public int nTurns;
	public int maxLoad;
	
	public int nProdTypes;
	public int[] aProdWeights;
	
	public int nWHs;
	public int[] aWHRows;
	public int[] aWHCols;
	public int[][] mWHProdTypes; // nWHs x nProdTypes
	
	public int nOrders;
	public int[] aOrderRows;
	public int[] aOrderCols;
	public int[] nOrderItems; // not for persistance
	public int[][] aOrderProdTypes; // nOrders x nProdTypes

}
