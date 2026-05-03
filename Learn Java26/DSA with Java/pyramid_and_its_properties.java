public class pyramid_and_its_properties {
    void main(){
        int n=5;
        //how to make pyramid using Java
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                IO.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                IO.print("* ");
            }
            IO.println(" ");
        }IO.println("This is Pyramid of Star\n");
        
        //Inverse pyramid in java
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < n-i; j++) {
                IO.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                IO.print("* ");
            }
            IO.println("");
        }IO.println("This is inverse Pyramid of Star\n");

        //Hollow pyramid in java
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                IO.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if (k==0||k==i||i==n-1) {
                    IO.print("* ");
                }else{
                    IO.print("  ");
                }
            }
            IO.println("");
        }IO.println("This is Pyramid with hollow traingle\n");

        //Combine the normal and inverse pyramid to form a diamond
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                IO.print(" ");
            }
            for (int k = 0; k < i; k++) {
                IO.print("* ");
            }
            IO.println(" ");
        }
        //Inverse pyramid in java
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < n-i; j++) {
                IO.print(" ");
            }
            for (int k = 0; k < i; k++) {
                IO.print("* ");
            }
            IO.println("");
        }IO.println("This is Diamond\n");

    }
}
