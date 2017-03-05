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
   final  int prefHeight = 20;
   final int prefWidth = 90;


   HBox topButtons = new HBox();
   topButtons.setPadding(new Insets(1,15,2,15));
   topButtons.setSpacing(10);
   topButtons.setStyle("-fx-background-color: #333333;");

   Button buttonToDo = new Button("ToDo");
   buttonToDo.setPrefSize(prefWidth, prefHeight);

   Button buttonEisenhover = new Button("Macierz");
   buttonEisenhover.setPrefSize(prefWidth, prefHeight);

   Button buttonStatistics = new Button("Statystyki");
   buttonStatistics.setPrefSize(prefWidth, prefHeight);

   Button buttonNotes = new Button("Notatki");
   buttonNotes.setPrefSize(prefWidth, prefHeight);

   Button buttonSettings = new Button("Ustawienia");
   buttonSettings.setPrefSize(prefWidth, prefHeight);



   topButtons.getChildren().addAll(buttonToDo, buttonEisenhover, buttonStatistics, buttonNotes, buttonSettings);
   return topButtons;

  }
}