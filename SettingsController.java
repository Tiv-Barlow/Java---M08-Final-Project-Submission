//M08 Final Project Submission
//Ivy Tech Community College
//SDEV 200 - Java
//Professor Bumgardner
//Nativida Muhammad
//12 May 2024
//SettingsController.java file

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class SettingsController {

  @FXML
  private ColorPicker backgroundColorPicker;

  @FXML
  private ColorPicker textColorPicker;

  @FXML
  private ComboBox<String> fontComboBox;

  @FXML
  private void initialize() {
    fontComboBox.getItems().addAll("Arial", "Verdana", "Times New Roman", "Courier New");
    fontComboBox.setValue("Arial");
  }

  @FXML
  private void handleBackgroundColorChange() {
    Color backgroundColor = backgroundColorPicker.getValue();
    // Apply background color to the dashboard
  }

  @FXML
  private void handleTextColorChange() {
    Color textColor = textColorPicker.getValue();
    // Apply text color to the dashboard elements
  }

  @FXML
  private void handleFontSelection() {
    String selectedFont = fontComboBox.getValue();
    // Apply selected font to the dashboard elements
  }

  @FXML
  private void handleUploadImage() {
    // Open file chooser dialog to upload background image
  }
}
