
public class Main {

    // square star pattern
    public static void squareStar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    // bottom left triangle
    public static void bottomLeftTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Top left Triangle
    public static void topLeftTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // count Triangle
    public static void countTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //flyod's triangle
    public static void flyodTriangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    // bottom right Triangle
    public static void bottomRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            //for spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // top right triangle
    public static void topRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            // for spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            //for starts
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Hollow square
    public static void hollowSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // x - pattern
    public static void xPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // squareStar(5);
        // bottomLeftTriangle(5);
        // topLeftTriangle(5);
        // countTriangle(5);
        // flyodTriangle(5);
        // bottomRightTriangle(5);
        // topRightTriangle(5);
        // hollowSquare(5);
        // xPattern(5);

    }
}
