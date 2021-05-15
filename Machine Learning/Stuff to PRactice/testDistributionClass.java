package TestLEarning;


import java.util.ArrayList;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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

//int[] nlist;


//String element;

//String testArray;

//List<List<String>> output = new ArrayList<List<String>>();

String[] yourArr = new String[test.numInstances()];
String[] submit = null;
	    for(int i = 0; i<test.numInstances();i++) {
	    		String  trueClassLabel = test.instance(i).toString(test.classIndex());
	    		s = new String[] {trueClassLabel};

	    		list.add(trueClassLabel);
	    		//element = list.get(list.size()-1);
	    		
	    		//String[] stringArray = list.toArray(new String[0]);
	    		
	    		//List<String> testList = list.subList(list.size()-1, list.size());
	    		
	    		//list.add(s);
	    	
	    	//testArray=	Arrays.toString(list.get(i).strip().split(" "));
	    	
	    	//List<String>List = ArrayToListConversion(s);
	    	
	    	//System.out.println(List);
	    	
	    	//for(String b : yourArr) {
	    	///	yourArr[i] = s[i];
	    	//	b++;
	    	//}
	    	yourArr[i] = s[0];
	    	
	    	 submit = Arrays.copyOfRange(yourArr, 0, i);
	   
	    	//System.out.println(Arrays.toString(submit.toString()));

	    		//System.out.println(testArray);

	    		//List<String[]> testList = list.subList(list.size()-1, list.size());
	    		
	    		//element = stringArray.get(stringArray()-1);
	    		/**
	    		for(String b : list) {
	    			sb.append(b);
	    			sb.append("\t");
	    		}
	    		*/
	    	
	    }
	    
	    String submitOne = String.join(" ", submit);
	    textSplit splitWords = new textSplit();
	    HashMap<String, Integer> finalSubmit =   splitWords.texted(submitOne);
    	System.out.println(finalSubmit);

    		   
	    
	  
	    
	    
	
	    
	    
	    	}
}


	 

