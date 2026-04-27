
import static java.lang.IO.println;



public class switch_with_new {
    void main() {
        int day=2;

        //lets take example of OLD SWITCH
        switch(day){
            case 1: IO.println("Monday");
            break;
            default: IO.println("Invalid days");
        }
        IO.println();

        //now New Switch, -> Enhanced Switch (Java 12+) and No break needed
        switch (day) {
            case 1 -> IO.println("Fruit");
            default->println("Not a fruit");
        }
        IO.println();


        //Switch as an expression (returns a value):
        String nameofdays= switch(day){
            case 1 -> "Sunday";
            default -> "Not in week i think";
        };
        IO.println(nameofdays);
        IO.println();

        //Multiple Labels (Java 14+) means multiple case
        String whatday= switch(day){
            case 0, 1 -> "Monday";
            default ->"it didnot come under it";
        };
        IO.println(whatday);
        IO.println();

        //Pattern Matching in Switch (Java 17+) simple it can verify variable types
        Object days=2;
        switch(days){
            case String s -> IO.println("It is a String");
            case Integer i -> IO.println("It is a Integer");
            default -> IO.println("Other type");
        }
        IO.println();

        // Yield in Switch Expressions 😮
        
    }
    
}
