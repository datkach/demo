module org.tunga.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;


    opens org.tunga.demo to javafx.fxml;
    exports org.tunga.demo;
}
