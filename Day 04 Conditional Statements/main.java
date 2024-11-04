
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // Conditonal Statements

        // ternary operator
        //syntax
        // data_type variable name = (condition)? statement 1 : statement 2
        int larger = (5 > 3) ? 5 : 3;
        System.out.println(larger);

        // even or odd
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter a number : ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // syntax
        // if(condition){
        //     code to be executed if conditon is true
        // }
        // else if(conditon){
        //     code to be executed if condition is true
        // }
        // .
        // .
        // .
        // else{
        //     code if none of the condition are true
        // }
        // Write a Java program to get a number from the user and print whether it is positive or negative
        System.out.print("Enter a number : ");
        int num2 = sc.nextInt();

        if (num2 < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }

        double temperature = 103.3;
        if (temperature > 100) {
            System.out.println("Fever");
        } else {
            System.out.println("No fever");
        }

        // Write a Java program to input weeknumber (1-7) and print day of week name using switch case
        System.out.print("Enter week number : ");
        int weekNum = sc.nextInt();

        switch(weekNum) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter details correctly");
        }

        System.out.print("Enter a year : ");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not Leap Year");
                }
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not Leap Year");
        }

        sc.close();

    }
}
