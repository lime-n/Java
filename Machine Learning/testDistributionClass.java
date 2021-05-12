package TestLEarning;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayes;
import weka.core.Instances;

public class testDistributionClass {
	


	 public static void main(String[] args) throws Exception {

	        String test1 = "D:/Week 1/Arsenal_test.arff";

	        Instances test = DatasetLoading.loadData(test1);

	    test.setClassIndex(test.numAttributes()-1);

	    
	    Classifier testModel = (Classifier)new NaiveBayes();
	    testModel.buildClassifier(test);
	 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
 /**
    	String[] t = new String[5];
    	t[0]="Win";
    	t[1]="Win";
    	t[2]="Draw";
    	t[3]="Draw";
    	t[4]="Loss";
    	
    String tt=	String.join(" ", t);
    String[] ttt = tt.split(" ");
    
    	StringBuilder result = new StringBuilder();
 for(int i = 0; i < t.length; i++) {
	 result.append(ttt[i]);
 }
 
 String mynewstring = result.toString();
    	
 System.out.println(mynewstring);
   
		 
 
 String[] s = new String[t.length];
 for(int i=0; i<t.length;i++) {
	 s[i] = t[i];
 }
 
		 */
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 /**
String[] vt = new String[ttt.length];
for(int i = 0; i < vt.length;i++) {
	vt[i]=ttt[i];
}

String[] temp = new String[t.length];
for(int i = 0; i<t.length;i++) {
	for(int j = i+1; j<t.length;i++) {
	temp[i] = t[i];
	
}
}
*/




//System.out.println(Arrays.deepToString(vt));


ArrayList<String> list = new ArrayList<String>();
String[] s=null;



StringBuilder sb = new StringBuilder();
//for(String s : list) {
//	sb.append(s);
//	sb.append("\t");
	
//}

//String tt=	String.join("", sb);
//String[] ttt = tt.split(" ");

//System.out.println(Arrays.toString(ttt));

String element;

	    for(int i = 0; i<test.numInstances();i++) {
	    		String  trueClassLabel = test.instance(i).toString(test.classIndex());
	    		s = new String[] {trueClassLabel};
	    		
	    		list.add(trueClassLabel);
	    		//element = list.get(list.size()-1);
	    		
	    		String[] stringArray = list.toArray(new String[0]);
	    		
	    		List<String> testList = list.subList(list.size()-1, list.size());
	    		
	    		
	    		//element = stringArray.get(stringArray()-1);
	    		/**
	    		for(String b : list) {
	    			sb.append(b);
	    			sb.append("\t");
	    		}
	    		*/
	    		
	    		System.out.println(testList);
	    	
	        	}
   

	    	}    	

	    	
	    
	
}
	 

