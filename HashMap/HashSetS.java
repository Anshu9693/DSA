import java.util.*;

public class HashSetS {
    public static void main(String[] args) {
       HashSet<Integer> set = new HashSet<>();
       
       set.add(1);
       set.add(2);
       set.add(3);


       //printing 

       System.out.println(set);

       //search  
       if(set.contains(1)){
        System.out.println("set contains 1");
       }
            
       // removing 

       set.remove(2);
       System.out.println(set);


       // size 

       System.out.println(set.size());

       // itereatting 

       Iterator it = set.iterator();

       while(it.hasNext()){
        System.out.print(it.next());
       }


       // isEmpty 

       if(set.isEmpty()){
        System.out.println("set is Empty");
       }

        
    }
}
