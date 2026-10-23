package application;
	
import app.GameController;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Game.fxml"));
			Parent root = loader.load();
			GameController Controller = loader.getController();
			Scene scene = new Scene(root);
			
			scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

				public void handle(KeyEvent event) {
					// TODO Auto-generated method stub
					System.out.println(event.getCode());
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
