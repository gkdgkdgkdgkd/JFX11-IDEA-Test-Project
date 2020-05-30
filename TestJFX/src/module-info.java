module TestJFX {
    requires javafx.fxml;
    requires javafx.controls;
    requires com.google.gson;

    opens sample to javafx.fxml;
    exports sample;
}