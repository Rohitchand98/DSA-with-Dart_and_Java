void main(){
    String n=IO.readln("Enter your binary number: ");
    int num=Integer.parseInt(n);
    if (num>=0) {
        IO.print(n+": "+Integer.toBinaryString(num));
    } else {
        IO.print(n+": "+Integer.toBinaryString(num));
    }
    
}