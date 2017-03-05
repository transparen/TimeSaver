import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javax.swing.border.Border;

public class Main extends Application {
 Stage mainWindow;

 public static void main(String []args)
 {
  launch(args);
 }
  public void start(Stage primaryStage){

  mainWindow = primaryStage;

  mainWindow.setTitle("TimeSaver");


   BorderPane border = new BorderPane();
   HBox topButtons = addHbox();
   border.setTop(topButtons);
 //  addStackPane(topButtons);
   Scene scene = new Scene(border, 500, 500);

mainWindow.setScene(scene);
mainWindow.show();







  }

  public HBox addHbox(){
   HBox topButtons = new HBox();
   topButtons.setPadding(new Insets(15,15,15,15));
   topButtons.setSpacing(10);
   topButtons.setStyle("-fx-background-color: #333333;");

   Button buttonToDo = new Button("ToDo");
   buttonToDo.setPrefSize(100, 20);

   topButtons.getChildren().addAll(buttonToDo);
   return topButtons;

  }
}