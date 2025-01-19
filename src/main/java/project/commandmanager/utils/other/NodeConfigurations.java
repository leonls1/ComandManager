package project.commandmanager.utils.other;

import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.Objects;

public class NodeConfigurations {
    public void configureTextFieldForJustDigits(TextInputControl... textField) {
        for (TextInputControl txtF : textField) {
            txtF.textProperty().addListener((obs, oldValue, newValue) -> {
                if (!newValue.matches("\\d*")) {
                    txtF.setText(newValue.replaceAll("[^\\d]", ""));
                }
            });
        }
    }

    public void setDisableSeveralElements(boolean state, Node... elements) {
        for (Node element : elements) {
            element.setDisable(state);
        }
    }

    public void clearFields(TextInputControl... fields) {
        for (TextInputControl field : fields) {
            field.clear();
        }
    }

    public void clearCBOs(ComboBox<?>... combos) {
        for (ComboBox<?> cbo : combos) {
            cbo.getSelectionModel().clearSelection();
        }
    }

    public boolean validateNotNull(Object... elements) {
        for (Object element : elements) {
            if (element == null)
                return false;
        }
        return true;
    }

    public boolean validateNotBlank(TextInputControl... fields) {
        for (TextInputControl field : fields) {
            if (field.getText().isBlank())
                return false;
        }
        return true;
    }

}
