
public class Main {

    public static void hollowCylinder(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == 0 || j == 0 || i == rows - 1 || j == cols - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void butterFlyPattern(int n) {
        for (int i = 1; i <= n; i++) {

            //for stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }

            // for spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            //for stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            // for spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // for stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    public static void solidRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = n - i; j >= 1; j--) {
                System.out.print("  ");
            }
            // for stars
            for (int j = 1; j <= n; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void diamondPattern(int n) {
        for (int i = 1; i <= n; i++) {
            // for spacess
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            // for spacess
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Hollow Rectangle;
        // * *  * * *        
        // *       *
        // *       *
        // * * * * *
        // int  n = 4;       
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <= n; j++) {
        //         if (i == 0 || i == n-1 || j == 0 || j == n) {
        //             System.out.print("* ");
        //            }   el se  { 
        //             System.out.print("  ");
        //          }       
        //     }
        //     System.out.println();
        // }
        // hollowCylinder (4, 5);    
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        //     // for spaces
        //      for (i n t  j  =  1 ; j  <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // int n = 5;
        // for (int i = 0; i < n; i++) {
        //     int num = 1;
        //     for (int j = n; j > i; j--) {
        //         System.out.print(num);
        //         num++;
        //     }
        //     System.out.println();
        // }
        // floyd's triangle
        // int n = 5;
        // int num = 1;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print(num + " ");
        //         num++;
        //     }
        //     System.out.println();
        // }
        // int n = 5;
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         if ((i + j) % 2 == 0) {
        //             System.out.print(1);
        //         } else {
        //             System.out.print(0);
        //         }
        //     }
        // System.out.println();
        // }
        butterFlyPattern(4);
        // solidRhombus(5);
        // diamondPattern(4);
    }

}
