package org.tunga.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.tunga.model.topic.Statistic;
import org.tunga.model.topic.Topic;
import org.tunga.model.topic.Variant;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("topics.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        HelloController controller = fxmlLoader.getController();
        controller.initData();
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
