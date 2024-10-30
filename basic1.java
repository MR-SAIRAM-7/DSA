
import java.util.Scanner;


public class basic1{
    public static void areaOfCircle(double radius){
        System.out.println("The area of Circle is : "+ (3.14*radius*radius));
    }
    
    public static void greatestOfTwoNum(int x,int y){
        if(x>y){
            System.out.println("The greatest number is : "+x);
        }
        else{
            System.out.println("The greatest number is : "+y);
        }
    }

    public static void printEvenNums(int start,int end){
        for(int i=start;i<=end;i++){
            if(i%2==0){
                System.out.print(i+", ");
            }
        }
    }

    public static void average(int totalNums){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter Toatal Elements :");
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            System.out.println("Enter the number : ");
            sum += sc.nextInt();
            int average =  sum/t;
            System.out.println("The average of the numbers is : "+average);
        }
    }
    
    public static void main(String[] args) {
        areaOfCircle(100);   
        greatestOfTwoNum(10, 100);   
        printEvenNums(9, 100);
    }
}