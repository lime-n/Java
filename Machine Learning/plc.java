package TestLEarning;

import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instance;
import weka.core.Instances;

public class plc {
//set up classifier	
	
	
	//build class accuracy
	double accuracy(Classifier c, Instances test) throws Exception {
		
		//build classifier from test data
	
	    test.setClassIndex(test.numAttributes()-1);
		c.buildClassifier(test);
		//take the predicted values

		int z=0;
		   double x = 0;
		  String x2 = null;
		   int[] count = null;
		   	

for(int i = 0; i<test.numInstances();i++) {
	 String trueClassLabel;
     trueClassLabel = test.instance(i).toString(test.classIndex());
     double predicted = c.classifyInstance(test.get(i));
     
     if(predicted == 0.0) {
     	System.out.println("Loss" + "\t"+trueClassLabel);
     }else if (predicted == 1.0){
     	System.out.println("Draw"+ "\t"+trueClassLabel);
     }else if(predicted == 2.0) {
     	System.out.println("Win"+ "\t"+trueClassLabel);
     	
     }
	
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
 	   
    } double testIns = test.numInstances();
    double countIns = count.length;
    
   double finalTest = countIns/testIns;
    
   
return finalTest;
     
}

	
}