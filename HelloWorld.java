import static java.lang.System.out;

public class HelloWorld {


    public static void main(String[] args) {
        

        String txt = "Test String Text";
        System.out.println(txt);
        System.out.println(txt.toUpperCase());   // Outputs Huruf Besar
        //System.out.println(txt.toLowerCase());   // Outputs Huruf Kecil

        System.out.println("");
        System.out.println("");
        System.out.println("Float and Int Variable Below");
        int x = 5;
        float y = 10f / 100f;
        double c = 15.3;
        float a = x + x * y ;
        System.out.println(a);
        System.out.println(x + c);

        System.out.println("Float and Double calculation");
        System.out.println("");
        float f1 = 1.3f;
        double d1 = 10.0; // it can also be float f1 = 1.3f, double d1 = 10.0;
        double result = f1 + d1; // if double change to float, it will result an error
        System.out.println(result);


        System.out.println(""); System.out.println("");
        System.out.println("Java Comparison Variable");
        int a1 = 10;
        a1 += 5;
        System.out.println(a1);


        System.out.println(""); System.out.println("");
        System.out.println("Java Special Character");
        String Singlequote = "For a single quote char will need to have = \\' ";
        String Doublequote = "For a double quote char will need to have = \\\"\"\\";
        System.out.println(Singlequote);
        out.println(Doublequote);

        out.println("");
        out.println("");
        out.println("Java While Loop Testing ");
        
        int i = 10;
        for (i = 0 ; i < 10; i++)
        {
            out.print(i);
        }
    }
}