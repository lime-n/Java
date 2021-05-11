package TestLEarning;


import java.util.HashMap;

import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instances;

public class testDistributionClass {
	


	 public static void main(String[] args) throws Exception {

	        String test1 = "D:/Week 1/Arsenal_test.arff";

	        Instances test = DatasetLoading.loadData(test1);

	    test.setClassIndex(test.numAttributes()-1);

	    
	    Classifier testModel = (Classifier)new NaiveBayes();
	    testModel.buildClassifier(test);
	   
    	textSplit splitWords = new textSplit();

    			
	    for(int i = 0; i<test.numInstances();i++) {
	    		String  trueClassLabel = test.instance(i).toString(test.classIndex());
	    		
	    		HashMap<String, Integer> testy = splitWords.texted(trueClassLabel);
	    		
	    		System.out.println(testy);
	        	}
    

	    	}    	

	    	
	    
	
}
	 

