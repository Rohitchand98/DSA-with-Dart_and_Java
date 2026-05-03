
public class right_angle_triangle {
    void main(){
        int n=5;
        //its right angle traingle
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                IO.print("* ");
            }
            IO.println(" ");
        }IO.println("Right angle traingle\n");

        //inverse right angle traingle

        for (int i = n; i >= 0; i--) {
            for (int j = i; j >= 0; j--){
                IO.print("* ");
            }IO.println("");
            }
            IO.println("This is Inverse of right angle traingle\n");
        
        }
    }
