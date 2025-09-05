package java_tictactoe;

// import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        boolean[][] board1 = new boolean[3][3];
        
        InitialprintBoard(board);
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want ?");
        System.out.println("1. X");
        System.out.println("2. 0");
        char user1 ;
        char user2;
        while (true) {
            user1 = scanner.next().charAt(0);
            if (user1 == 'x' || user1 == 'X') {
            user1 = 'X';
            user2 = '0';
            break;
        } else if (user1 == '0'){
            user1 = '0';
            user2 = 'X';
            break;
        } else {
            System.out.println("ENTER A VALID CHOICE");
        }
        }
        while (true) {
             playerMove(user1, board, board1, "USER 1");
         if (isWinning(board)) {
                printBoard(board);
                System.out.println("USER 1 WINS EZZZ");
                break;
            } else if (isDraw(board1)){
                printBoard(board);
                System.out.println("DRAW");
                break;
            } else {
                printBoard(board);
            }
       playerMove(user2, board, board1, "USER 2");
         if (isWinning(board)) {
                printBoard(board);
                System.out.println("LMAO NOOB USER 2 WINS");
                break;
            } else if (isDraw(board1)){
                printBoard(board);
                System.out.println("DRAW");
                break;
            } else {
                printBoard(board);
            }
        }
       scanner.close();
        

        // System.out.println(Arrays.deepToString(board1));
    }

    public static void InitialprintBoard (char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
                if ( j != 2) {
                    System.out.print(board[i][j] + " | ");
                }
            }
            System.out.println();
            System.out.println("---------");
        }
    }
    public static void printBoard (char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                // board[i][j] = ' ';
                // if ( j == 2) {
                    System.out.print(board[i][j] );
                    if ( j !=2 ) {
                        System.out.print( " | ");
                    }
                // }
            }
            System.out.println();
            System.out.println("---------");
        }
    }

    public static boolean isWinning(char[][] board) {
        for (int i = 0; i <  board.length; i++) {
            if ( board[i][0] != ' ' &&
            (board[i][0] == board[i][1]) &&
            (board[i][1] == board[i][2])) {
                return true;
            }
        }
        for (int j = 0; j <  board[0].length; j++) {
            if ( board[0][j] != ' ' &&
            (board[0][j] == board[1][j]) &&
            (board[1][j] == board[2][j])) {
                return true;
            }
        }

         if ( (board[0][0] != ' ' &&
            (board[0][0] == board[1][1]) &&
            (board[1][1] == board[2][2]))
            || (board[0][2] != ' ' &&
            (board[0][2] == board[1][1]) &&
            (board[1][1] == board[2][0]))) {
                return true;
            }

            return false;
    }
    public static boolean isDraw ( boolean[][] board1) {
         for (int i = 0; i < board1.length; i++) {
            for (int j = 0; j < board1[i].length; j++) {
                if (!board1[i][j]) {
                    return false;
                }
            }
            
        }
        return true;
    }

    public static void playerMove(char user1, char[][] board, boolean[][] board1, String playerName) {
            
        while (true) {
            Scanner scanner = new Scanner(System.in);   
            int row;
            int col; 
            System.out.println(playerName +" TURN");
            System.out.println("CHOOSE YOUR ROW NO 0,1,2");
            row = scanner.nextInt();
            System.out.println("CHOOSE YOUR COLUMN NO 0,1,2");
            col = scanner.nextInt();
            if (!board1[row][col]){
                board[row][col] = user1;
                board1[row][col] = true;
                break;
            } else {
                System.out.println("INVALID SQUARE ALREADY TAKEN");
            }
            scanner.close();
        }
    }
}
