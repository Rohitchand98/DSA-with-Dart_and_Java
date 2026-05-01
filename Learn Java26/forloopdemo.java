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
        }
        

    }
}
