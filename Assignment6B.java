import java.util.Scanner;
public class Assignment6B {
    public static String WhatsMyType(int data) {
        return "'" + data + "'" + " is a int value!";
    }

    public static String WhatsMyType(String data) {
        return "'" + data + "'" + " is a string value!";
    }

    public static String WhatsMyType(boolean data) {
        return "'" + data + "'" + " is a boolean value!";
    }

    public static String WhatsMyType(char data) {
        return "'" + data + "'" + " is a char value!";
    }

    public static String WhatsMyType(float data) {
        return "'" + data + "'" + " is a float value!";
    }


    public static void main(String[] args) {
        int num;
        String word;
        float decimal;
        char letter;
        boolean value;
        String whichDatatype;

        Scanner input = new Scanner(System.in);
        System.out.println("[What’s my datatype?]\n");
        System.out.print("Enter an int: ");
        num = input.nextInt();
        System.out.print("Enter a string: ");
        word = input.next();
        System.out.print("Enter a float: ");
        decimal = input.nextFloat();
        System.out.print("Enter a char: ");
        letter = input.next().charAt(0);
        System.out.print("Enter a boolean: ");
        value = input.nextBoolean();
        System.out.println("What datatype do you want to check?");
        whichDatatype = input.next();

        if (whichDatatype.equalsIgnoreCase("int")) {
            System.out.print(WhatsMyType(num));
        } else if (whichDatatype.equalsIgnoreCase("string")) {
            System.out.print(WhatsMyType(word));
        } else if (whichDatatype.equalsIgnoreCase("boolean")) {
            System.out.print(WhatsMyType(value));
        } else if (whichDatatype.equalsIgnoreCase("char")) {
            System.out.print(WhatsMyType(letter));
        } else if (whichDatatype.equalsIgnoreCase("float")) {
            System.out.print(WhatsMyType(decimal));
        }

        }
    }



