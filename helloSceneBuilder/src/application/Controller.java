package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Controller {
	@FXML
	private Circle myCircle;
	private double x;
	private double y;
	
	public void up(ActionEvent e) {
		//System.out.println("UP");
		myCircle.setCenterY(y-=10);
	}
	public void down(ActionEvent e) {
		//System.out.println("DOWN");
		myCircle.setCenterY(y+=10);
	}
	public void left(ActionEvent e) {
		//System.out.println("LEFT");
		myCircle.setCenterX(x-=10);
	}
	public void right(ActionEvent e) {
		//System.out.println("RIGHT");
		myCircle.setCenterX(x+=10);
	}
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void resume(ActionEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
	    scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	    stage.setScene(scene);
	    stage.show();
	}
	public void pause(ActionEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Main2.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	@FXML
	private Label hello;
	
	public void displayName(String username) {
		hello.setText("Hello: "+username);
	}
}
