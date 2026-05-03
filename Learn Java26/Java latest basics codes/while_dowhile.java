public class while_dowhile {
    void main() {
    //its working for While or Dowhile as old in Latest version
    //Ulimited while loop with control break
    int count=0;
    while(true){
        IO.println("Ulimited while loop");
        count++;
        if(count==1000){
            break;
        }
    }//ctrl+c to cancel it

    //while loop with condition:
    int i = 0;
    while(i<5){
        IO.println("5 time loop");
        i++;
    }

    //lets try do while with infinite loop using conditions
    int doloop=0;
    do { 
        IO.println("This do while will print 1000");
        IO.print(doloop);
        doloop++;
        if(doloop==1000){
            break;
        }
    } while (true);
}
    
}
