package TestLEarning;
import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.trees.J48;
import weka.core.Instance;
import weka.core.Instances;

public class ForClassifier {
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

for(int i=0; i<train.numInstances();i++) {
    for(int j=0;j<test.numInstances();j++) {
    double pred = Model.classifyInstance(train.get(i));
    double testpred = testModel.classifyInstance(test.get(j));
    
System.out.println(pred + "\t" + testpred + "\t" + (pred==testpred));//Incompatible operand types double and String
    }
}
     }
        }