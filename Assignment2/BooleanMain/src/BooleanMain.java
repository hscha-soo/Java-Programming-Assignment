import java.util.Scanner;

public class BooleanMain {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int Number1 = scanner.nextInt();
        int Number2 = scanner.nextInt();

        System.out.println(String.format("Number1 : %d, Number2 : %d",Number1,Number2));

        System.out.println(String.format("Number1 > Number2 ? %b",(boolean)(Number1 > Number2)));
        System.out.println(String.format("Number1 < Number2 ? %b",(boolean)(Number1 < Number2)));
        System.out.println(String.format("Number1 == Number2 ? %b",(boolean)(Number1 == Number2)));


        scanner.close();
    }
}
