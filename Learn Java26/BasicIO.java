public class BasicIO {
    void main(){
        IO.println("Hello New Java");
        var java=IO.readln("Enter anything Here: ");
        if(java.matches("-?\\d+")){
            IO.println("Your number is "+java);
        }else{
        IO.println(java+ " Nice to Meet you");
    }}
}
