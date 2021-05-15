package TestLEarning;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class doubleTest {

	public static void main(String[] args) {
		
		final   String text = "Win Win Win Win Draw Draw Loss Loss";
		
		textSplit countWords = new textSplit();
		
		HashMap<String, Double> result = countWords.texted(text);
	
		Collection<Double> resultD = result.values();
		 
		List<Double> doubles = new ArrayList<Double>();
		
		for(int i = 0; i<resultD.size();i++) {
			double[] value = new double[] {i*0.001};
			
			
			
			
			
			
			
		Collection<Double> valuet =	 Arrays.stream(value).boxed().collect(Collectors.toCollection(ArrayList::new));
			
		
		System.out.println(valuet);
		
		}
		
		
		
		
		//for(int i = 0; i < resultD.size();i++) {
			
			
			
		//}
		
		
		//for(int i = 0; i<resultD.size();i++) {
		//	
		//	
		//	i++;
		//}
		
		
		//System.out.println(resultD);
		
		
	}
	
}
