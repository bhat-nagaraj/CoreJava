//Given column and row number, find the particular element in that row and column according to pascal triangle


import java.util.*;
import java.math.*;
public class Main
{
    public static void main(String args[])
    {
     int row=4;
     int col=2;
     
     int res=func(row-1);
     int ans=func(col-1);
     int ans1=func(row-col);
     int finalAns=res/(ans*ans1);
     System.out.println(finalAns);
   }
   public static int func(int a)
   {
       int multiply=1;
       for(int i=1;i<=a;i++)
       {
        multiply*=i;   
       }
       return multiply;
   }
}