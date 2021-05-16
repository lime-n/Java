package TestLEarning;

import java.util.Arrays;

import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instances;

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
		
		return new int[][] {new int[] {counts, counts2}, new int[] {counts3, counts1}};
		}
		
		
		
	int[] classifyInstances(Classifier c, Instances test) throws Exception {
	    
		test.setClassIndex(test.numAttributes()-1);
		c.buildClassifier(test);
		
		   int values;
		    int[] storeValues = null;
		    int[] valueLength = new int[test.numInstances()];
		    int[] submit = null;
		for(int i=0; i<test.numInstances();i++) {
		     values = (int) c.classifyInstance(test.get(i));
		    storeValues = new int[] {values};
		 valueLength[i] = storeValues[0];
		 
		 submit = Arrays.copyOfRange(valueLength, 0, i);
		}	
		return submit;
	}
	
		
	int[] getClassValues(Instances data) {
		
		int test;
		int[] vest=null;
		int[] storeVest = new int[data.numInstances()];
		int[] finalStore = null;
		  for(int i = 0; i < data.numInstances(); i++) {
			  test = (int) data.instance(i).classValue();
              vest = new int[]{test};
              storeVest[i] = vest[0];
              finalStore = Arrays.copyOfRange(storeVest, 0, i);
	}return finalStore;
	
	}
	
	
	
	/**
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

		
		confusionMatrix cmatric = new confusionMatrix();
		
		int[][] test = cmatric.matrixConfusion(predicted, actual);
		
		
		System.out.println(Arrays.deepToString(test));
		
		
		}//five = new int[counts][counts1];
		
		//System.out.println(Arrays.deepToString(five));
		
		//System.out.println(counts + "\t" + counts2 + "\t" + counts3 + "\t" + counts1);
		
		
		//System.out.println("\t"+ "Actual = 0:"+"\t"+"Actual = 1:"+"\n" + "Predic = 0:" + "\t" + counts + "\t" + counts2 + "\n" + "Predic = 1:" + "\t" + counts3 + "\t" + counts1);
*/
	

}
