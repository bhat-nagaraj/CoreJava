//Remove spaces from a string in java

public class Main
{
	public static void main(String[] args) {
	    String st="  mnop qr ";
	    StringBuilder sb=new StringBuilder();
	    for(int i=0;i<st.length();i++)
	    {
	        char c = st.charAt(i);
	        if(Character.isWhitespace(c) != true)
	        {
	            sb.append(c);
	        }
	    }
		System.out.println("After removing white space: "+sb);
	}
}
