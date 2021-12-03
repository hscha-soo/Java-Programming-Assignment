import java.util.Scanner;

public class FactorialMain
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        long to = scanner.nextLong();

        for(long i=1;i <=to;i++)
        {
            System.out.printf("Factorial of %d = %d\n",i, getFactorial(i));
        }
        scanner.close();

    }
    private static long getFactorial(final long n)
    {
        long ret  = 1;
        for(long i=1;i<=n;i++)
            ret *= i;
        return ret;
    }
}
