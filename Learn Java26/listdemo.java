import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listdemo {
    void main(){
    /* ##The Golden Era: Collections Framework (Java 1.2) introduced the List interface, which unified how we handle ordered collections.
    ## ArrayList: The go-to choice. It uses an internal array that grows dynamically. Fast for random access (get(i)).  
    ## LinkedList: A doubly-linked list. Better for frequent adding/removing at the ends, but slower for accessing elements by index.*/

    List<String> lstname= new ArrayList<>();
    lstname.add(0, "Fruits");
    IO.println(lstname.get(0));

    // The Modern Era: Immutability (Java 9)Java 9 introduced List.of(), 
    // which creates a truly immutable (cannot be changed) list in one line. 

    List<String> lstname1= List.of("Banana", "Orange", "Lemon");
    //Use lstname1.add("Any"); will throw an exception error.
    for(String lst:lstname1){
        IO.print(lst+" ");
    }
    lstname1.forEach(IO::print);
    IO.println();

    /*Java 21 introduced SequencedCollection and SequencedList.  
    Key Changes:getFirst() / getLast(): No more list.get(0) or list.get(list.size() - 1).
    addFirst() / addLast(): Direct methods to add at either end. 
    reversed(): Returns a view of the list in reverse order (extremely fast, doesn't copy data). */
    List<String> lstname2= new ArrayList<>(List.of("Banana", "Orange", "Lemon"));
    lstname2.addFirst("Apple");
    lstname2.addLast("Kiwi");
    List<String> lstname2rev=lstname2.reversed();
    IO.print(lstname2rev);
    IO.println();

    //OPERATIONS IN LIST
    List<String> list=new ArrayList<>(List.of("Rohit","Hari"));
    String first=list.getFirst();
    String last=list.getLast();
    int index=list.indexOf("Rohit");
    Boolean iscontain=list.contains("Rohit");
    String item=list.get(0);
    int size= list.size();

    IO.print(first+" is First item "+last+" is last item "+index+" is index item "+iscontain+" item is contain "+item+" is item in list "+size+" is the size of list"); 
    IO.println();

    //Modification and Removal
    list.set(0, "Rohitchand");
    list.remove(1); //or item "name"
    list.removeIf(s -> s.startsWith("R"));
    list.clear();
    IO.println(list);

    //Conversion from array to list and vice versa
    String[] array= {"tom","Cham"};
    List<String> list2= new ArrayList<>(Arrays.asList(array)); //array to list
    IO.println(list2+" array to list");
    String[]array2=list2.toArray(array); //list to array
    //list2.forEach(e-> IO.println(e+" list to array")); // for list
    Arrays.stream(array2).forEach(e-> IO.print(e+" ")); //or forEach(IO::print) it act as if true
    }
}
