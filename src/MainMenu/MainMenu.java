package MainMenu;

import application.Game;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
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
		twoPlayers.setPickOnBounds(true);
		twoPlayers.setOnMouseReleased(new EventHandler<MouseEvent>() {
		    public void handle(MouseEvent me) {
		        Game.graj(primaryStage);
		    }
		});
		twoPlayers.setOnMouseEntered(new EventHandler<MouseEvent>() {
		    public void handle(MouseEvent me) {
		    	twoPlayers.setImage(new Image("twoplayersy.png"));
		    }
		});
		twoPlayers.setOnMouseExited(new EventHandler<MouseEvent>() {
		    public void handle(MouseEvent me) {
		    	twoPlayers.setImage(new Image("twoplayers.png"));
		    }
		});
		ImageView vsComputer=new ImageView(new Image("vscomputer.png"));		
		vsComputer.setLayoutX(180);
		vsComputer.setLayoutY(420);
		vsComputer.setPickOnBounds(true);
		vsComputer.setOnMouseEntered(new EventHandler<MouseEvent>() {
		    public void handle(MouseEvent me) {
		    	vsComputer.setImage(new Image("vscomputery.png"));
		    }
		});
		vsComputer.setOnMouseExited(new EventHandler<MouseEvent>() {
		    public void handle(MouseEvent me) {
		    	vsComputer.setImage(new Image("vscomputer.png"));
		    }
		});
		ImageView quit=new ImageView(new Image("quit.png"));		
		quit.setLayoutX(455);
		quit.setLayoutY(490);
		quit.setPickOnBounds(true);
		quit.setOnMouseReleased(new EventHandler<MouseEvent>() {
		    public void handle(MouseEvent me) {
		        primaryStage.close();
		    }
		});
		quit.setOnMouseEntered(new EventHandler<MouseEvent>() {
		    public void handle(MouseEvent me) {
		        quit.setImage(new Image("quity.png"));
		    }
		});
		quit.setOnMouseExited(new EventHandler<MouseEvent>() {
		    public void handle(MouseEvent me) {
		        quit.setImage(new Image("quit.png"));
		    }
		});
		ImageView cross=new ImageView(new Image("cross.png"));		
		cross.setLayoutX(0);
		cross.setLayoutY(350);
		ImageView round=new ImageView(new Image("round.png"));	
		round.setScaleX(1.5);
		round.setScaleY(1.5);
		round.setLayoutX(330);
		round.setLayoutY(100);
		
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
                	    ttt.setOnFinished(new EventHandler<ActionEvent>(){

                            @Override
                            public void handle(ActionEvent arg0) {
                            	root.getChildren().add(twoPlayers);
                        		root.getChildren().add(vsComputer);
                        		root.getChildren().add(quit);
                        		root.getChildren().add(cross);
                        		root.getChildren().add(round);                        		
                            }
                        });
                    }
                });
            }
        });
		
		root.getChildren().add(tic);
		root.getChildren().add(tac);
		root.getChildren().add(toe);
		
	}
}
