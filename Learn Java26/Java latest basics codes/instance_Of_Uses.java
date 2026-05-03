public class instance_Of_Uses {
    void main() {
        //Use instanceof when dealing with unknown or mixed types. Works with objects only, not primitives.
        //old instance checker
        Object obj = "Hello";
        if(obj instanceof String s) { // manual cast
            // manual cast
            System.out.println(s.toUpperCase());
        }

        //new instanceof
        Object obj1="Rohit";
        if (obj1 instanceof String s) {
            IO.println(s.toUpperCase());   
        }

        //using instanceof in Switch 
        Object obj2=24;
        switch (obj2) {
            case String s -> IO.println(s+" Object is a String");
            case Integer i -> IO.println(i+" Object is a Integer");
            default ->throw new AssertionError();
        }

    }
}
