// Program for calculate number of characters of string using HashMap key,value pairs


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String s="abcac";
		HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
		for(int i=0;i<s.length();i++){
		    char c=s.charAt(i);
		    if(hmap.containsKey(c))
		    hmap.put(c,hmap.get(c)+1);
		    else
		    hmap.put(c,1);
		}
		for(Map.Entry<Character,Integer> lan:hmap.entrySet()){
		    char m=lan.getKey();
		    int n=lan.getValue();
		    System.out.println(m + ":" + n);
		}
		for(char lu:hmap.keySet()){
		    System.out.println(lu);
		}
		for(int ele:hmap.values()){
		   
		    System.out.println(ele);
		    
		}
		
	}
}
