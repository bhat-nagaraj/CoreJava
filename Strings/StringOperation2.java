//Given a string aabbccca output is a2b2c3a1

public class Main
{
	public static void main(String[] args) {
	    
	    String s="abcdee";
	    String answer="";
	    
	    int n=s.length();
	    int i=0;
	     int count=1;
     	while(i<n-1)
	    {
	        if(s.charAt(i)==s.charAt(i+1))
	            {
	            count++;
	            i++;
	            continue;
	            }
	            else
	            {
	            
	            answer=answer+s.charAt(i);
	            answer+=count;
	            
	            count=1;
	            i++;
	            continue;
	        
	            }
	    }
	    answer+=s.charAt(n-1);
	    answer+=count;
	   
	   System.out.println(answer);
	}
}
