module com.modEHR {
    requires javafx.controls;
    requires javafx.fxml;
  requires java.sql;
  requires commons.codec;
  requires totp;

  opens com.modEHR to javafx.fxml;
    exports com.modEHR;
}