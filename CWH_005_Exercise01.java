import java.util.Scanner;

public class CWH_005_Exercise01 {

    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter marks of first subject : ");
        int sub1 = sc.nextInt();
        // System.out.println(marks.hasNextInt());
        System.out.print("Enter marks of second subject : ");
        int sub2 = sc.nextInt();
        
        
        System.out.print("Enter marks of third subject : ");
        int sub3 = sc.nextInt();
        
        
        System.out.print("Enter marks of fourth subject : ");
        int sub4 = sc.nextInt();

        System.out.print("Enter marks of fifth subject : ");
        int sub5 = sc.nextInt();

        int totalMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        
        float percentage =  (totalMarks/500f) * 100; // division with two int is integer division
        
        System.out.print("Your percentage is : ");
        System.out.println(percentage);

        sc.close();
    }
}

// Write a program to calculate percentage 
// Division with two integer will be resulted in ineger division. so assign float literal to one of the value.