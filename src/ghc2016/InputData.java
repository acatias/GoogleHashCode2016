
package ghc2016;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

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
	public int[] nOrderItems; // not for persistence
	public int[][] mOrderProdTypes; // nOrders x nProdTypes

	
	public void readFromFile(String fileName) {

		try {
			
			BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
			
			String line = br.readLine();
			
			StringTokenizer st = new StringTokenizer(line);
			
			nRows = Integer.parseInt(st.nextToken());
			
			System.out.println("nRows = " + nRows);
			
			nCols = Integer.parseInt(st.nextToken());
			
			System.out.println("nCols = " + nCols);
			
			nDrones = Integer.parseInt(st.nextToken());
			
			System.out.println("nDrones = " + nDrones);
			
			nTurns = Integer.parseInt(st.nextToken());
			
			System.out.println("nTurns = " + nTurns);
			
			maxLoad = Integer.parseInt(st.nextToken());
			
			System.out.println("maxLoad = " + maxLoad);

			line = br.readLine();
			
			st = new StringTokenizer(line);
			
			nProdTypes = Integer.parseInt(st.nextToken());
			
			System.out.println("nProdTypes = " + nProdTypes);
			
			aProdWeights = new int[nProdTypes];
			
			line = br.readLine();
			
			st = new StringTokenizer(line);
			
			for (int i = 0; i < nProdTypes; i++) {
				
				aProdWeights[i] = Integer.parseInt(st.nextToken());
				
				System.out.println("aProdWeights[" + i + "] = " + aProdWeights[i]);
			}
			
			line = br.readLine();
			
			st = new StringTokenizer(line);
			
			nWHs = Integer.parseInt(st.nextToken());
			
			System.out.println("nWHs = " + nWHs);
			
			aWHRows = new int[nWHs];
			aWHCols = new int[nWHs];
			mWHProdTypes = new int[nWHs][nProdTypes]; // nWHs x nProdTypes
			
			for (int i = 0; i < nWHs; i++) {
				
				line = br.readLine();
				
				st = new StringTokenizer(line);
				
				aWHRows[i] = Integer.parseInt(st.nextToken());
				aWHCols[i] =  Integer.parseInt(st.nextToken());
				
				System.out.println("Location Warehouse[" + i + "] = " + aWHRows[i] + " - " + aWHCols[i]);
			
				line = br.readLine();
				
				st = new StringTokenizer(line);
				
				for (int j = 0; j < nProdTypes; j++) {
					
					mWHProdTypes[i][j] = Integer.parseInt(st.nextToken());
					
					System.out.println("Warehouse " + i + " - items prod type [" + j + "] = " + mWHProdTypes[i][j]);

				}
			}
			
			
			line = br.readLine();
			
			st = new StringTokenizer(line);
			
			nOrders = Integer.parseInt(st.nextToken());

			System.out.println("nOrders = " + nOrders);
			
			aOrderRows = new int[nOrders];
			aOrderCols = new int[nOrders];
			nOrderItems = new int[nOrders]; // not for persistence
			mOrderProdTypes = new int[nOrders][nProdTypes];
			
			for (int i = 0; i < nOrders; i++) {
				
				line = br.readLine();
				
				st = new StringTokenizer(line);
				
				aOrderRows[i] = Integer.parseInt(st.nextToken());
				aOrderCols[i] =  Integer.parseInt(st.nextToken());
				
				System.out.println("Location Order[" + i + "] = " + aOrderRows[i] + " - " + aOrderCols[i]);
			
				line = br.readLine();
				
				st = new StringTokenizer(line);
				
				nOrderItems[i] = Integer.parseInt(st.nextToken());

				System.out.println("num items Order[" + i + "] = " + nOrderItems[i]);
				
				line = br.readLine();
				
				st = new StringTokenizer(line);
				
				for (int j = 0; j < nOrderItems[i]; j++) {
					
					int type = Integer.parseInt(st.nextToken());
					
					mOrderProdTypes[i][type]++;
					
					System.out.println("Order " + i + " - type = " + type);

				}
			}
			
			br.close();
						
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
}

