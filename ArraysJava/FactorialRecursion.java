// Factorial using Recursion java

import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args)
	{
	   int a=5;
	   System.out.println(func(a));
	   
	}
	public static int func(int a)
	{
	    if(a<1)
	    return 1;
	    else
	    {
	        return a*func(--a);
	    }
	    
	}
}