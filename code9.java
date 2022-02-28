import java.util.Scanner;
import java.util.ArrayList;
class Arrayylist{
  
       public static void main(String[] args) {  
           
           ArrayList<String> arr = new ArrayList<String>(5);  
      
      arr.add("Maharashtra");  
      arr.add("8899");  
      arr.add("2623");  
      arr.add("Jk");  
      System.out.println("The list of the size is: " + arr.size());  
        
      for (String name : arr) {  
         System.out.println("Name is: " + name);  
      }    
      
      arr.remove(1);  
      System.out.println("\nAfter removing the element the size of the ArrayList is: " + arr.size());  
      
      for (String name : arr) {  
         System.out.println("Name is: " + name);  
      }  
   }  
}  
