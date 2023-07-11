import java.util.*;  
 public class Main{  
 public static void main(String args[]){  
  ArrayList<String> list=new ArrayList<String>();   
      list.add("Mango");    
      list.add("Apple");    
      list.add("Banana");    
      list.add("Grapes");    
      System.out.println(list);  
      
      Iterator itr=list.iterator();
      while(itr.hasNext()){ 
          System.out.println(itr.next()); 
  } 
  
      for(String fruit:list)    
       System.out.println(fruit);  
  
       Collections.sort(list);  
       System.out.println(list); 
       
       System.out.println("Returning element: "+list.get(1));
       list.set(1,"Orange"); 
       System.out.print(list);
       
       
       ListIterator<String> list1=list.listIterator(list.size());  //element prints in reverse order
              while(list1.hasPrevious())  
              {  
                  String str=list1.previous();  
                  System.out.println(str);  
              }
              
              
        list.forEach(a->{           //Here, we are using lambda expression introduced in java8
          System.out.println(a);  
              });
              
        System.out.println("Traversing list through forEachRemaining() method:");  
        Iterator<String> it=list.iterator();  
          it.forEachRemaining(a-> //Here, we are using lambda expression forEachRemaining() method
              {  
            System.out.println(a);  
              });  
              
 }  
}