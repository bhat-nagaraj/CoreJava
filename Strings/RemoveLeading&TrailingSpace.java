//Remove leading and trailing spaces from string 
// strip() and trim() are the two methods used to remove leading trailing spaces from string

public class Main
{
	public static void main(String[] args) {
	    String st="  mnop qr1     ";
	    String ans = st.strip();
	    String res=st.trim();
	    System.out.println(ans.length());
	    System.out.println(res);
	}
}
