public class Main {

    public static void evenOrOdd(int n) {
        if ((n & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }

    public static int getIthBit(int n, int i) {
        int bitMask = (1 << i);
        if ((n & bitMask) == 0) {
            return 0;
        }
        return 1;
    }

    public static int setIthBit(int n, int i) {
        int bitMask = (1 << i);
        int num = n | bitMask;
        return num;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    public static int updateBit(int n, int i, int newBit) {
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }

    }

    public static boolean isPowerOfTwo(int n) {
        if ((n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // Bit manipulation -- read notes for basic concepts

        // evenOrOdd(1010);
        // evenOrOdd(101);

        // System.out.println(getIthBit(00001111,2 ));

    }
}