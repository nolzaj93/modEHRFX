package com.modEHR;

import java.io.IOException;
import javafx.fxml.FXML;

public class HomePageController {

    @FXML
    private void logOut() throws IOException {
        App.setRoot("login");
    }

  @FXML
  private void searchPatient() throws IOException {
    //Query database with user input
  }

  @FXML
  private void loadPatientFile() throws IOException {
    App.setRoot("patientfile");
  }

  @FXML
  private void loadNewPatient() throws IOException {
    App.setRoot("newpatient");
  }
}