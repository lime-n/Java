package TestLEarning;
import java.util.Arrays;
import java.util.Collections;

import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.trees.J48;
import weka.classifiers.trees.j48.Stats;
import weka.core.AttributeStats;
import weka.core.Instance;
import weka.core.Instances;

public class accuracyModel {
    public static void main(String[] args) throws Exception {
        String train1 = "C:/Users/Emil/Downloads/Week 1/Arsenal_TRAIN.arff";
        String test1 = "C:/Users/Emil/Downloads/Week 1/Arsenal_test.arff";

       Instances train = DatasetLoading.loadData(train1);
        Instances test = DatasetLoading.loadData(test1);

    
//train data    
    train.setClassIndex(train.numAttributes()-1);
    test.setClassIndex(test.numAttributes()-1);

    
    //System.out.println("class index=" +train.classIndex());
    
//   System.out.println(train.numClasses());
    
    // data .pdf https://perso.ensta-paris.fr/~diam/java/online/notes-java/index.html
    

    Classifier Model = (Classifier)new NaiveBayes();
    Model.buildClassifier(test);
//test data
    test.setClassIndex(test.numAttributes()-1);
    Classifier testModel = (Classifier)new NaiveBayes();
    testModel.buildClassifier(test);
    
 
    
//build classifier
    
    //int[] testFinal = test.attributeStats(0).nominalCounts;
    //System.out.println(Arrays.toString(testFinal));
    
  // String finalV = test.attribute(2).value(2);
  //  System.out.println();
   int z=0;
    double x = 0;
    String x2 = null;
    int[] count = null;
		

    for (int i = 0; i < test.numInstances(); i++)      
    {
        
        //return data
      String  trueClassLabel = test.instance(i).toString(test.classIndex());
        double predicted = testModel.classifyInstance(test.get(i));
       
  
        if(predicted == 0.0) {
        	x=predicted;
        }else if (predicted == 1.0){
        	x=predicted;

        }else if(predicted == 2.0) {
        	x=predicted;
        }
       
        if(x == 0.0) {
        String x1 = "Loss";
        x2 = x1;
        } else if(x == 1.0) {
        	String x1 = "Draw";
        	x2=x1;
        } else if(x == 2.0) {
        	String x1 = "Win";
        	x2=x1;
        }
        
       //System.out.println(x2 + "\t"+trueClassLabel + "\t" + x2.equals(trueClassLabel));
     
        if(x2.equals(trueClassLabel)) {
        	
        	z++;
        	count=new int[z];
        	
        }
    	   
       } 
       
       double testIns = test.numInstances();
       double countIns = count.length;
       
    System.out.println(countIns/testIns);
        
    
    }
    
/**
for(int i=0; i<test.numInstances();i++) {
    double testpred = testModel.classifyInstance(test.get(i));

//double[] value = testModel.distributionForInstance(test.get(i));
    
//System.out.println(testpred + "\t" + Arrays.toString(value));}
System.out.println(testpred==testFinal);}

//Incompatible operand types double and String
   */
}

     
        