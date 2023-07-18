//Longest substring without repeating characters

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  String s="abcadefghijk";
	  HashSet<Character> hs=new HashSet<Character>();
	  String till="";
	  String total="";
	  int j=0;
	  int i=j;
	  int n=s.length();
	  while(i<n)
	  {
	      if(hs.contains(s.charAt(i)))
	      {
	          till="";
	          hs.clear();
	          i=++j;
	          
	      }
	      else
	      {
	          till+=s.charAt(i);
	          hs.add(s.charAt(i));
	          if(till.length()>total.length())
	          total=till;
	          i++;
	      }
	      
	  }
	  System.out.println(total);
	}
}
