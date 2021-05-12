package TestLEarning;

import java.util.Arrays;
import java.util.HashMap;

import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instances;

public class TransposeStrings {
public static void main(String[] args) throws Exception {
String test1 = "D:/Week 1/Arsenal_test.arff";
Instances test = DatasetLoading.loadData(test1);
test.setClassIndex(test.numAttributes()-1);
Classifier testModel = (Classifier)new NaiveBayes();
testModel.buildClassifier(test);
String[] s=null;
String[] yourArr = new String[test.numInstances()];
String[] submit = null;
for(int i = 0; i<test.numInstances();i++) {
String  trueClassLabel = test.instance(i).toString(test.classIndex());
s = new String[] {trueClassLabel};
yourArr[i] = s[0];
submit = Arrays.copyOfRange(yourArr, 0, i);
}
String submitOne = String.join(" ", submit);
textSplit splitWords = new textSplit();
HashMap<String, Integer> finalSubmit =   splitWords.texted(submitOne);
System.out.println(finalSubmit);
}
	 }


	 

