package game;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int row = 4;
        int column = 4;
        int[][] board = new int[row][column];
        int number = getNN(r);
        int nX = r.nextInt(4);
        int nY = r.nextInt(4);
        board[nY][nX] = number;
        int NX = nX;
        int NY = nY;
        while (NX == nX && NY == nY) {
            NX = r.nextInt(4);
            NY = r.nextInt(4);
        }
        board[NY][NX] = number;

        while (true) {
        	System.out.println("Score: "+score);
            printBoard(board);
            if (gameOver(board)) {
                break;
            }
            System.out.print("Enter a Move: ");
            String in = sc.next();
            if (in.equalsIgnoreCase("w") || in.equalsIgnoreCase("a") || in.equalsIgnoreCase("s") || in.equalsIgnoreCase("d")) {
                score += move(board, in, score);
                addNewNumber(board, r);
                System.out.println("Moving Complete!");
            } else {
                System.out.println("Invalid Input!");
            }
        }
    }

    static int getNN(Random r) {
        int odds = r.nextInt(10) + 1;
        return (odds > 8) ? 4 : 2;
    }

    static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
    }
    
    static void addNewNumber(int [][] board, Random r) {
    	int x = r.nextInt(3);
        int y = r.nextInt(3);
        while(board[y][x] != 0) {
        	x = r.nextInt(3);
        	y = r.nextInt(3);
        }
        board[y][x] = getNN(r);
    }

    static boolean gameOver(int[][] board) {
        int row = board.length;
        int column = board[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                int num = board[i][j];
                if (num == 0) {
                    return false;
                }
                if (i > 0 && board[i - 1][j] == num) {
                    return false;
                }
                if (i < row - 1 && board[i + 1][j] == num) {
                    return false;
                }
                if (j > 0 && board[i][j - 1] == num) {
                    return false;
                }
                if (j < column - 1 && board[i][j + 1] == num) {
                    return false;
                }
            }
        }
        return true;
    }

    static int move(int[][] board, String in, int score) {
    	int add = 0;
        int row = board.length;
        int column = board[0].length;
        if (in.equalsIgnoreCase("w")) {
            for (int j = 0; j < column; j++) {
                for (int i = 1; i < row; i++) {
                    int cX = j;
                    int cY = i;
                    while (cY > 0 && (board[cY - 1][cX] == 0 || board[cY - 1][cX] == board[cY][cX])) {
                        if (board[cY - 1][cX] == 0) {
                            board[cY - 1][cX] = board[cY][cX];
                            board[cY][cX] = 0;
                        } else {
                            board[cY - 1][cX] += board[cY][cX];
                            add += board[cY - 1][cX];
                            board[cY][cX] = 0;
                            break;
                        }
                        cY--;
                    }
                }
            }
        } else if (in.equalsIgnoreCase("a")) {
            for (int i = 0; i < row; i++) {
                for (int j = 1; j < column; j++) {
                    int cX = j;
                    int cY = i;
                    while (cX > 0 && (board[cY][cX - 1] == 0 || board[cY][cX - 1] == board[cY][cX])) {
                        if (board[cY][cX - 1] == 0) {
                            board[cY][cX - 1] = board[cY][cX];
                            board[cY][cX] = 0;
                        } else {
                            board[cY][cX - 1] += board[cY][cX];
                            add += board[cY][cX - 1];
                            board[cY][cX] = 0;
                            break;
                        }
                        cX--;
                    }
                }
            }
        } else if (in.equalsIgnoreCase("s")) {
            for (int j = 0; j < column; j++) {
                for (int i = row - 2; i >= 0; i--) {
                    int cX = j;
                    int cY = i;
                    while (cY < row - 1 && (board[cY + 1][cX] == 0 || board[cY + 1][cX] == board[cY][cX])) {
                        if (board[cY + 1][cX] == 0) {
                            board[cY + 1][cX] = board[cY][cX];
                            board[cY][cX] = 0;
                        } else {
                            board[cY + 1][cX] += board[cY][cX];
                            add += board[cY + 1][cX];
                            board[cY][cX] = 0;
                            break;
                        }
                        cY++;
                    }
                }
            }
        } else if (in.equalsIgnoreCase("d")) {
            for (int i = 0; i < row; i++) {
                for (int j = column - 2; j >= 0; j--) {
                    int cX = j;
                    int cY = i;
                    while (cX < column - 1 && (board[cY][cX + 1] == 0 || board[cY][cX + 1] == board[cY][cX])) {
                        if (board[cY][cX + 1] == 0) {
                            board[cY][cX + 1] = board[cY][cX];
                            board[cY][cX] = 0;
                        } else {
                            board[cY][cX + 1] += board[cY][cX];
                            add += board[cY][cX + 1];
                            board[cY][cX] = 0;
                            break;
                        }
                        cX++;
                    }
                }
            }
        }
        return add;
    }
}
