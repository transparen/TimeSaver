import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.scene.text.Text;


import javax.swing.border.Border;


public class Main extends Application {
 Stage mainWindow;
 public TextField textFieldNewTODO = new TextField();
 public static void main(String []args)
 {
  launch(args);
 }
  public void start(Stage primaryStage){

  mainWindow = primaryStage;

  mainWindow.setTitle("Time Saver");


   BorderPane border = new BorderPane();
   HBox topButtons = addHbox();
   border.setTop(topButtons);
   border.setCenter(addGridPane());
 //  addStackPane(topButtons);
   Scene scene = new Scene(border, 500, 500);



 mainWindow.setScene(scene);
 mainWindow.show();


  }

  public HBox addHbox(){
   final  int prefHeight = 20;
   final int prefWidth = 90;



   //TOP BAR WITH BUTTONS

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

  public GridPane addGridPane(){
   GridPane grid = new GridPane();
   grid.setHgap(10);
   grid.setVgap(10);
   grid.setPadding(new Insets(5, 10 ,5 ,10));


   TextInputDialog addNewActivityTODO = new TextInputDialog("Input here");
   addNewActivityTODO.setTitle("Add new activity");
   addNewActivityTODO.setHeaderText("DUPA");
   addNewActivityTODO.setContentText("HERE");



   Button addNewTODO = new Button("Add sth");
   addNewTODO.setOnMouseClicked( e -> addNewActivityTODO.show() );
  grid.add(addNewTODO, 1, 0);


   //Category in column 2, row 1
   Text category = new Text("postponed");
   category.setFont(Font.font("Arial", FontWeight.BOLD, 22));
   grid.add(category, 1, 5);


   // Title in column 3, row 1
   Text chartTitle = new Text("sdg sdf sdafgg");
   chartTitle.setFont(Font.font("Arial", FontWeight.BOLD, 20));
   grid.add(chartTitle, 2, 10);

   // Subtitle in columns 2-3, row 2
   Text chartSubtitle = new Text("sth");
   grid.add(chartSubtitle, 1, 6, 2, 1);


//   StackPane root = new StackPane(textFieldNewTODO);
//   Scene scene2 = new Scene(root , 350, 120);
//   mainWindow.setScene(scene2);
//   mainWindow.show();


   return grid;
  }







}