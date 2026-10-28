package Map;

import java.util.HashMap;
import java.util.Map;

public class CountfrequencyofwordsinasentenceusingMap {

	public static void main(String[] args) {
		String words="Java is powerful and Java is fun";
		
		String[] word=words.split(" ");
		
		Map<String, Integer> map=new HashMap<String, Integer>();
		
		for(String e:word) {
			if(map.containsKey(e)) {
				map.put(e, map.get(e) + 1);
			}
			
			else {
				map.put(e, 1);
			}
		}
		System.out.println(map);
		
	}

}
