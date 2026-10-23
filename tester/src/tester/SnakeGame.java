package tester;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
public class SnakeGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new SnakeGame().startGame();
    }

    private static final int BOARD_SIZE = 10;
    private static final char EMPTY_CELL = '.';
    private static final char SNAKE_BODY = 'o';
    private static final char FOOD = '*';

    private LinkedList<Point> snake;
    private Point food;
    private char[][] board;
    private Direction direction;

    public SnakeGame() {
        snake = new LinkedList<>();
        board = new char[BOARD_SIZE][BOARD_SIZE];
        direction = Direction.RIGHT; // Initial direction
        initializeGame();
    }

    private void initializeGame() {
        // Initialize the board with empty cells
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = EMPTY_CELL;
            }
        }

        // Initialize the snake
        snake.clear();
        snake.add(new Point(BOARD_SIZE / 2, BOARD_SIZE / 2)); // Initial position of the snake

        // Place the initial food randomly
        placeFood();
    }

    private void placeFood() {
        Random random = new Random();
        int x, y;

        do {
            x = random.nextInt(BOARD_SIZE);
            y = random.nextInt(BOARD_SIZE);
        } while (board[x][y] != EMPTY_CELL);

        food = new Point(x, y);
        board[x][y] = FOOD;
    }

    private void printBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private void move() {
        // Move the snake in the current direction
        Point head = snake.getFirst();
        Point newHead = head.clone();

        switch (direction) {
            case UP:
                newHead.x--;
                break;
            case DOWN:
                newHead.x++;
                break;
            case LEFT:
                newHead.y--;
                break;
            case RIGHT:
                newHead.y++;
                break;
        }

        // Check if the new head collides with the food or itself
        if (newHead.equals(food)) {
            snake.addFirst(newHead);
            placeFood();
        } else {
            Point tail = snake.removeLast();
            board[tail.x][tail.y] = EMPTY_CELL;

            if (board[newHead.x][newHead.y] == SNAKE_BODY) {
                // Snake collided with itself, game over
                System.out.println("Game Over!");
                System.exit(0);
            }

            snake.addFirst(newHead);
        }

        // Update the board with the new snake position
        for (Point p : snake) {
            board[p.x][p.y] = SNAKE_BODY;
        }
    }

    private void handleInput() {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);

        switch (input) {
            case 'w':
                direction = Direction.UP;
                break;
            case 's':
                direction = Direction.DOWN;
                break;
            case 'a':
                direction = Direction.LEFT;
                break;
            case 'd':
                direction = Direction.RIGHT;
                break;
        }
    }

    public void startGame() {
        while (true) {
            printBoard();
            handleInput();
            move();
        }
    }

    private enum Direction {
        UP, DOWN, LEFT, RIGHT
    }

    private class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Point clone() {
            return new Point(this.x, this.y);
        }

        public boolean equals(Point other) {
            return this.x == other.x && this.y == other.y;
        }
    }
}