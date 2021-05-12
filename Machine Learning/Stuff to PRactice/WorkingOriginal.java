package TestLEarning;



import java.util.Arrays;

import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Attribute;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class WorkingOriginal {
	
	
	
	 public static void main(String[] args) throws Exception {

	        String test1 = "C:/Users/Emil/Downloads/Week 1/Arsenal_test.arff";

	        Instances test = DatasetLoading.loadData(test1);

	    test.setClassIndex(test.numAttributes()-1);


	    Classifier testModel = (Classifier)new NaiveBayes();
	    testModel.buildClassifier(test);	
	    
	   int count=0;
	   String[] s = new String[test.numAttributes()] ;
//Boolean classTest;
	    
for (int i = 0; i < test.numInstances(); i++)      
	    {
	
	String ClassData = test.classAttribute().value(i);
	
	s[i]= ClassData;
	
	System.out.println(Arrays.toString(s));
	
	
	
	
	
	
	 /**
	    	  //return data
	    String	classData = test.classAttribute().value(i);
		String  trueClassLabel = test.instance(i).toString(test.classIndex());
		      classTest = classData.contentEquals(trueClassLabel);
		      
//System.out.println(classTest);
	      
	     // if(String.valueOf(trueClassLabel) != null) {
           	//	count++;}
	        
	       }*/  
	    
	    
	    //for(int j = 0; j<test.numInstances();j++) {
	    	   
	//String  trueClassLabel = test.instance(j).toString(test.classIndex());

	
	
	    	   
	       }
	       
	       
}
}

