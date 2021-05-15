package TestLEarning;

import java.util.Arrays;

public class confusionMatrix {

	int[][] matrixConfusion(int[] predicted, int[] actual){
		
		int[] count = new int [10];
		int counts = 0;
		int counts1 = 0;
		int counts2 = 0;
		int counts3 = 0;
		for(int i = 0; i < count.length; i++) {
		if(actual[i] == count[i] && predicted[i] == count[i]) {
			counts++;	
		}else if(actual[i] != count[i] && predicted[i] != count[i]) {
			counts1++;
		}else if(actual[i] != count[i] && predicted[i] == count[i]) {
			counts2++;
		}else if(actual[i] == count[i] && predicted[i] != count[i]) {
			counts3++;
		}
		
		}
		System.out.println("\t"+ "Actual = 0:"+"\t"+"Actual = 1:"+"\n" + "Predic = 0:" + "\t" + counts + "\t" + counts2 + "\n" + "Predic = 1:" + "\t" + counts3 + "\t" + counts1);
		return null;
		}
		
		
		
		
	
	
	public static void main(String[] args) {
		int[] actual    = new int[] {0, 0, 1, 1, 1, 0, 0, 1, 1, 1};
		int[] predicted = new int[] {0, 1, 1, 1, 1, 1, 1, 1, 1, 1};

		int[] count = new int [10];
		int counts = 0;
		int counts1 = 0;
		int counts2 = 0;
		int counts3 = 0;
		
		int[][] five = new int[2][2];
		for(int i = 0; i < count.length; i++) {
		if(actual[i] == count[i] && predicted[i] == count[i]) {
			counts++;	
		}else if(actual[i] != count[i] && predicted[i] != count[i]) {
			counts1++;
		}else if(actual[i] != count[i] && predicted[i] == count[i]) {
			counts2++;
		}else if(actual[i] == count[i] && predicted[i] != count[i]) {
			counts3++;
		}

		
		
		}//five = new int[counts][counts1];
		
		//System.out.println(Arrays.deepToString(five));
		
		//System.out.println(counts + "\t" + counts2 + "\t" + counts3 + "\t" + counts1);
		
		
		System.out.println("\t"+ "Actual = 0:"+"\t"+"Actual = 1:"+"\n" + "Predic = 0:" + "\t" + counts + "\t" + counts2 + "\n" + "Predic = 1:" + "\t" + counts3 + "\t" + counts1);

	}
}

