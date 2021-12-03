import java.util.Locale;
import java.util.Scanner;

public class ArrayEnum {

    private enum Command {
        QUIT,
        ADD,
        LIST,
        AVG,
        SUM,
        STD,
        INVALID
    }

    private static Command getCommand(Scanner scanner)
    {
        String inp = scanner.next().toUpperCase();
        System.out.printf("%s\n", inp);

        for (Command c : Command.values())
        {
            if(inp.equals(c.toString()))
            {
                return c;
            }
        }
        return Command.INVALID;
    }
    private static int getValue(Scanner scanner)
    {
        return scanner.nextInt();
    }
    private static void printList(int[] array, int index)
    {
        for(int i=0;i<index;i++)
        {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    private static int getSum(int[] array, int index)
    {
        int sum = 0;
        for(int i=0;i<index;i++)
        {
            sum += array[i];
        }
        return sum;
    }

    private static float getAvg(int[] array, int index)
    {
        int sum = getSum(array, index);
        return (float)sum / (float)index;

    }
    private static float getStd(int[] array, int index)
    {
        float avg = getAvg(array, index);
        float sum = 0;

        for(int i=0;i<index;i++)
            sum += Math.pow(array[i]-avg, 2);

        return (float) Math.sqrt((float)sum / (float)(index));

    }
    public static void main(String[] args)
    {
        final Scanner scanner = new Scanner(System.in);
        int[] values = new int[100];
        int index = 0;

        while(true) {
            final Command command = getCommand(scanner);
            if( command == Command.QUIT) {
                System.out.println("Bye!");
            }

            switch(command)
            {
                case ADD:
                    final int newValue = getValue(scanner);
                    values[index] = newValue;
                    index++;
                    break;

                case LIST:
                    printList(values, index);
                    break;
                case AVG:
                    System.out.printf("%.2f\n", getAvg(values, index));
                    break;
                case SUM:
                    System.out.printf("%d\n", getSum(values, index));
                    break;
                case STD:
                    System.out.printf("%.2f\n", getStd(values, index));
                    break;
                case INVALID:
                    System.out.print("Invalid Command");
                    break;

            }
        }

    }
}
