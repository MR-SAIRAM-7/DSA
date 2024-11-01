//OPERATORS 
public class Test {
    public static void main(String[] args){
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.print(exp1 + " , ");
        System.out.print(exp2);

        System.out.println();

        int x1 = 200;
        int y1 = 50;
        int z1 = 100;

        if(x1 > y1 && y1 > z1){
            System.out.println("Hello");
        }
        if(z1 > y1 && z1 < x1){
            System.out.println("Java");
        }
        if((y1+200) < x1 && (y1+150) < z1){
            System.out.println("Hello Java"); // Hello Java Not Printed??
        }

        int x2, y2, z2;
        x2 = y2 = z2 = 2;
        x2 += y2;
        y2 -= z2;
        z2 /= (x2 + y2);
        System.out.println(x2 + " " + y2 + " " + z2);

        int x3 = 10, y3 = 5;
        int exp11 = (y3 * (x3 / y3 + x3 / y3));
        int exp22 = (y3 * x3 / y3 + y3 * x3 / y3);
        System.out.println(exp11);System.out.println(exp22);
    }
}