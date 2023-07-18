//Linear Search

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	int arr[]={4,3,6,5,1,7};
	int n=arr.length;

	int ele=6;
	int res=func(arr,ele,n);
	System.out.println(res);
	}
	public static int func(int a[],int element,int n)
	{
	    for(int i=0;i<n;i++)
	    {
	        if(a[i]==element)
	        return i;
	    }
	    return -1;
	}
}
