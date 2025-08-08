package Gitpack;

import java.util.LinkedHashMap;
import java.util.Map;

public class ConcrOfWords {
	
		public static void main(String[] args) {
			String s="Hi hello Hi hello hi User";
			String[] str=s.split(" ");
			Map<String, Integer> m=new LinkedHashMap<String, Integer>();
			for (int i = 0; i < str.length; i++) {
				String strng=str[i];
				if(m.containsKey(strng)) {
					Integer in=m.get(strng);
					m.put(strng, in+1);
					
				}
				else {
					m.put(strng, 1);			}
				
			}
			System.out.println(m);
			System.out.println("GitHub Update");
		}
		

	}


}
