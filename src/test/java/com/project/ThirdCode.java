package com.project;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class ThirdCode {
	public static void main(String[] args) {
		String s="Aaradhana is my daughter" ;	
		char[] c=s.toCharArray();
		Map<Character,Integer> mp=new TreeMap<Character,Integer>();
		for(int i=0;i<c.length;i++) {
			char a=c[i];
			if(a=='a'|| a=='e'||a=='i'||a=='o'||a=='u') {
			if(mp.containsKey(a)) {
			Integer inte=mp.get(a);
			mp.put(a, inte+1);	 
			}
			else {
				mp.put(a, 1);
			}
		}}	
			Set<Entry<Character, Integer>> entrySet = mp.entrySet();
			for(Entry<Character,Integer> en:entrySet) {
				System.out.println(en);
			}
	}
}
