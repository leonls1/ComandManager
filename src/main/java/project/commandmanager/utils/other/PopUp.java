package project.commandmanager.utils.other;

import javafx.scene.control.*;
import javafx.stage.Modality;

import java.util.Optional;

public class PopUp {
    public boolean confirmMessage(String title, String header, String content) {
        //Definition Popup
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.setTitle(title);
        dialog.setHeaderText(header);
        dialog.initModality(Modality.WINDOW_MODAL);

        //Definition for the label
        Label label = new Label(content);
        dialog.getDialogPane().setContent(label);

        //definition ok and cancel buttons
        ButtonType okButton = new ButtonType("OK", ButtonBar.ButtonData.OK_DONE);
        ButtonType cancelButton = new ButtonType("CANCEL", ButtonBar.ButtonData.CANCEL_CLOSE);

        //adding buttons to the dialog
        dialog.getDialogPane().getButtonTypes().addAll(okButton, cancelButton);

        Optional<ButtonType> result = dialog.showAndWait();

        return (result.isPresent() && result.get() == okButton);
    }

    public void showErrorAlert(String title, String message ){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public void showInfoAlert(String title, String message ){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
