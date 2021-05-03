package TestLEarning;


import java.lang.reflect.Array;

import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.evaluation.Evaluation;
import weka.classifiers.trees.J48;
import weka.core.Instance;
import weka.core.Instances;

public class ClassifierContinue {
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
    
double[] rr = test.attributeToDoubleArray(0);

for(int i=0; i<test.numInstances();i++) {
    double testpred = testModel.classifyInstance(test.get(i));
    
System.out.println(Double.toString(testpred)+"\t"+Array.getDouble(rr, i));//Incompatible operand types double and String
    }
}
     }
        