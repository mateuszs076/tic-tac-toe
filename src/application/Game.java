package application;

import java.util.HashMap;

import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Game {
	public static int gamer=1;
	public static void graj(Stage primaryStage, BorderPane root)
	{
		HashMap<Integer, Integer> points=new HashMap<Integer, Integer>();
		points.put(1, 0);
		points.put(2, 0);
		ImageView cross=new ImageView(new Image("cross.png"));
		ImageView round=new ImageView(new Image("round.png"));
		primaryStage.getScene().setOnMousePressed(new EventHandler<MouseEvent>() {
			
		    public void handle(MouseEvent me) {
		    	ImageView c=new ImageView();
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
		    	if(me.getSceneX()>=0 && me.getSceneX()<100)
		    	{
		    		if(me.getSceneY()>=0 && me.getSceneY()<100)
		    		{
		    			points.put(gamer, points.get(gamer)+101);
		    			c.setLayoutX(0);
		    			c.setLayoutY(0);
		    		}
		    		if(me.getSceneY()>=100 && me.getSceneY()<200)
		    		{
		    			points.put(gamer, points.get(gamer)+202);
		    			c.setLayoutX(0);
		    			c.setLayoutY(100);
		    		}
		    		if(me.getSceneY()>=200 && me.getSceneY()<300)
		    		{
		    			points.put(gamer, points.get(gamer)+303);
		    			c.setLayoutX(0);
		    			c.setLayoutY(200);
		    		}
		    	}
		    	if(me.getSceneX()>=100 && me.getSceneX()<200)
		    	{
		    		if(me.getSceneY()>=0 && me.getSceneY()<100)
		    		{
		    			points.put(gamer, points.get(gamer)+405);
		    			c.setLayoutX(100);
		    			c.setLayoutY(0);
		    		}
		    		if(me.getSceneY()>=100 && me.getSceneY()<200)
		    		{
		    			points.put(gamer, points.get(gamer)+508);
		    			c.setLayoutX(100);
		    			c.setLayoutY(100);
		    		}
		    		if(me.getSceneY()>=200 && me.getSceneY()<300)
		    		{
		    			points.put(gamer, points.get(gamer)+613);
		    			c.setLayoutX(100);
		    			c.setLayoutY(200);
		    		}
		    	}
		    	if(me.getSceneX()>=200 && me.getSceneX()<300)
		    	{
		    		if(me.getSceneY()>=00 && me.getSceneY()<100)
		    		{
		    			points.put(gamer, points.get(gamer)+721);
		    			c.setLayoutX(200);
		    			c.setLayoutY(0);
		    		}
		    		if(me.getSceneY()>=100 && me.getSceneY()<200)
		    		{
		    			points.put(gamer, points.get(gamer)+834);
		    			c.setLayoutX(200);
		    			c.setLayoutY(100);
		    		}
		    		if(me.getSceneY()>=200 && me.getSceneY()<300)
		    		{
		    			points.put(gamer, points.get(gamer)+955);
		    			c.setLayoutX(200);
		    			c.setLayoutY(200);
		    		}
		    	}
		    	if(points.get(gamer)==606 || points.get(gamer)==1526 || points.get(gamer)==2510 || points.get(gamer)==1564 || points.get(gamer)==1871 || points.get(gamer)==1544 || points.get(gamer)==1227 || points.get(gamer)==1532)
		    	{
		    		System.out.println("Wygrywa gracz numer: "+gamer);
		    	}
		        root.getChildren().add(c);
		    }
		});
	}
}
