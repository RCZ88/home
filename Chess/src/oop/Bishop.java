package oop;

import java.util.HashMap;

public class Bishop extends Peice{

	public Bishop(int x, int y, boolean isWhite, Board board) {
		super(x, y, isWhite, board);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isValidMove(int x, int y) {
		// TODO Auto-generated method stub
		if(outOfBoard(x,y) == false) {
			return false;
		}
		HashMap<Integer , Integer> validMoves= new HashMap<>();
		boolean limit = false;
		int xpo = this.x+1;
		int ypo = this.y+1;
		while(!limit) {
			
		}
	}

}
