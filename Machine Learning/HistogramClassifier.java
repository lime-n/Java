package TestLEarning;


import weka.classifiers.AbstractClassifier;

import weka.classifiers.Classifier;
import weka.core.Capabilities;
import weka.core.Instance;
import weka.core.Instances;

public class HistogramClassifier implements Classifier{
double mean=0;
int bin=10;
int[][] counts;	
	
	
 @Override
 public void buildClassifier(Instances data) throws Exception{
mean = 0;
int numClasses=data.numClasses();
counts=new int[numClasses][bin];

double max= data.attributeStats(numClasses).numericStats.max;
double min= data.attributeStats(numClasses).numericStats.min;
double range = max-min;
double interval=range/bin;




for(Instance ins:data) {
	double value=ins.value(0);
	int classVal=(int)ins.classValue();
	//find bin from value
	double x=min;
	int c=0;
	while(x<value) {
		c++;
		c+=interval;
	}
	counts[classVal][c]++;
	
}

}



 

@Override
public double classifyInstance(Instance arg0) throws Exception {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public double[] distributionForInstance(Instance arg0) throws Exception {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Capabilities getCapabilities() {
	// TODO Auto-generated method stub
	return null;
}


}
