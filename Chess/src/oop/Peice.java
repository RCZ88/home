package oop;

public abstract class Peice {
	protected int x;
	protected int y;
	protected boolean isWhite;
	protected Board board;
	
	public Peice(int x, int y, boolean isWhite, Board board) {
		this.x = x;
		this.y = y;
		this.isWhite = isWhite;
		this.board = board;
	}
	
	public abstract boolean isValidMove(int x, int y);
	protected boolean outOfBoard(int x, int y) {
		if(x == this.x && y == this.y) {
			return false;
		}
		if(isWhite) {
			if(!(y>this.y && y<board.getBoard().length)) {
				return true;
			}
		}else {
			if(!(y<this.y && y>board.getBoard().length)) {
				return true;
			}
		}
		if(x>board.getBoard().length || x < 0) {
			return true;
		}
		return false;
	}
}
