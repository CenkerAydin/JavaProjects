package MineSweeper;

import java.util.Random;
import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    int size;
    String[][] map;
    String[][] board;
    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    boolean game = true;

    public MineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new String[rowNumber][colNumber];
        this.board = new String[rowNumber][colNumber];
        this.size = (rowNumber * colNumber) ;
    }

    public void run() {
        int row, col,userCount=0;
        prepareMapBoard();
        System.out.println("GAME START ! ");
        while (game) {

            print(board);
            System.out.print("Enter the row : ");
            row = sc.nextInt();
            System.out.print("Enter the col : ");
            col = sc.nextInt();
            if (row<0 || row>=rowNumber|| col<0 || col>=colNumber){
                System.out.println("Invalid entered!");
                continue;
            }
            if (map[row][col] != "* ") {
                checkMine(row, col);
                userCount++;
                if (userCount == size -(size/4)) {
                    System.out.println("You won the game.");
                    break;
                }
            } else {
                game = false;
                System.out.println("GAME OVER");
            }
        }
    }

    public void checkMine(int r, int c) {
        int countStars = 0;
        if (board[r][c] == "- ") {
            if ((c<colNumber-1)&&(map[r][c + 1] == "* ")) {
                countStars++;
            }
            if ((r<rowNumber-1)&&(map[r + 1][c] == "* ")) {
                countStars++;
            }
            if ((c!=0)&&(map[r][c - 1] == "* ")) {
                countStars++;
            }
            if ((r!=0)&&(map[r - 1][c] == "* ")) {
                countStars++;
            }
            if ((r!=0&&c!=0)&&(map[r - 1][c - 1] == "* ")) {
                countStars++;
            }
            if ((r<rowNumber-1&&c<colNumber-1)&&(map[r + 1][c + 1] == "* ")) {
                countStars++;
            }
            if ((r<rowNumber-1&&colNumber!=0)&&(map[r+1][c-1]=="* ")){
                countStars++;
            }
            if ((rowNumber!=0&&c<colNumber-1)&&(map[r-1][c+1]=="* ")){
                countStars++;
            }
        }
        String count = String.valueOf(countStars);
        board[r][c] = count;
    }

    public void prepareMapBoard() {
        int randRow, randCol, count = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                map[i][j] = "- ";
                board[i][j] = "- ";
            }
        }
        while (count != size/4) {
            randRow = random.nextInt(rowNumber);
            randCol = random.nextInt(colNumber);
            if (map[randRow][randCol] != "* ") {
                map[randRow][randCol] = "* ";
                count++;
            }
        }
    }

    public void print(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
