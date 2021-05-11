package TestLEarning;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringLearning {

	public static void main(String[] args) {
		
		
	String text = "Win Win Win Win Draw Draw Loss Loss";
	/**
	   HashMap<String, Integer> counts = new HashMap<String, Integer>();

       for (String word : text.split(" ")) { // loops through each word of the string
           // text.split(" ") returns an array, with all the parts of the string between your regexes
           // if current word is not already in the map, add it to the map.
           if (!counts.containsKey(word))
               counts.put(word, counts.size() + 1); // index of the word (+ 1 because your expected output was 1-indexed)

       }
       for (String word : text.split(" ")) {
           System.out.print(counts.get(word) + " ");
       }
	*/
      
	textSplit words = new textSplit();
	
	words.texted(text);
	
	System.out.println(text);
	
		}
	
	/**
	String text(String tex) {
		
		

        HashMap<String, Integer> counts = new HashMap<String, Integer>();

        for (String word : tex.split(" ")) { // loops through each word of the string
            // text.split(" ") returns an array, with all the parts of the string between your regexes
            // if current word is not already in the map, add it to the map.

            if (!counts.containsKey(word)) counts.put(word, 0);

            counts.put(word, counts.get(word) + 1); // adds one to the count of the current word
        }
        // lambda expression
        counts.forEach((string, integer) -> System.out.printf("amount of \"%s\": %d\n", string, integer));
    
		
		return null;
	}
	*/
	
	
	}

