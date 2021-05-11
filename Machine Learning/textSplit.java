package TestLEarning;

import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;


public class textSplit {

	
HashMap<String, Integer> texted(String tex) {
		

        HashMap<String, Integer> counts = new HashMap<String, Integer>();

        for (String word : tex.split(" ")) { // loops through each word of the string
            // text.split(" ") returns an array, with all the parts of the string between your regexes
            // if current word is not already in the map, add it to the map.

            if (!counts.containsKey(word)) counts.put(word, 0);

            counts.put(word, counts.get(word) + 1); // adds one to the count of the current word
        }
        // lambda expression
        counts.forEach((string, integer) -> System.out.printf("amount of \"%s\": %d\n", string, integer));
    
		
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

}