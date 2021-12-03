import java.util.Scanner;

public class MathMain {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a begin number: ");
        long begin = scanner.nextLong();

        System.out.print("Enter a end number: ");
        long end = scanner.nextLong();

        long sum = getsumBetween(begin, end);
        System.out.printf("Sum between %d and %d : %d\n", begin, end, sum);

        long product = getProductBetween(begin, end);
        System.out.printf("Product between %d and %d : %d\n", begin, end, product);


    }
    
    private static long getsumBetween(long begin, long end) {
        return begin + end;
    }

    private static long getProductBetween(long begin, long end) {
        long p = 1;
        for(long _=end;_>=begin;_--) p*=_;
        return p;
    }


}
