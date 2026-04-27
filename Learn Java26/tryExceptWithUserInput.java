import static java.lang.IO.println;
import java.util.InputMismatchException;
import java.util.Scanner;

public class tryExceptWithUserInput {
    void main() {

        //Old way to Use Try Exception with User Input
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any Numbers: ");

        try {
            int num= sc.nextInt();
            System.out.println(num+" : is the number you enter Right?");
        } catch (Exception e) {
            System.out.println("Invalid Inputs -> "+e);
        }finally{
            System.out.println("Executed");
        }

        //Exception Handling (Java 7+) Multi‑catch (catch multiple exceptions in one block) 
        //and Try with resourse ("resource") Automatically closes resources like Scanner, FileReader, etc.
        try(Scanner sc1= new Scanner(System.in)){
            System.out.print("Enter your Second number: ");
            int num2= sc1.nextInt();
            System.out.println(num2+" : is the number you enter Right?");
        } catch (ArithmeticException|NullPointerException|InputMismatchException e) {
            System.out.println("Invalid Inputs -> "+e);
        }

        //Specific Exception Handling in list
        try{
            int[] lst={1,2,3};
            IO.println(lst[3]);
        }catch(IndexOutOfBoundsException e){
            println("list dont have that element -> "+e);
        }
        
        //New Way to use Try except with User inputs


    }
}
