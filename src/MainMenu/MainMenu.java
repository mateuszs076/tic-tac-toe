package MainMenu;

import com.sun.prism.paint.Color;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class MainMenu {
	public static void draw(Stage primaryStage)
	{
		
		Pane root=new Pane();
		primaryStage.getScene().setRoot(root);
		root.getStyleClass().add("menu");
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.show();
		ImageView tic=new ImageView(new Image("tic.png"));
		tic.setLayoutX(primaryStage.getWidth());
		tic.setLayoutY(0);
		ImageView tac=new ImageView(new Image("tac.png"));
		tac.setLayoutX(100);
		tac.setLayoutY(primaryStage.getHeight());
		ImageView toe=new ImageView(new Image("toe.png"));
		toe.setLayoutX(primaryStage.getWidth());
		toe.setLayoutY(primaryStage.getHeight());
		ImageView twoPlayers=new ImageView(new Image("twoplayers.png"));		
		twoPlayers.setLayoutX(300);
		twoPlayers.setLayoutY(350);
		ImageView vsComputer=new ImageView(new Image("vscomputer.png"));		
		vsComputer.setLayoutX(180);
		vsComputer.setLayoutY(420);
		ImageView quit=new ImageView(new Image("quit.png"));		
		quit.setLayoutX(455);
		quit.setLayoutY(490);
		ImageView cross=new ImageView(new Image("cross.png"));		
		cross.setLayoutX(300);
		cross.setLayoutY(0);
		ImageView round=new ImageView(new Image("round.png"));		
		round.setLayoutX(0);
		round.setLayoutY(300);
		
		TranslateTransition t = new TranslateTransition(Duration.millis(200), tic);
	    t.setByX(-600);	 
	    t.play();
	    t.setOnFinished(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent arg0) {
            	TranslateTransition tt = new TranslateTransition(Duration.millis(200), tac);
        	    tt.setByY(-550);	 
        	    tt.play();
        	    tt.setOnFinished(new EventHandler<ActionEvent>(){

                    @Override
                    public void handle(ActionEvent arg0) {
                    	TranslateTransition ttt = new TranslateTransition(Duration.millis(200), toe);
                	    ttt.setByY(-520);	 
                	    ttt.setByX(-600);
                	    ttt.play();
                    }
                });
            }
        });
		
		root.getChildren().add(tic);
		root.getChildren().add(tac);
		root.getChildren().add(toe);
		root.getChildren().add(twoPlayers);
		root.getChildren().add(vsComputer);
		root.getChildren().add(quit);
		root.getChildren().add(cross);
		root.getChildren().add(round);
		
	}
}
