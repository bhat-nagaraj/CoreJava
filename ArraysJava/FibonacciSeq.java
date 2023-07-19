//Fibonacci Sequence

import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args)
	{
	    func(10);
	}
	public static void func(int n)
	{
	   int n1=0;
	   int n2=1;
	   int count=0;
	   while(count<n)
	   {
	       System.out.print(n1+" ");
	       int n3=n1+n2;
	       n1=n2;
	       n2=n3;
	       count++;
	       
	   }
	}
}