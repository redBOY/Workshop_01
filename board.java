package main.BridgeLabz;

import java.util.Scanner;

public class board {

    static char board[] = new char[10];
    static Scanner abc = new Scanner(System.in);
    static char playerLetter;
    static char computerLetter;

    static void createBoard(){
        for(int i = 1; i < 10; i++){
            board[i] =' ';
        }
    }

    static void getLetter(){
        System.out.println("Choose your letter X or O");
        playerLetter = abc.next().toUpperCase().charAt(0);
        computerLetter = (playerLetter == 'X') ? 'O' : 'X';
        System.out.println("Your letter is: "+playerLetter);
        System.out.println("computer letter is: "+computerLetter);
    }

    static void showBoard(){
        System.out.println(board[1]+"|"+board[2]+"|"+board[3]);
        System.out.println(board[4]+"|"+board[5]+"|"+board[6]);
        System.out.println(board[7]+"|"+board[8]+"|"+board[9]);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe Game");
        createBoard();
        getLetter();
        showBoard();
    }
}
