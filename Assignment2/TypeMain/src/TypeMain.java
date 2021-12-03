import java.util.Scanner;
public class TypeMain
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        printType(str);

        System.out.println("Type conversion to int...");
        int integer = Integer.parseInt(str);
        printType(integer);

        System.out.println("Type conversion to float...");
        float f = Float.parseFloat(str);
        printType(f);

        scanner.close();
    }

    private static void printType(String x)
    {
        System.out.println(x + " is a string");
    }
    private static void printType(int x)
    {
        System.out.println(x + " is a int");
    }
    private static void printType(float x)
    {
        System.out.println(x + " is a float");
    }
}
