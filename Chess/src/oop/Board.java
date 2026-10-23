package oop;

public class Board {
	private Peice [][] board;
	
	public Board(int size) {
		board = new Peice[size][size];
	}
	
	public Peice[][] getBoard() {
		return board;
	}
}
