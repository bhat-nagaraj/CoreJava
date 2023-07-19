// Find product of all the elements in the array except self
//input=[1,2,3,4,5]   output=[120,60,40,30,24]

import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args)
	{
	   int arr[]={1,2,3,4,5};
	   int n=arr.length;
	   int fac=1;
	   for(int i=0;i<n;i++)
	   {
	       fac=fac*arr[i];
	   }
	   for(int i=0;i<n;i++)
	   {
	       arr[i]=fac/arr[i];
	   }
	   for(int i=0;i<n;i++)
	   {
	       System.out.print(arr[i]+" ");
	   }
	  
	   
	}
}