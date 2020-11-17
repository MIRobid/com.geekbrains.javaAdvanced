package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public javafx.scene.control.TextArea textArea;
    @FXML
    public TextField textField;
    @FXML
    public Button button;

    public void onClickBtnSend(ActionEvent actionEvent){
        textArea.appendText("- "+textField.getText()+"\n");
        textField.clear();
        textField.requestFocus();
    }

    public void onClick(ActionEvent click){
        textArea.appendText("- "+textField.getText()+"\n");
        textField.clear();
        textField.requestFocus();
    }

}
