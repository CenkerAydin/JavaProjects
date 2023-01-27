package MineSweeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row,column;
        System.out.println("Welcome Mine Sweeper Game!");

        System.out.println("Please enter the row and column of the array");

        System.out.println("Row : ");
        row=sc.nextInt();
        System.out.println("Column : ");
        column=sc.nextInt();
        
      MineSweeper mineSweeper=new MineSweeper(row,column);
      mineSweeper.run();
    }
}