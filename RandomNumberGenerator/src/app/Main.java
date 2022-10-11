package app;

import java.io.File;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.ImageCursor;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import setting.FontSet;

public class Main extends Application {
	GridPane gp;
	TextField minNumber, maxNumber;
	Button randomButton;
	TextField resultField;
	BorderPane bp;
	BorderPane bp2;
	Label minLabel, maxLabel, resultLabel;
	
	public void init() {
		gp = new GridPane();
        minNumber = new TextField();
        maxNumber = new TextField();
        randomButton = new Button("Random Now!");
        resultField = new TextField();
        
        minLabel = new Label("Min Label: ");
        maxLabel = new Label("Max Label: ");
        resultLabel = new Label("Result: ");
        
	}
	
	public void event() {

        randomButton.setOnAction(e -> {
            
            try {
            	Integer minValue = Integer.valueOf(minNumber.getText());
                Integer maxValue = Integer.valueOf(maxNumber.getText());
                
                Integer result = (int)((Math.random() * (maxValue - minValue)) + minValue);
                resultField.setText(result.toString());
                
			} catch (Exception e2) {

				System.out.println("Input must be a Number!!");
//				e2.printStackTrace();
			}
        });
        
        randomButton.setOnMouseEntered(e -> {
        	randomButton.setBackground(new Background(new BackgroundFill(Color.CORNSILK, CornerRadii.EMPTY, Insets.EMPTY)));
        	randomButton.setTextFill(Color.CRIMSON);
        });
        
        randomButton.setOnMouseExited(e -> {
        	randomButton.setBackground(new Background(new BackgroundFill(Color.CRIMSON, CornerRadii.EMPTY, Insets.EMPTY)));
        	randomButton.setTextFill(Color.CORNSILK);
        });
        
//    	randomButton.setOnMouseClicked((e)->{
//    		mediaclick.play();
//    		mediaclick.stop();
//    		randomButton.setTextFill(Color.WHITE);
//    	 });
	
	}
	
	public void randomSleep() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void container() {
		gp.setPadding(new Insets(15));
        gp.setHgap(10);
        gp.setVgap(15);
        gp.setAlignment(Pos.CENTER);

        gp.add(minLabel, 0, 0);
        gp.add(minNumber, 1, 0);
        
        gp.add(maxLabel, 0, 1);
        gp.add(maxNumber, 1, 1);
        
        gp.add(resultLabel, 0, 3);
        gp.add(randomButton, 1, 2);
        randomButton.setFont(FontSet.font());
        
        GridPane.setHalignment(randomButton, HPos.LEFT);
        resultField.setEditable(false);
        gp.add(resultField, 1, 3);
        
//        bp.setCenter(gp);


	}
	
    @Override
    public void start(Stage primaryStage) {

    	
        init();
        event();
        container();
        
//		BackgroundFill fill = new BackgroundFill(Color.BURLYWOOD, new CornerRadii(0), new Insets(0));
//		bp.setBackground(new Background(fill));
//        
//        File cursorPath = new File(".\\src\\resources\\Cursor_icon_with_shadow.png");
//		Image cursorImg = new Image(cursorPath.toURI().toString());
//		ImageCursor cursorImgC = new ImageCursor(cursorImg);
//		bp.setCursor(cursorImgC);
//		
//		bp.setCenter(gp);
        
//        bp2.setCenter(gp);
//        bp.setTop(bp2);
        
        Scene scene = new Scene(gp, 500, 400);
        
        primaryStage.setMaximized(false);
		primaryStage.setResizable(false);
		
        primaryStage.setTitle("Random Number Generator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
