public class if_else {
    void main() {
        int x=0;

        //Old If else statement 
        if(x==0){
            IO.println("x=="+x);
        }else if(x!=0){
            IO.println("x=="+x);
        }else{
            IO.println("Invalid variable");
        }

        //New if else statement 
        if(x%2==0) IO.println("Even"); else IO.println("Odd");

        //Or
        if(x>=0) IO.println("its Positive"); 
        else if(x<0) IO.println("its Negative"); 
        else IO.println("Invalid input");

        //New Nested if else statement
        if(x==0){if(x==0) IO.println("This Number is Zero");}

        //Object instanceof demo in if statement
        Object obj=0;
        if(obj instanceof Integer) IO.println("Object is "+obj);

        //Json internal word search
        String json="""
                "id":1, "name":"Rohit",
                """;
        if(json.contains("Rohit")) IO.println("Name found "+json.contains("Rohit"));
    }
}
