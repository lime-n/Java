package TestLEarning;

import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Attribute;
import weka.core.Instances;

public class WorkingData {
    public static void main(String[] args) throws Exception {
           String test1 = "D:/Week 1/Arsenal_test.arff";

           Instances test = DatasetLoading.loadData(test1);

       test.setClassIndex(test.numAttributes()-1);

       Classifier testModel = (Classifier)new NaiveBayes();
       testModel.buildClassifier(test);
      

       int count = 0;
       for(int i = 0; i<test.numAttributes();i++) {
       	
       		String  trueClassLabel = test.instance(i).toString(test.classIndex());

           		System.out.println(trueClassLabel);
           	}
       	}    	

       	
       }
       
       
