
public class right_angle_triangle_properties {
    void main(){
        int n=5;
        //its right angle traingle
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                IO.print("* ");
            }
            IO.println(" ");
        }IO.println("Right angle traingle");

        //inverse right angle traingle
        for (int i = n; i >= 0; i--) {
            for (int j = i; j >= 0; j--){
                IO.print("* ");
            }IO.println("");
        }
            IO.println("This is Inverse of right angle traingle ");
        
        //hollow right angle triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j==0||i==n-1||j==i) {
                    IO.print( "* ");
                }else{
                    IO.print("  ");
                } 
            }
            IO.println("");
        }IO.println("Hollow Right angle traingle ");

        //tilted right angle triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n-i; j++) {
                IO.print("   ");
            }
            for (int k = 0; k <= i; k++) {
                IO.print(" * ");
            }IO.println();
        }IO.println("tilted or mirror Right angle traingle ");

        //rightangle with parameter with series of numbers
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
               IO.print(j);
            }IO.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                IO.print(j);
            }IO.println();
        }IO.println("series of number with two Right angle traingle ");

        //Binary numbers in right angle triangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
               IO.print(j%2);
            }IO.println();
        }IO.println("Binary number in Right angle traingle ");

        //Increasing of Numbers in right angle triangle
        int num=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int sum=num+=1;
               IO.print(sum+" ");
            }IO.println();
        }
        IO.println("series of number with two Right angle traingle ");
    }   
    }
