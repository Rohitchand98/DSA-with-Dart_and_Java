public class triplequote {
    void main(){
        //simple use
        String story="""
                My name is Rohitchand this is my java tripple quote program
                trying my best to learn java with new features for 7 days to complete all to start DSA in java
                """;
        IO.println(story); //use println not print because its has multiple line

        //data entry like json use
        String jsondata="""
                1:"Rohit",
                2:"Biswa",
                3:"Soram"
                """;
        IO.println("Json data");
        IO.println(jsondata);

        //uses in SQL queries
        String studentdata="""
                SELECT id, name
                FROM students
                WHERE marks>80
                ORDER BY name ASC
                """;
        IO.println("SQL queries");
        IO.println(studentdata);

        //Data inside """...""" into key and value divide
        String[] lines= jsondata.split("\\n");
        for(String line: lines){
                String[] parts= line.split(":");
                if(parts.length==2){
                        IO.println("id: "+parts[0]+"->  names:"+parts[1]);
                }
        }

        //Other Uses of Tripple quote
                //Embedding Code Snippets
        //You can store a whole block of code inside a text block for documentation or testing:

        String snippet = """
        public class Demo {
        public static void main(String[] args) {
                System.out.println("Hello World");
        }
        }
        """;
        System.out.println(snippet);

        //Multi‑line Regex or Config
        //Instead of writing long regex/config strings with escapes:
        String regex = """
        [a-zA-Z0-9]+@[a-z]+\\.(com|org|net)
        """;
        System.out.println(regex);

        //Structured Data (CSV style)
        String csv = """
        id,name,marks
        1,Rohit,85
        2,Aman,90
        3,Neha,78
        """;

        for (String line : csv.split("\\n")) {
        System.out.println(line);
        }

    }
}
