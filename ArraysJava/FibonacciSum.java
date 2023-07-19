import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args)
	{
	    System.out.println(func(2));
	}
	public static int func(int n)
	{
	    if(n<0)
	    {
	        System.out.println("no");
	        return -1;
	    }
	    else if(n==0)
	    return 0;
	    else if(n==1)
	    return 1;
	    else return func(n-1)+func(n-2);
	}
}