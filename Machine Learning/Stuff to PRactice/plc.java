package TestLEarning;

import java.io.Reader;
import java.util.Random;

import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

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
     	System.out.println("Predicted Values:"+"\t"+"Loss" + "\t"+"Original values:"+"\t" +trueClassLabel);
     }else if (predicted == 1.0){
     	System.out.println("Predicted Values:"+"\t"+"Draw"+ "\t"+"Original values:"+"\t" +trueClassLabel);
     }else if(predicted == 2.0) {
     	System.out.println("Predicted Values:"+"\t"+"Win"+ "\t"+"Original values:"+"\t" +trueClassLabel);
     	
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
    
   System.out.println("Value below is the accuracy:");

return finalTest;
     
}


	 public static Instances loadData(String location) {
		    try {
		      return DataSource.read(location);
		    }
		    catch (Exception e) {
		      System.err.println("Failed to load data from: " + location);
		      e.printStackTrace();
		      return null;
		    }
		  }

		  public static void main(String[] args) {
		    String dataLocation = "C:/Users/Emil/Desktop/Machine Learning - Java/Week 1/Arsenal_TRAIN1.arff";
		    Instances train = loadData(dataLocation);
		    System.out.println(train);
		  }
		  
Instances[] splitData(Instances all, double proportion) {
	
	all.randomize(new java.util.Random(0));	
	all.setClassIndex(all.numAttributes()-1);
	
	Instances[] split=new Instances[2];
	
	split[0]=new Instances(all);
	
	split[1]=new Instances(all, 0);
	
double	trainsize =  proportion*all.numInstances();
double testsize = all.numInstances() - trainsize;	



split[1] = new Instances(all, (int)trainsize , (int)testsize);

return split;


}


double[] classDistribution(Instances data) {
	

    double[] d = new double[data.numClasses()];
    for(Instance ins:data) d[(int)ins.classValue()]++;
    
	
	return d;
}

	  
	
}