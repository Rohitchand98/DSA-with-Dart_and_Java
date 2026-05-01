import java.util.List;

public class forloopdemo {
    void main(){
        //Loop is the repetation of program until the condition is meet like For loop
        //Old for loop for Java look like
        for(int i =0; i<5;i++){
            IO.println("This is Old for LOOP");
        }

        //its used to print List, Array, or Array list like this...
        List<String> listofname=List.of("Rohit", "Tom","Harry");
        int sizeoflist= listofname.size();
        for(int i=0; i<sizeoflist;i++){
            IO.print(listofname.get(i)+" ");
        }IO.println();
        
        //Latest way to print a list or array was using forEach
        IO.println("1. Using keyword 'ForEach'");
        listofname.forEach(i-> IO.print(i+" "));

        //two variable in for loop
        IO.println("");
        for (String elem : listofname) {
            IO.print(elem+" ");
        }IO.println();

        //now try it in array(forEach doesnot work in array)
        int[] array={1,2,3};
        for (Object elem : array) {
            IO.print(elem+" ");
        }
    }
}
