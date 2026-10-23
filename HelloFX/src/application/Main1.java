package application;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;


public class Main1 extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
			Parent root = loader.load();
			MovementController controller = loader.getController();
            Circle player = (Circle) loader.getNamespace().get("circle");
            controller.setPlayer(player);
			Scene scene = new Scene(root);
			
			scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
				@Override
				public void handle(KeyEvent event) {
					// TODO Auto-generated method stub
					switch(event.getCode()) {
					case UP:
						controller.moveUp();
						break;
					case DOWN:
						controller.moveDown();
						break;
					case RIGHT:
						controller.moveRight();
						break;
					case LEFT:
						controller.moveLeft();
						break;
					default:
						break;
					}
					
				}
				
			});
			
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
