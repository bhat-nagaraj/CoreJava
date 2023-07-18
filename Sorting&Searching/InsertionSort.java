//Insertion Sort

public class Main
{
	public static void main(String[] args) {
	  int arr[]={7,8,3,1,2};
	  int n=arr.length;
	 
	  for(int i=1;i<n;i++)
	  {
	      for(int j=0;j<i;j++)
	      {
	          if(arr[i]<arr[j])
	          {
	              int temp=arr[i];
	              arr[i]=arr[j];
	              arr[j]=temp;
	          }
	      }
	  }
	  
	  
	  for(int i=0;i<arr.length;i++)
	  {
	      System.out.print(arr[i]+" ");
	  }
	    
	}
}
