package TestLEarning;

import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;


public class textSplit {

	
HashMap<String, Double> texted(String tex) {
		

        HashMap<String, Double> counts = new HashMap<String, Double>();

        for (String word : tex.split(" ")) { // loops through each word of the string
            // text.split(" ") returns an array, with all the parts of the string between your regexes
            // if current word is not already in the map, add it to the map.

            if (!counts.containsKey(word)) counts.put(word, (double) 0);

            counts.put(word,counts.get(word) + 1); // adds one to the count of the current word

        }
return counts;
	}




/**
HashMap<String, Integer> splitWords(String words) {

	var test = words;
    var wordSplit = test.split(" ");
    
    Map<String,Integer> registry = new HashMap<String, Integer>();
    
    var result = new int [wordSplit.length];
    
    for(var i = 0; i < wordSplit.length; i++) {
    	result[i] = registry.computeIfAbsent(wordSplit[i], $ -> registry.size()+1);
    }

	return result;

	
}
*/


int[] splitted(String text) {
String[] split = text.split(" ");

// To maintain unique value for each word of input string 
Map<String, Integer> map = new HashMap<>();

int counter = 0;
for(String ele:split)
  if(!map.containsKey(ele))
    map.put(ele, ++counter);
 
// Getting unique value for each word and assigining in array
int[] array1=new int[split.length];

for(int i=0; i<split.length;i++)
 array1[i] = map.get(split[i]);

return array1;

}


public static String transpose(String s) {
	  int L = s.length();
	  return (L < 2) ? s
	    : s.substring(0, 1) + s.substring(L-1, L) + transpose(s.substring(1, L-1));
	}



int[] numSplit(String numberSplit) {
	
	 final var words = numberSplit.split( " " );
	    final Map<String,Integer> registry = new HashMap<>();
	    final var result = new int [words.length];
	    for( var i = 0; i < words.length; ++i )
	    {
	      result [i] = registry.computeIfAbsent( words [i], $ -> registry.size() + 1 );
	    }
		return result;
	  }

}


