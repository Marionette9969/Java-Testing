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
        double d1 = 10.0;
        double result = f1 + d1; // if double change to float, it will result an error
        System.out.println(result);
    }
}