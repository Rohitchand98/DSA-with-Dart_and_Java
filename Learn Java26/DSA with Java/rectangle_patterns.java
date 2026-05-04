public class rectangle_patterns {
    void main(){
        int n=5;

        //This code will print a star rectangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                IO.print(" * ");
            }
            IO.println("   ");
        }
    }
}
