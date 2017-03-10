import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by mv on 10.03.2017.
 */
public class StageManager implements Initializable{
    @FXML
     Button todoButton, arrayButton, statsButton, notesButton, prefButton;

    @FXML
    private void todoButtonAction(ActionEvent event){
        System.out.println("TODOB button");
    }

    @FXML
    private void arrayButtonAction(ActionEvent event){

    }
    @FXML
    private void statsButtonAction(ActionEvent event){

    }
    @FXML
    private void notesButtonAction(ActionEvent event){

    }
    @FXML
    private void prefButtonAction(ActionEvent event){

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
