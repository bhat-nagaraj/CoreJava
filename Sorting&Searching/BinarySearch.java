//Binary Search

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	int arr[]={1,2,3,4,7,8};
	int n=arr.length;
	int low=0;
	int high=n-1;
	int ele=5;
	int res=func(arr,low,high,ele);
	System.out.println(res);
	}
	public static int func(int a[],int l,int h,int element)
	{
	    while(l<h){
	    int mid=(l+(h-1))/2;
	    if(a[mid]==element)
	    return mid;
	    else if(a[mid]>element)
	    return func(a,l,mid-1,element);
	    else if(element>a[mid])
	    return func(a,mid+1,h,element);
	    }
	    return -1;
	}
}
