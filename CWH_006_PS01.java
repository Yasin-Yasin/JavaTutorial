import java.util.Scanner;

public class CWH_006_PS01 {

    public static void main (String[] args) {
        // Question 1 - Write a program to sum three numbers in Java
        int num1 = 20;
        int num2 = 30;
        int num3 = 50;

        System.out.println(num1 + num2 + num3);

        // Question 2 - Write a program to calculate CGPA using marks of three subjects (out of 100)
        int sub1 = 90;
        int sub2 = 87;
        int sub3 = 82;
        float cgpa = (sub1 + sub2 + sub3)/30f;
        System.out.println(cgpa);

        // Question 3 - Write a Java program that asks the user to enter his/her name and greets them with “Hello <name>, have a good day” text.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Name : ");
        String name = sc.next();
        System.out.println("Hello " + name + ", have a good day.");

        // Question 4 - Write a Java program to convert Kilometers to miles 1km = 0.621371 mile
        System.out.print("Enter KM : ");
        float km = sc.nextFloat();
        float mile = km * 0.621371f;
        System.out.println(km + " KM is equal to " + mile + " Miles");

        // Question 5 - Write a Java program to detect whether a number entered by the user is an integer or not
        System.out.print("User input : ");
        System.out.println(sc.hasNextInt());

        sc.close();
    }
}
