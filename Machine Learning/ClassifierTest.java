package TestLEarning;

import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.trees.J48;
import weka.core.Instance;
import weka.core.Instances;

public class ClassifierTest {
	public static void main(String[] args) throws Exception {
		String train1 = "C:/Users/Emil/Downloads/Week 1/Arsenal_TRAIN.arff";
		String test1 = "C:/Users/Emil/Downloads/Week 1/Arsenal_test.arff";

		Instances train = DatasetLoading.loadData(train1);
		Instances test = DatasetLoading.loadData(test1);

	
//train data	
	train.setClassIndex(train.numAttributes()-1);
	Classifier Model = (Classifier)new NaiveBayes();
	Model.buildClassifier(train);
//test data
	test.setClassIndex(test.numAttributes()-1);
	Classifier testModel = (Classifier)new NaiveBayes();
	testModel.buildClassifier(test);
//build classifier

for(int i=0; i<test.numInstances();i++) {
	double testpred = testModel.classifyInstance(test.get(i));
	double[] prediction = testModel.distributionForInstance(test.get(i));

	
System.out.println(testpred +"\t"+ Double.toString(prediction[i]));
	}



/**
//test data
test.setClassIndex(test.numAttributes()-1);
Classifier testModel = (Classifier)new NaiveBayes();
testModel.buildClassifier(test);
for(int i=0; i<test.numInstances();i++) {
double testpred = testModel.classifyInstance(test.get(i));
System.out.println(testpred);
}
*/



}
	}

	
	
	
/**
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
*/
