package oop;

public class King extends Peice{
	
	public King(int x, int y, boolean isWhite, Board board) {
		super(x, y, isWhite, board);
	}

	@Override
	public boolean isValidMove(int x, int y) {
		return false;
	}
	
	
}
