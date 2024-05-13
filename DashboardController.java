//M08 Final Project Submission
//Ivy Tech Community College
//SDEV 200 - Java
//Professor Bumgardner
//Nativida Muhammad
//12 May 2024
//DashboardController.java file

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.paint.Color;

public class DashboardController {

    @FXML
    private ColorPicker backgroundColorPicker;

    @FXML
    private ColorPicker textColorPicker;

    @FXML
    private ComboBox<String> fontComboBox;

    @FXML
    private void initialize() {
        backgroundColorPicker.setOnAction(event -> applyStyling());
        textColorPicker.setOnAction(event -> applyStyling());
        fontComboBox.setOnAction(event -> applyStyling());
    }

    private void applyStyling() {
        Color backgroundColor = backgroundColorPicker.getValue();
        Color textColor = textColorPicker.getValue();
        String selectedFont = fontComboBox.getValue();

        // Apply selected styling options to the dashboard elements
        // Example: dashboardPane.setStyle("-fx-background-color: " +
        // toHex(backgroundColor) + ";");
        // Example: titleLabel.setStyle("-fx-text-fill: " + toHex(textColor) + ";");
        // Example: titleLabel.setStyle("-fx-font-family: " + selectedFont + ";");
    }

    private String toHex(Color color) {
        return String.format("#%02X%02X%02X",
                (int) (color.getRed() * 255),
                (int) (color.getGreen() * 255),
                (int) (color.getBlue() * 255));
    }
}
