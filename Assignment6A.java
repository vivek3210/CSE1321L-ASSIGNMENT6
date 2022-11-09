import java.util.Scanner;
import java.util.Random;
public class Assignment6A {
    public static void create_random_array (int[] array, int array_size)
    {
        Random rand = new Random();
        System.out.print("Random Array: ");
        for (int i = 0; i < array.length; i++)
        {
            int x = rand.nextInt(1001);
            array[i] = x - 500;
            System.out.print(array[i] + ", ");
        }
        System.out.print("\b\b");
        System.out.println("\n");
    }
    public static boolean is_array_sorted (int[] array, int array_size)
    {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    return false;
                }
            }
        }
            return true;
    }
    public static void sort_array (int[] array, int array_size) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }

        System.out.print("Sorted Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\b\b");
        System.out.println("\n");
    }
    public static void main (String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("[Is It Sorted?]");
        int[] array = new int[10];
        int array_size = 10;
        create_random_array(array, array_size);

        do {
            System.out.println("What do you want to do?\n" +
                    "1) Generate a new random array\n" +
                    "2) Is the array sorted?\n" +
                    "3) Sort the array\n" +
                    "4) Quit\n");
            System.out.print("Choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    create_random_array(array, array_size);
                    break;

                case 2:
                    if (is_array_sorted(array, array_size) == false) {
                        System.out.println("The array is not sorted.");
                    } else {
                        System.out.println("The array is sorted.");
                    }
                    break;

                case 3:
                    sort_array (array, array_size);
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Invalid Entry!");
            }
        } while (choice != 4);
    }
}
