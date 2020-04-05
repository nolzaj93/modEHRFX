package com.modEHR;

import java.io.IOException;
import javafx.fxml.FXML;

public class LoginController {

    @FXML
    private void authorize() throws IOException {
        App.setRoot("homepage");
    }
}
