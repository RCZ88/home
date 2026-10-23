package application;

import javafx.scene.shape.Circle;

public class MovementController {
	
	private Circle circle;
	private double x;
	private double y;
	
	public void setPlayer(Circle player) {
        this.circle = player;
    }
	
	public void moveUp() {
		circle.setCenterY(y-=10);
	}
	public void moveDown() {
		circle.setCenterY(y+=10);
	}
	public void moveRight() {
		circle.setCenterX(x+=10);
	}
	public void moveLeft() {
		circle.setCenterX(x-=10);
	}
}
