package TestLEarning;

import java.util.Arrays;

import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instance;
import weka.core.Instances;
import weka.classifiers.rules.ZeroR;

public class testingData {

	public static void main(String[] args) throws java.lang.Exception {
		String arff = "D:/Week 1/Arsenal_TRAIN.arff";
		Instances data = DatasetLoading.loadData(arff);
		data.setClassIndex(data.numAttributes()-1);
		Classifier testModel = (Classifier)new NaiveBayes();
		testModel.buildClassifier(data);
		
		confusionMatrix confuse = new confusionMatrix();
		
		int[] dataTest = confuse.classifyInstances(testModel, data);
		int[] classes = confuse.getClassValues(data);
		int[][] confusion = confuse.matrixConfusion(dataTest, classes);
		
		
		ZeroR testr = new ZeroR();
		
	testr.buildClassifier(data);
	
	testr.
		
		
	
		//System.out.println(Arrays.deepToString(confusion));
		//System.out.println(Arrays.toString(dataTest)+'\n'+Arrays.toString(classes));
		
	}
}
