public class rectangle_patterns {
    void main(){
        int n=5;

        //This code will print a stars of Square
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                IO.print(" * ");
            }
            IO.println("");
        }IO.println("This is a Square\n");

        //This code will print a stars of rectangle
        for (int i = 0; i < n; i++) {
            for (int j = n/2; j < n; j++) {
                IO.print(" * ");
            }
            IO.println("");
        }IO.println("This is a Rectangle\n");

        //This code will print a stars of Hollow rectangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0||j==0||i==n-1||j==n-1) {
                    IO.print(" * ");
                }else{
                    IO.print("   ");
                }
            }IO.println("");
            //here i have made a mistake which is i add another k forloop which increase extra weight and space
            //if a pattern is form using 2 loop try to follow using 2
        }IO.println("This is a Hollow Rectangle\n");

        
    }
}
