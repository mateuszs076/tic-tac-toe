package application;

import java.util.HashMap;

import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Game {
	public static int gamer=1;
	public static void graj(Stage primaryStage)
	{
		Pane root=new Pane();
		primaryStage.getScene().setRoot(root);
		primaryStage.setHeight(700);
		root.getStyleClass().add("menu");
		HashMap<Integer, Integer> points=new HashMap<Integer, Integer>();
		points.put(1, 0);
		points.put(2, 0);
		ImageView cross=new ImageView(new Image("cross.png"));
		ImageView round=new ImageView(new Image("round.png"));
		for(int i=0; i<2; i++)
		{
			Line l=new Line();
			l.setStartX(0);
			l.setStartY((i+1)*200);
			l.setEndX(600);
			l.setEndY((i+1)*200);
			l.setStyle("-fx-color: #141414;");
			l.setStrokeWidth(10);
			root.getChildren().add(l);
		}
		for(int i=0; i<2; i++)
		{
			Line l=new Line();
			l.setStartX((i+1)*200);
			l.setStartY(0);
			l.setEndX((i+1)*200);
			l.setEndY(600);
			l.setFill(Color.BLUE);
			l.setStrokeWidth(10);
			root.getChildren().add(l);
		}
		
		primaryStage.getScene().setOnMousePressed(new EventHandler<MouseEvent>() {
			
		    public void handle(MouseEvent me) {
		    	ImageView c=new ImageView();
		    	c.setFitWidth(150);
		    	c.setFitHeight(150);
		    	if(gamer==1)
		    	{
		    		gamer=2;
		    		c=new ImageView(cross.getImage());
		    	}
		    	else
		    	{
		    		gamer=1;
		    		c=new ImageView(round.getImage());
		    	}
		    	System.out.println(me.getSceneX()+ " "+ me.getSceneY());
		    	if(me.getSceneX()>=0 && me.getSceneX()<200)
		    	{
		    		if(me.getSceneY()>=0 && me.getSceneY()<200 && Area.area[1]==0)
		    		{
		    			Area.area[0]++;
		    			Area.area[1]=gamer;
		    			points.put(gamer, points.get(gamer)+101);
		    			c.setLayoutX(0);
		    			c.setLayoutY(0);
				    	root.getChildren().add(c);
		    		}
		    		if(me.getSceneY()>=200 && me.getSceneY()<400 && Area.area[4]==0)
		    		{
		    			Area.area[0]++;
		    			Area.area[4]=gamer;
		    			points.put(gamer, points.get(gamer)+202);
		    			c.setLayoutX(0);
		    			c.setLayoutY(200);
				    	root.getChildren().add(c);
		    		}
		    		if(me.getSceneY()>=400 && me.getSceneY()<600 && Area.area[7]==0)
		    		{
		    			Area.area[0]++;
		    			Area.area[7]=gamer;
		    			points.put(gamer, points.get(gamer)+303);
		    			c.setLayoutX(0);
		    			c.setLayoutY(400);
				    	root.getChildren().add(c);
		    		}
		    	}
		    	if(me.getSceneX()>=200 && me.getSceneX()<400)
		    	{
		    		if(me.getSceneY()>=0 && me.getSceneY()<200 && Area.area[2]==0)
		    		{
		    			Area.area[0]++;
		    			Area.area[2]=gamer;
		    			points.put(gamer, points.get(gamer)+405);
		    			c.setLayoutX(200);
		    			c.setLayoutY(0);
				    	root.getChildren().add(c);
		    		}
		    		if(me.getSceneY()>=200 && me.getSceneY()<400 && Area.area[5]==0)
		    		{
		    			Area.area[0]++;
		    			Area.area[5]=gamer;
		    			points.put(gamer, points.get(gamer)+508);
		    			c.setLayoutX(200);
		    			c.setLayoutY(200);
				    	root.getChildren().add(c);
		    		}
		    		if(me.getSceneY()>=400 && me.getSceneY()<600 && Area.area[8]==0)
		    		{
		    			Area.area[0]++;
		    			Area.area[8]=gamer;
		    			points.put(gamer, points.get(gamer)+613);
		    			c.setLayoutX(200);
		    			c.setLayoutY(400);
				    	root.getChildren().add(c);
		    		}
		    	}
		    	if(me.getSceneX()>=400 && me.getSceneX()<600)
		    	{
		    		if(me.getSceneY()>=0 && me.getSceneY()<200 && Area.area[3]==0)
		    		{
		    			Area.area[0]++;
		    			Area.area[3]=gamer;
		    			points.put(gamer, points.get(gamer)+721);
		    			c.setLayoutX(400);
		    			c.setLayoutY(0);
				    	root.getChildren().add(c);
		    		}
		    		if(me.getSceneY()>=200 && me.getSceneY()<400 && Area.area[6]==0)
		    		{
		    			Area.area[0]++;
		    			Area.area[6]=gamer;
		    			points.put(gamer, points.get(gamer)+834);
		    			c.setLayoutX(400);
		    			c.setLayoutY(200);
				    	root.getChildren().add(c);
		    		}
		    		if(me.getSceneY()>=400 && me.getSceneY()<600 && Area.area[9]==0)
		    		{
		    			Area.area[0]++;
		    			Area.area[9]=gamer;
		    			points.put(gamer, points.get(gamer)+955);
		    			c.setLayoutX(400);
		    			c.setLayoutY(400);
				    	root.getChildren().add(c);
		    		}
		    	}
		    	if(Area.compare(1, 2, 3) || Area.compare(4, 5, 6) || Area.compare(7, 8, 9) || Area.compare(1, 4, 7) || Area.compare(2, 5, 8) || Area.compare(3, 6, 9) || Area.compare(1, 5, 9) || Area.compare(3, 5, 7))
		    	{
		    		System.out.println("Wygrywa gracz numer: "+gamer);
		    		primaryStage.close();
		    	}
		    	
		       
		    }
		});
	}
}
