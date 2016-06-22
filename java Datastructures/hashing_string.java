import java.util.*;
public class hashing_string {

	public static void main(String[] args)
	{
		String words = "hello this is hello and again hello";
		String[] wordsarr = words.split(" ");
		int value = 1;
		HashMap<String,Integer> hm = new HashMap<>();
		
		for(String element : wordsarr)
		{
			  if(hm.get(element) == null)
			  {
				  hm.put(element,value); 
			  }
			  else
			  {
				 hm.put(element,hm.get(element)+1);
			  }
				
		}
		
	System.out.println(	hm.get("this"));
	}
}
