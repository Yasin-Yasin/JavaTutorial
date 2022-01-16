import java.util.Scanner;

public class CWH_004_UserInput {

    public static void main (String[] args) {
        // Object of class Scanner
        Scanner s = new Scanner (System.in);  // System.in indecate read data from KeyBoard 

        System.out.print("Enter First Number : ");
        // int num1 = s.nextInt();
        float num1 = s.nextFloat();

        System.out.print("Enter Second Number : ");
        // int num2 = s.nextInt();
        float num2 = s.nextFloat();

        // int sum = num1 + num2;
        float sum = num1 + num2;

        System.out.print("The sum is ");
        System.out.println(sum);

        // Check for valid input
        boolean b1 = s.hasNextInt(); // If input is int or not
        System.out.println(b1);

        String str = s.next(); // Read a word only,  nextLine read whole line
        System.out.println(str);
        s.close();
    }
}

/* 
    Reading data from the Keyboard :

    Scanner class of java.util package is used to take input from the user's keyboard.The Scanner class has many methods for taking input from the user depending upon the type of input. To use any of the methods of the Scanner class, first, we need to create an object of the Scanner class
*/


