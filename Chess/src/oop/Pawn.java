package oop;

public class Pawn extends Peice{

	public Pawn(int x, int y, boolean isWhite, Board board) {
		super(x, y, isWhite, board);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isValidMove(int x, int y) {
		if(super.outOfBoard(x, y)) {
			return false;
		}
		if(board.getBoard()[this.y+1][this.x+1] != null || board.getBoard()[this.y+1][this.x-1] != null&& board.getBoard()[y+1][x+1] instanceof King) {
			if(x == this.x-1 || x == this.x+1 ) {
				if(y == this.y+1) {
					return true;
				}
			}
		}
		if(this.y == 1) {
			if(y == this.y + 1 || y == this.y + 2 && x == this.x) {
				if(board.getBoard()[y+1][x] == null) {
					return true;
				}
			}
		}else {
			if(y == this.y + 1) {
				if(board.getBoard()[y+1][x] == null && x == this.x) {
					return true;
				}
			}
		}
		
		return false;
	}

}
