//NullpointerException

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String st=null;
	    func(st);
	}
	public static void func(String s)
	{
	   System.out.println(s.length()); 
	}
}
