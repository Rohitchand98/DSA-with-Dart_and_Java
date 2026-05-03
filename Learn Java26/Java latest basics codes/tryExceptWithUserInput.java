import java.io.IOError;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class tryExceptWithUserInput {
    void main() {
        //Try to run this programs differently because different versions causes conflicts

        //Old way to Use Try Exception with User Input
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any Numbers: ");
        
        try {
            int num= sc.nextInt();
            System.out.println(num+" : is the number you enter Right?");
            sc.close();
        } catch (Exception e) {
            System.out.println("Invalid Inputs \n-> "+e);
        }finally{
            System.out.println("Executed");
        }

        //Exception Handling (Java 7+) Multi‑catch (catch multiple exceptions in one block) 
        //and Try with resourse ("resource") Automatically closes resources like Scanner, FileReader, etc.
        try(Scanner sc1= new Scanner(System.in)){
            System.out.print("Enter your Second number: ");
            int num2= sc1.nextInt();
            System.out.println(num2+" : is the number you enter Right?");
            sc1.close();
        } catch (ArithmeticException|NullPointerException|NoSuchElementException e) {
            System.out.println("Invalid Inputs \n-> "+e);
        }

        //Specific Exception Handling in list
        // try{
        //     int[] lst={1,2,3};
        //     IO.println(lst[3]);
        // }catch(IndexOutOfBoundsException e){
        //     println("list dont have that element \n-> "+e);
        // }
        
        //Java 21+ version Way to use Try except with User inputs
        try {
            String inp= System.console().readLine("Enter the 3rd number: ");
            int num3= Integer.parseInt(inp);
            IO.println("Square of the number is "+num3*num3);
        } catch (NumberFormatException|InputMismatchException e) {
            IO.println("Invalid inputs \n-> "+e);
        } catch(NullPointerException e1){
            IO.println("Console is not working in your JDK \n-> "+e1);
        } 
        finally {
            IO.println("Come again...");
        }

        //Java 26+ version User input in try except
        try {
            String inp1= IO.readln("Enter the 4th Number : ");
            int num4= Integer.parseInt(inp1);
            IO.println("The 4th number is "+num4);

        } catch (IOError e) {
            IO.println("Your 26+ version has a IO problem fix it \n->"+e);
        }


    }
}
