package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		
		Group root = new Group();
		Scene scene = new Scene(root,600,600,Color.BLACK);
		
		Text text = new Text();
		text.setText("Attack of the Squares");
		text.setX(180);
		text.setY(50);
		text.setFill(Color.WHITE);
		text.setFont(Font.font("Comic Sans MS",25));
		
		Circle circle = new Circle();
		circle.setCenterX(500);
		circle.setCenterY(150);
		circle.setRadius(55);
		circle.setFill(Color.BLUE);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setX(75);
		rectangle.setY(100);
		rectangle.setWidth(100);
		rectangle.setHeight(100);
		rectangle.setFill(Color.RED);
		
		Image icon = new Image("Blue.png");
		stage.getIcons().add(icon);
		stage.setTitle("Attack of the Squares");
		
		
		root.getChildren().add(text);
		root.getChildren().add(circle);
		root.getChildren().add(rectangle);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
