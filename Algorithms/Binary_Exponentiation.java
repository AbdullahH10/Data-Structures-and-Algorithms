import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Binary_Exponentiation {

    public static long recursivePower(int a, int b) {
        if(b == 0) return 1;
        long tmp = recursivePower(a, b/2);
        long result = tmp*tmp;
        if(b%2 == 1) result *= a;
        return result;
    }

    public static long iterativePower(long a, long b) {
        long result =1;
        while(b>0) {
            if(b%2 == 1) result *= a;
            a*=a;
            b/=2;
        }
        return result;
    }

    public static int moduloPower(int a, int b) {
        int result =1;
        while(b>0) {
            if(b%2 == 1) result = (result * a) % b;
            a = (a * a) % b;
            b/=2;
        }
        return result;
    }

    public static int inverse(int a, int b) {
        //b must be prime
        //follows Euler's theorem/Fermat's little theorem
        return moduloPower(a, b-2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        long res1 = recursivePower(a,b);
        long res2 = iterativePower(a,b);
        int res3 = inverse(a, b);
        System.out.println("Recursive: "+res1+"\nIterative: "+res2+"\nInverse: "+res3);
        return;
    }
}
