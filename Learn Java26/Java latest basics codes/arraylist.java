
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class arraylist{
    void main(){

        /*an ArrayList is still straightforward, 
        but you now have more expressive options thanks to updates in the collections API.  */

        //old way
        ArrayList<String> lst1= new ArrayList<>();
        lst1.add("Mango");
        IO.println(lst1);
        IO.println();


        //new way
        var lst2= new ArrayList<String>(); 
        //you can remove the right String bcz its already declared.
        lst2.add("Watermallon");
        IO.println(lst2);
        IO.println();

        //Add multiple elements at once
        ArrayList<String> lst= new ArrayList<>(Arrays.asList("Rohit","Tom","Hari"));
        for(Object ele:lst){
            IO.print(" "+ele);
        }

        //for more than 1 datatype in list like <int, String>
        ArrayList<Object> lst3= new ArrayList<>();
        lst3.add(0, "Orange");
        lst3.add(1, 2);
        for (Object obj : lst3) {
          if (obj instanceof String s) {//Integer for ints
              IO.println(s);
          }else if (obj instanceof Integer i) {
              IO.println(i);
          }
        }
        IO.println();


        //OR use map to seperate the interface not inside the arraylist Example Hashmap
        Map<Integer, String > map = new HashMap<>();
        map.put(1, "Banana");
        map.put(2, "Apple");
        for (Map.Entry<Integer, String> m : map.entrySet()) {
            IO.println(m.getKey()+ " "+ m.getValue());
        }
        IO.println();


        //OR use Pair
        record Pair(int id, String name){}
        ArrayList<Pair> lst4= new ArrayList<>();
        lst4.add(new Pair(1, "Pineapple"));
        for( Pair p: lst4){
            IO.println(p.id+" "+ p.name);
        }

}
}
