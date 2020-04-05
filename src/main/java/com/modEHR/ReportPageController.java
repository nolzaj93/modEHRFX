package com.modEHR;

import java.io.IOException;
import javafx.fxml.FXML;

public class ReportPageController {
  @FXML
  private void backToHomePage() throws IOException {
    App.setRoot("homepage");
  }

}
