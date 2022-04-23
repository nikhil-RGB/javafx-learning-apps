module com.example.javafxtesting {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxtesting to javafx.fxml;
    exports com.example.javafxtesting;
}