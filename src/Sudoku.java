
import java.util.Scanner;

public class Sudoku {

    public static void main(String[] args) {

        System.out.println("What board size would you like to play on?\n"+
                            "1) Size 4\n"+
                            "2) Size 9");

        Scanner scanner = new Scanner(System.in);
        int boardSize = scanner.nextInt();

        boolean quit = false;
        while(!quit) {
            switch (boardSize) {
                case 1:
                    System.out.println("This is the 4 x 4 board");
                    board4by4();
                    break;
            }

        }

    }

    public static void board4by4() {

    }


}
