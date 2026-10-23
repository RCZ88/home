package oop;

public class Rook extends Peice{

	public Rook(int x, int y, boolean isWhite, Board board) {
		super(x, y, isWhite, board);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isValidMove(int x, int y) {
		Peice [][] b = board.getBoard();
		if(super.outOfBoard(x, y)) {
			return false;
		}
		if(x!= this.x && y!= this.y) {
			return false;
		}else {
			int boundaries = 0;
			if(x!=this.x) {
				if(x>this.x) {
					for(int i = 0; i< b.length-1; i++) {
						if(b[y][i] != null) {
							boundaries = i;
							break;
						}
					}
					if(x>boundaries) {
						return false;
					}
				}else {
					for(int i = this.x-1; i>=0; i--) {
						if(b[y][i] != null) {
							boundaries = i;
							break;
						}
					}
					if(x<boundaries) {
						return false;
					}
				}
			}else if (y!=this.y) {
				if(y>this.y) {
					for(int i = 0; i<b.length-1; i++) {
						if(b[i][x] != null) {
							boundaries = i;
							break;
						}
					}
					if(y>boundaries) {
						return false;
					}
				}else {
					for(int i = this.y-1; i>=0; i--) {
						if(b[i][x] != null) {
							boundaries = i;
							break;
						}
					}
					if(y<boundaries) {
						return false;
					}
				}
			}
		}
			
		return true;
	}

}
