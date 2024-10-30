import java.util.Scanner;

public class days_02 {
    public static void main(String[] args){

        //Question1:Inaprogram,input3numbers:A,BandC.You have to output the average of //these 3 numbers.(Hint : Average of N numbers is sum of //those numbers divided by N)
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the Value of A : ");
        int a = sc.nextInt();

        System.out.print("Enter the Value of B : ");
        int b = sc.nextInt();

        System.out.print("Enter the Value of C : ");
        int c = sc.nextInt();

        int average = (a+b+c)/3;
        System.out.println("The average is  " + average);

       // Inaprogram,inputthesideofasquare.Youhavetooutputtheareaofthesquare.(Hint : area //of a square is (side x side))
       
       System.out.print("Enter the Side of the square : ");
       int side = sc.nextInt();
       System.out.println("The area of Square is " + (side*side));


       //Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser. You /have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
       
       System.out.print("Enter the Cost of pen : ");
       float pen = sc.nextFloat();

       System.out.print("Enter the Cost of eraser : ");
       float eraser = sc.nextFloat();

       System.out.print("Enter the Cost of pencil : ");
       float pencil = sc.nextFloat();

       System.out.println("The Cost of all items is : " + (pen+pencil+eraser));

       float withGst = 0.18f *  (pen+pencil+eraser);

       System.out.println("The Cost of all items including 18% gst is : " + (withGst+pen+pencil+eraser));

       /// Will the following statement give any error in Java?
       
       //  int$=24;

       // ans = no - does not give any error 

       // In Java, variable names can contain letters, digits, underscores (_), and dollar signs ($).

       // Note =  if multiple elements of different data types are multiplied or performed any arithmetic operations the output will be the data type with the largest size in bytes;
       
       // example : int * byte == int

    }
}