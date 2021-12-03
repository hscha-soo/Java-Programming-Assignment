import java.util.Scanner;

public class OperatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(String.format("%d / %d = %.3f", num1, num2, (float)num1/(float)num2));
        System.out.println(String.format("%d = %d x %d + %d", num1, num1/num2, num2, num1 % num2));


        scanner.close();

    }
}
