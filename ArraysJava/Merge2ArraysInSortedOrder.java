// Merge two arrays in sorted order

import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args)
	{
	   int arr[]={1,3,4,7};
	   int a[]={2,5,6,9};
	   int n1=arr.length;
	   int n2=a.length;
	   int res[]=new int[n1+n2];
	   
	   int i=0;
	   int j=0;
	   int m=0;
	   
	   while(i<n1)
	   {
	       res[m++]=arr[i++];
	   }
	   
	    while(j<n2)
	   {
	       res[m++]=a[j++];
	   }
	   Arrays.sort(res);
	   for(int l=0;l<n1+n2;l++)
	   {
	       System.out.print(res[l]+" ");
	   }
	   
	  
	   
	}
}