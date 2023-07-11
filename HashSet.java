import java.util.*;  
class Main{  
 public static void main(String args[]){  
  
    HashSet<String> set=new HashSet<>();  
           set.add("One");    
           set.add("Two");    
           set.add("Three");   
           set.add("Four");  
           set.add("Five");
           set.add("Five");
           set.add("Four"); 
            
           Iterator<String> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           }  
           set.remove("One"); 
           HashSet<String> set1=new HashSet<String>();  
           set1.add("Ajay");  
           set1.add("Gaurav");  
           set.addAll(set1); 
           System.out.println(set);
 }  
} 