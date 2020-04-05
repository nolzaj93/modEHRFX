package com.modEHR;

import java.io.IOException;
import javafx.fxml.FXML;

public class PatientRecordController {

  @FXML
  private void backToHomePage() throws IOException {
    App.setRoot("homepage");
  }

  @FXML
  private void loadReportPage() throws IOException {
    App.setRoot("reportpage");
  }

  @FXML
  private void saveChanges() throws IOException {
    //Save any edits made to the report.
  }
}
