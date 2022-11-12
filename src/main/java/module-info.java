module com.example.fxproject {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.scrabble.client to javafx.fxml;
    exports com.scrabble.client;
    exports com.scrabble;
    opens com.scrabble to javafx.fxml;
}