package org.tunga.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import org.tunga.model.topic.Topic;

public class VariantController {

    @FXML
    private Label topicLabel;

    @FXML
    private ListView<String> variantsListView;

    public void showVariants(Topic topic) {
        topicLabel.setText(topic.getName());
        variantsListView.getItems().clear();
        topic.getVariants().forEach(variant ->
                variantsListView.getItems().add(variant.getNameOfVariant()));
    }
}
