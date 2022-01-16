public class CWH_003_JavaLiterals {

    public static void main (String[] args) {
        byte age = 34; // 34 is a literal
        System.out.println(age);
        
        int age2 = 40; // integer literal
        System.out.println(age2);

        char ch = 'A'; // char must be in single quote, 'A' is character literal here
        System.out.println(ch);

        float f1 = 5.6f; // 5.6f is float literal (Decimal value is double literal by default, use f to make it float)
        System.out.println(f1);

        double d1 = 4.660; // Double literal
        System.out.println(d1);

        long ageDino = 220l; // Long literal
        System.out.println(ageDino);

        String name = "Harry";
        System.out.println(name);
    }
}

/*
Literals

A constant value that can be assigned to the variable is called a literal.

    101 – Integer literal
    10.1f – float literal
    10.1 – double literal (default type for decimals)
    ‘A’ – character literal - Single Quote
    true – Boolean literal
    “Harry” – String literal

    For long, float you have to add l or L and f or F to assign value
    For double you can use d or D, Not Neccessary

*/

