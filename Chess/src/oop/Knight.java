package oop;

public class Knight extends Peice{

	public Knight(int x, int y, boolean isWhite, Board board) {
		super(x, y, isWhite, board);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isValidMove(int x, int y) {
		// TODO Auto-generated method stub
		if(super.outOfBoard(x, y)) {
			return false;
		}
		if(y == this.y + 2 || y == this.y-2) {
			if(x == this.x-1 || x == this.x+1) {
				return true;
			}
		}else if(x == this.x+2 || x == this.x-2) {
			if(y == this.y - 1 || y == this.y + 1) {
				return true;
			}
		}
		return false;
	}

}
