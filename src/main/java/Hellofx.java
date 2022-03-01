import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.Date;

//import java.util.*;
public class Hellofx extends Application {

    public static void run() {
        launch();
    }
        @Override
        public void start (Stage stage) throws Exception {
            //String version = System.getProperty("javafx.version");

            Label label = new Label ("Hej fra Java");
            Label label2 = new Label ("Datoen er: " + new Date());
            GridPane pane = new GridPane();
            pane.setGridLinesVisible(true);

            pane.add (label, 0,0);
            AnchorPane anchorPane = new AnchorPane();
            anchorPane.set
            //pane.add (label2, 10,2);

            Scene scene = new Scene(pane, 640, 480);
            stage.setScene(scene); stage.show();
        }


}
