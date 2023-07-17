//Remove all occurance of a given character from a String

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String st="abcdabcaa";
	    char res='a';
	    st=st.replace("a","");
	    System.out.println(st);
	}
}
