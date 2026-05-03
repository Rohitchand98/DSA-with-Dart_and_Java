public class pyramid_and_its_properties {
    void main(){
        int n=5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                IO.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                IO.print("* ");
            }
            IO.println(" ");
        }
    }
}
