// Maximum subarray sum

import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args)
	{
	   int arr[]={-2,1,-3,4,-1,2,1,-5,4};
	   int sum=0;
	   int res=Integer.MIN_VALUE;
	   int n=arr.length;
	   for(int i=0;i<n;i++)
	   {
	       sum=sum+arr[i];
	       if(sum<0)
	       sum=0;
	       if(sum>res)
	       res=sum;
	   }
	   System.out.println(res);
	}
}