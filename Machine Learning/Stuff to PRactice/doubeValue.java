package TestLEarning;

import java.util.Arrays;

import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instance;
import weka.core.Instances;

public class doubeValue {
	public static void main(String[] args) throws Exception {

        String test1 = "D:/Week 1/Arsenal_test.arff";

        Instances test = DatasetLoading.loadData(test1);

    test.setClassIndex(test.numAttributes()-1);

    
    Classifier testModel = (Classifier)new NaiveBayes();
    testModel.buildClassifier(test);
    
    
    
    double[] d = new double[test.numClasses()];
    for(Instance ins:test) d[(int)ins.classValue()]++;
    
    System.out.println(Arrays.toString(d));
    
    
    
    
    
	}
}
