package com.modEHR;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class PatientFileController {

  @FXML
  private ListView recordListView;

  @FXML
  private void backToHomePage() throws IOException {
    App.setRoot("homepage");
  }

  @FXML
  private void loadPatientRecord() throws IOException {
    App.setRoot("patientrecord");
  }

  public void initialize(){
    recordListView.getItems().add("10/11/2019, Author: Dr. Stephen Stohler, DC");
  }
}
