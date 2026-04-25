public class Array {
    void main() {
        //Array should have limited blocks of element numbers like new string[anynumbers];
        String[] arrayplayer= new String[3];
        arrayplayer[0]="Ronaldo";
        arrayplayer[1]="Messi";
        arrayplayer[2]="Lewa";

        //or in direct add of elements in array
        String[] arrayplayers= {"tom","jerry","dog"};
        //or loop 
        String[] newarray= new String[3];
        for(int i=0; i<arrayplayer.length; i++){
            newarray[i]=arrayplayer[i];
        }

        //How to Print arrays 
        IO.println(String.join(" ", arrayplayer));
        for(int i =0; i<arrayplayer.length; i++){
            IO.println(arrayplayers[i]);
        }
        IO.print("This is one word : "+String.join(" ", newarray[2]));
    }
}
