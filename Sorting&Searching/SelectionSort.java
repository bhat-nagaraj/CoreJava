//Selection sort

public class Main
{
	public static void main(String[] args) {
	  int arr[]={7,8,3,1,2};
	  int n=arr.length;
	  for(int i=0;i<n-1;i++)
	  {
	    int mn=i;
	    for(int j=i+1;j<n;j++)
	    {
	        if(arr[j]<arr[mn])
	        {
	           mn=j;
	        }
	    }
	    int temp=arr[mn];
	    arr[mn]=arr[i];
	    arr[i]=temp;
	  }
	  
	  
	  for(int i=0;i<arr.length;i++)
	  {
	      System.out.print(arr[i]+" ");
	  }
	    
	}
}
