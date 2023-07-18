//Bubble Sort

public class Main
{
	public static void main(String[] args) {
	  int arr[]={7,8,3,1,2};
	  int n=arr.length;
	  for(int j=1;j<n;j++)
	  {
	      for(int i=0;i<n-j;i++)
	      {
	          if(arr[i]>arr[i+1])
	          {
	              int temp=arr[i];
	              arr[i]=arr[i+1];
	              arr[i+1]=temp;
	          }
	      }
	  }
	  
	  
	  
	  
	  for(int i=0;i<arr.length;i++)
	  {
	      System.out.print(arr[i]+" ");
	  }
	    
	}
}
