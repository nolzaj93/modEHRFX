module com.modEHR {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.modEHR to javafx.fxml;
    exports com.modEHR;
}