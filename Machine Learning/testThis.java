package TestLEarning;

import weka.attributeSelection.CfsSubsetEval;

import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.lazy.IBk;
import weka.classifiers.trees.J48;
import weka.attributeSelection.GreedyStepwise;
import weka.core.Attribute;
import weka.core.Instances;
import weka.core.UnassignedClassException;
import weka.core.converters.ArffSaver;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Remove;
import weka.filters.supervised.attribute.AttributeSelection;
import java.io.File;

import weka.core.AttributeStats;
import weka.core.Instance;


public class testThis {
//	int x = 2;
	
// public AttributeStats attributeStats(int x) {
		 
//	 }
	
public static void main(String[] args) throws Exception {
	String arff = "C:/Users/Emil/Downloads/Week 1/Arsenal_TRAIN1.arff";
	Instances data = DatasetLoading.loadData(arff);
//int s = 0;

	//String[] rmSaka = new String[] {"-R","3"};
    //Remove remove = new Remove();
    //remove.setOptions(rmSaka);
    //remove.setInputFormat(data);
    //Instances newData = Filter.useFilter(data, remove);
  // AttributeSelection filter = new AttributeSelection();
   //CfsSubsetEval eval = new CfsSubsetEval();
  // GreedyStepwise search = new GreedyStepwise();
   
  // search.setSearchBackwards(true);
  // filter.setEvaluator(eval);
  // filter.setSearch(search);
  // filter.setInputFormat(data);
   //Instances newData = Filter.useFilter(data, filter);
   
//	data.setClassIndex(data.numAttributes()-1);
//	for(int i=0; i<data.numAttributes(); i++) {
//		s = data.attributeStats(i).toString();
//		Instances t = data;
//	
//		System.out.println("test this:"+s);
				
//	}
   
//data.setClassIndex(data.numAttributes()-1);
//for(int i=0; i<data.numAttributes(); i++) {
//	s = data.attributeStats(i).nominalCounts[i];
	
//	System.out.println("Test this:"+s);
//
data.setClassIndex(data.numAttributes()-1);

Classifier cls = new J48();
cls.buildClassifier(data);


for(int i=0; i<data.numInstances();i++) {
//store data as an instance	
	Instance inst = data.instance(i);
//store as a double value	
	double actualClass = data.instance(i).classValue();
//store as string so it can be printed 	
	String actual = data.classAttribute().value((int)actualClass);
//store the classified instances as double	
double result = cls.classifyInstance(inst);
//create prediction
String prediction = data.classAttribute().value((int)result);

System.out.println("look at this:"+actual+"\t"+"or this:"+prediction);

}


	//System.out.println("Num cases = " + newData.numAttributes());
	//System.out.println("Num attributes = " + newData.numAttributes());
	//System.out.println("Instance number 5 = " + data.instance(5));
	//System.out.print(data.attributeStats(2).nominalCounts[2]);
		
//	ArffSaver saver = new ArffSaver();
//	saver.setInstances(newData);
//	saver.setFile(new File("C:/Users/Emil/Downloads/Week 1/Arsenal_TRAIN1.arff"));
//	saver.writeBatch();
}
}
