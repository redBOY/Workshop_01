package main.BridgeLabz.tittactoe;

public class tictactoe {
    static char[] board = new char[10];
    static void createboard(char []board){
        for(int i =1; i<10; i++){
            board[i]=' ';
        }
    }
public static void main(String[] args) {
    System.out.println("welcome to tictactoe game");
}
}

