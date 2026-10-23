package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class ShapesFX extends Application {
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		Group root = new Group();
		Scene scene = new Scene(root,420,420,Color.BLANCHEDALMOND); //stage, height, width, color
		Stage stage  = new Stage();
		
		Image icon = new Image("ICON.jpg"); 
		stage.getIcons().add(icon); 
		stage.setTitle("C's Application"); 
		stage.setWidth(720); 
		stage.setHeight(600);
		stage.setResizable(true); 
		
		Text text1 = new Text();
		text1.setText("x: 200\ny: 200");
		text1.setX(140);
		text1.setY(200);
		text1.setFont(Font.font("Candara",15));
		text1.setFill(Color.DARKOLIVEGREEN);
		
		
		Text text2 = new Text();
		text2.setText("x:620\ny:500");
		text2.setX(620);
		text2.setY(500);
		text2.setFont(Font.font("Candara",15));
		text2.setFill(Color.DARKOLIVEGREEN);
		
		
		Line line = new Line();
		line.setStartX(200);
		line.setStartY(200);
		line.setEndX(620);
		line.setEndY(500);
		line.setStrokeWidth(5);
		line.setStroke(Color.MEDIUMVIOLETRED);
		line.setOpacity(0.9);
		line.setRotate(0);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setX(300);
		rectangle.setY(100);
		rectangle.setWidth(200);
		rectangle.setHeight(100);
		rectangle.setFill(Color.BLUE);
		rectangle.setStroke(Color.BROWN);
		rectangle.setStrokeWidth(10);
		
		Polygon triangle = new Polygon();
		triangle.getPoints().setAll(
				200.0,300.0,
				400.0, 500.0,
				700.0, 300.0);
		triangle.setFill(Color.DARKMAGENTA);
		
		Circle circle = new Circle();
		circle.setCenterX(0);
		circle.setCenterY(0);
		circle.setRadius(80);
		circle.setFill(Color.MAROON);
		
		Image image = new Image("ICON.jpg");
		ImageView imageView = new ImageView();
		imageView.setX(420);
		imageView.setY(350);
		
		root.getChildren().add(text1);
		root.getChildren().add(text2);
		root.getChildren().add(line);
		root.getChildren().add(rectangle);
		root.getChildren().add(triangle);
		root.getChildren().add(circle);
		root.getChildren().add(imageView);
		//stage.setX(50);
		//stage.setY(50);
		
		stage.setFullScreen(true);
		stage.setFullScreenExitHint("Press esc to Escape");
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("esc"));
		
		stage.setScene(scene);
		stage.show();
	}
}
