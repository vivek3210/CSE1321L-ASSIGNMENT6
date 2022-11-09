import java.util.Objects;
import java.util.Scanner;
public class Assignment6C {
    public static void printArray (String[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" | " + array[i][j]);
            }
            System.out.print(" | ");
            System.out.println();

        }
    }

    public static boolean isBoardFull (String[][] array) {
        //return true if the board is full
        //return false if the board is not full
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (Objects.equals(array[i][j], "")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void addDisk (String[][] array, int column, char player) {
        for (int i = 3; i >= 0; i--) {
            if (Objects.equals(array[i][column], "")) {
                array[i][column] = String.valueOf(player);
                break;
            }
        }
    }

    public static boolean winVertical (String[][] array, char player) {
// return true if the player has 4 disks in a vertical line
// return false if the player does not have 4 disks in a vertical line
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (Objects.equals(array[i][j], String.valueOf(player))) {
                    if (i + 3 < 4) {
                        if (Objects.equals(array[i + 1][j], String.valueOf(player)) && Objects.equals(array[i + 2][j], String.valueOf(player)) && Objects.equals(array[i + 3][j], String.valueOf(player))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean winHorizontal (String array[][], char player) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (Objects.equals(array[i][j], String.valueOf(player))) {
                    if (j + 3 < 4) {
                        if (Objects.equals(array[i][j + 1], String.valueOf(player)) && Objects.equals(array[i][j + 2], String.valueOf(player)) && Objects.equals(array[i][j + 3], String.valueOf(player))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }


public static void main(String[] args) {
    int rowNum;

    Scanner input = new Scanner(System.in);
    System.out.println("[Connect Four]");
    String[][] array = new String[4][4];
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            array[i][j] = "";
        }
    }
    printArray(array);

    do {
        System.out.println("Player 1, enter a row: ");
        rowNum = input.nextInt();
        addDisk(array, rowNum, 'X');
        if(winVertical(array, 'X') || winHorizontal(array, 'X')){
            printArray(array);
            System.out.println("Player 1 wins!");
            break;
        }
        printArray(array);
        System.out.println("Player 2, enter a row: ");
        rowNum = input.nextInt();
        addDisk(array, rowNum, 'O');
        if(winVertical(array, 'O') || winHorizontal(array, 'O')){
            printArray(array);
            System.out.println("Player 2 wins!");
            break;
        }
        printArray(array);
    } while (winHorizontal(array, 'X') == false && winVertical(array, 'X') == false && winHorizontal(array, 'O') == false && winVertical(array, 'O') == false && isBoardFull(array) == false);

    if (isBoardFull(array) == true) {
        System.out.println("The board is full. It's a tie!");

    }
}
}

