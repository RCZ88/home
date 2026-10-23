package tester;
import java.util.Scanner;
import java.util.Random;

public class TICTACTOE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rr = new Random();
        String[] r1 = new String[3];
        String[] r2 = new String[3];
        String[] r3 = new String[3];

        System.out.println("Single/Multi(1/2): ");
        int sm = sc.nextInt();
        int lvl = 1;

        String xo = "X";
        for (int j = 0; j < 3; j++) {
            r1[j] = "_";
            r2[j] = "_";
            r3[j] = "_";
        }

        if (sm == 2) {
            for (int i = 0; i < 9; i++) {
                if (i % 2 == 0) {
                    xo = "X";
                } else {
                    xo = "O";
                }
                boolean correctInput = false;
                while (!correctInput) {
                    System.out.println("Input Coordinate for " + xo + ": ");
                    System.out.print("row: ");
                    int r = sc.nextInt();
                    System.out.print("column: ");
                    int c = sc.nextInt();
                    if (r == 1) {
                        if (r1[c - 1].equals("_")) {
                            r1[c - 1] = xo;
                            correctInput = true;
                        } else {
                            System.out.println("Invalid Input!");
                        }
                    } else if (r == 2) {
                        if (r2[c - 1].equals("_")) {
                            r2[c - 1] = xo;
                            correctInput = true;
                        } else {
                            System.out.println("Invalid Input!");
                        }
                    } else if (r == 3) {
                        if (r3[c - 1].equals("_")) {
                            r3[c - 1] = xo;
                            correctInput = true;
                        } else {
                            System.out.println("Invalid Input!");
                        }
                    }
                }
                printTTT(r1, r2, r3);
                String winner = checkWinner(r1, r2, r3);
                if (!winner.isEmpty()) {
                    System.out.println(winner + " is the WINNER!");
                    break;
                } else if (i == 8) {
                    System.out.println("It's a DRAW!");
                }
            }
        } else if (sm == 1) {
            for (int i = 0; i < 9; i++) {
                xo = "X";
                int r = 0;
                int c = 0;
                boolean correctInput = false;
                while (!correctInput) {
                    System.out.println("Input Coordinate for " + xo + ": ");
                    System.out.print("row: ");
                    int rs = sc.nextInt();
                    System.out.print("column: ");
                    int cs = sc.nextInt();
                    if (rs == 1) {
                        if (r1[cs - 1].equals("_")) {
                            r1[cs - 1] = xo;
                            correctInput = true;
                        } else {
                            System.out.println("Invalid Input!");
                        }
                    } else if (rs == 2) {
                        if (r2[cs - 1].equals("_")) {
                            r2[cs - 1] = xo;
                            correctInput = true;
                        } else {
                            System.out.println("Invalid Input!");
                        }
                    } else if (rs == 3) {
                        if (r3[cs - 1].equals("_")) {
                            r3[cs - 1] = xo;
                            correctInput = true;
                        } else {
                            System.out.println("Invalid Input!");
                        }
                    }
                    r = rs;
                    c = cs;
                }

                printTTT(r1, r2, r3);
                String winner = checkWinner(r1, r2, r3);
                if (!winner.isEmpty()) {
                    System.out.println(winner + " is the WINNER!");
                    break;
                } else if (i == 8) {
                    System.out.println("It's a DRAW!");
                } else if (winner.isEmpty()) {
                    xo = "O";
                    int ra, ca;
                    do {
                        ra = rr.nextInt(3);
                        ca = rr.nextInt(3);
                    } while (!r1[ra].equals("_") || !r2[ra].equals("_") || !r3[ra].equals("_") || !r1[ca].equals("_") || !r2[ca].equals("_") || !r3[ca].equals("_"));

                    // Update the board based on the AI move
                    if (ra == 0) {
                        r1[ca] = xo;
                    } else if (ra == 1) {
                        r2[ca] = xo;
                    } else if (ra == 2) {
                        r3[ca] = xo;
                    }

                    System.out.println("\nAI Move: ");
                    System.out.println("Row: " + ra + "\nColumn: " + ca);
                    printTTT(r1, r2, r3); // Print the updated board
                }
            }
        }
    }

    private static void printTTT(String[] r1, String[] r2, String[] r3) {
        for (String y : r1) {
            System.out.print(y + " ");
        }
        System.out.print("\n");
        for (String u : r2) {
            System.out.print(u + " ");
        }
        System.out.print("\n");
        for (String i : r3) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }

    private static String checkWinner(String[] r1, String[] r2, String[] r3) {
        String winner = "";

        // Check rows
        if (r1[0].equals(r1[1]) && r1[1].equals(r1[2]) && !r1[0].equals("_")) {
            return r1[0];
        } else if (r2[0].equals(r2[1]) && r2[1].equals(r2[2]) && !r2[0].equals("_")) {
            return r2[0];
        } else if (r3[0].equals(r3[1]) && r3[1].equals(r3[2]) && !r3[0].equals("_")) {
            return r3[0];
        }

        // Check columns
        for (int b = 0; b < 3; b++) {
            if (r1[b].equals(r2[b]) && r2[b].equals(r3[b]) && !r1[b].equals("_")) {
                return r1[b];
            }
        }

        // Check diagonals
        if (r1[0].equals(r2[1]) && r2[1].equals(r3[2]) && !r1[0].equals("_")) {
            return r1[0];
        } else if (r1[2].equals(r2[1]) && r2[1].equals(r3[0]) && !r1[2].equals("_")) {
            return r1[2];
        }

        return winner;
    }
}
