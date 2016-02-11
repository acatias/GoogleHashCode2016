package ghc2016;

public class Dists {

	public int distOrderOrder[][]; // orders x orders
	public int distWhsWhs[][]; // whs x whs
	public int distWhsOrder[][]; // whs x orders
	
	Dists(InputData data) {
		distOrderOrder = new int[data.nOrders][data.nOrders];
		for (int i = 0; i < data.nOrders; i++) {
			for (int j = 0; j < data.nOrders; j++) {
				distOrderOrder[i][j] = (int) Math.round(
						Math.floor(
								Math.sqrt(
										Math.pow(data.aOrderRows[i]-data.aOrderRows[j], 2)
										+ Math.pow(data.aOrderCols[i]-data.aOrderCols[j], 2)
										)
								)
						);
			}
		}
		
		distWhsWhs = new int[data.nWHs][data.nWHs];
		for (int i = 0; i < data.nWHs; i++) {
			for (int j = 0; j < data.nWHs; j++) {
				distOrderOrder[i][j] = (int) Math.round(
						Math.floor(
								Math.sqrt(
										Math.pow(data.aWHRows[i]-data.aWHRows[j], 2)
										+ Math.pow(data.aWHCols[i]-data.aWHCols[j], 2)
										)
								)
						);
			}
		}
		
		distWhsOrder = new int[data.nWHs][data.nOrders];
		for (int i = 0; i < data.nWHs; i++) {
			for (int j = 0; j < data.nWHs; j++) {
				distOrderOrder[i][j] = (int) Math.round(
						Math.floor(
								Math.sqrt(
										Math.pow(data.aWHRows[i]-data.aOrderRows[j], 2)
										+ Math.pow(data.aWHCols[i]-data.aOrderCols[j], 2)
										)
								)
						);
			}
		}
	}
	
}
