import java.util.Arrays;

public class array {
    void main() {

    /* ***String[] names (The Array)***
    This is a Basic Array. It is a low-level feature built into the Java language itself.
    Size: Fixed. Once you create an array of size 5, it will always be size 5. To "add" a 6th item, you have to create a whole new array.
    Methods: Very limited. You mostly interact with it using indexes like names[0].
    Performance: Slightly faster and uses less memory, but much harder to work with for complex tasks.*/

        //Array should have limited blocks of element numbers like new string[anynumbers];
        String[] arrayplayer= new String[3];
        arrayplayer[0]="Ronaldo";
        arrayplayer[1]="Messi";
        arrayplayer[2]="Lewa";

        //or in direct add Multiple elements in array
        String[] arrayplayers= {"tom","jerry","dog"};

        //or loop 
        String[] newarray= new String[3];
        for(int i=0; i<arrayplayer.length; i++){
            newarray[i]=arrayplayer[i];
        }

        //How to Print arrays, natural way use for loop 
        //old or new
        for(int i =0; i<arrayplayer.length; i++){
            IO.println(arrayplayers[i]);
        }
        //New
        for(Object obj:newarray){
            IO.print(obj+" ");
        }
        IO.println();

        //using String.join to print the list
        IO.print("This is one word : "+String.join(" ", newarray[2]));
        IO.println();

        //It print the list as array and print it into strings
        IO.print("This is printed using Arrays.toString() :"+Arrays.toString(arrayplayer));
    }
}
