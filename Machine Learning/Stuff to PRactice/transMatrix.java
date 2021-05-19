package TestLEarning;

import java.util.Arrays;

public class transMatrix {

	public static void main(String[] args) {
	  /** 
		final int[][] original = new int[][] {
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12}
		};
		
		//int values;
	  
	    int[][][] storeValues = null;
	    int[][][] valueLength = new int[original.length][original.length][original.length];
	    int[][][] submit = null;
	    
	    //System.out.println(Arrays.deepToString(original));
	for(int i=0; i<original.length;i++) {
		for(int j = 0; j<original.length;j++) {
			for(int k = 0; k<original.length;k++) {
				
	   storeValues = new int[][][] {original};
	 valueLength[i][j][k] = storeValues[0][0][0];
	 
	submit = Arrays.copyOfRange(valueLength, 0, i,j,k);
	
	}	
		}
	}System.out.println(Arrays.deepToString(valueLength));
	
	*/
	int[] jest = new int[] {1, 2, 3, 4, 5, 6};
	   int values;
	    int[][] storeValues = null;
	    int[][] valueLength = new int[jest.length][jest.length];
	    int[][] submit = null;
	    int[][] submitted = null;
	for(int i=0; i<jest.length;i++) {
		for(int j = 0; j < jest.length;j++) {
	  
	    storeValues = new int[][] {jest};
	 valueLength[j][i] = storeValues[0][i];
	 
	 submit = Arrays.copyOfRange(valueLength, 0, j+1);
	 
	 submitted = Arrays.copyOfRange(submit, 0, j+1);
	 
	 
	}	System.out.println(Arrays.deepToString(submitted)); 
	
	
	
	}
}}