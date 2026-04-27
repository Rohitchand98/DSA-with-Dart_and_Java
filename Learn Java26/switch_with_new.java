
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
        //Yield use for Multiple line of code in CASES eg.
        String whatday= switch(day){
            case 0, 1 -> "Monday";
            case 2 -> {
                IO.println(day+" can be any day in a week");
                yield "A day in week";
            }
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

        // Even Odd Switch Expressions 😮 comparing using switch
        int number =5;
        switch(number%2){
            case 0-> IO.println("Even");
            case 1-> {
                IO.println("The number is Odd");
            }default -> IO.println("Invalid Inputs");
        }
    }
    
}
