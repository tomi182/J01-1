package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group root = new Group();
        Scene sc = new Scene(root,720, 405);
        sc.setFill(Color.BLACK);
        primaryStage.setTitle("Úloha 1");
        primaryStage.setScene(sc);
        primaryStage.show();

        Polyline a= new Polyline(120,180,134,165,90,165,134,215,90,215,103,200);
        a.setStroke(Color.MEDIUMPURPLE);
        a.setStrokeWidth(4);

        Polyline b = new Polyline(235,180,255,180,260,165,205,165,235,215,244,197);
        b.setStroke(Color.YELLOW);
        b.setStrokeWidth(4);

        Polyline c = new Polyline(355,165,325,215,385,215,365,185);
        c.setStroke(Color.RED);
        c.setStrokeWidth(4);

        Polyline d = new Polyline(500,165,450,165,475,215,495,180);
        d.setStroke(Color.FORESTGREEN);
        d.setStrokeWidth(4);

        Polyline e = new Polyline(588,180,598,165,630,215,570,215,580,195,600,195);
        e.setStroke(Color.TURQUOISE);
        e.setStrokeWidth(4);


        root.getChildren().addAll(a,b,c,d,e);
    }



    public static void main(String[] args) {
        launch(args);
    }
}
