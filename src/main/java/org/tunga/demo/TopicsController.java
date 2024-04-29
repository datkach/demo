package org.tunga.demo;


import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import org.tunga.model.topic.Topic;

import java.util.List;

public class TopicsController {
    @FXML
    private ListView<Topic> topicsListView;

    private List<Topic> topics;

    public void initialize() {
        topics = TopicService.getAllTopics();

        topicsListView.getItems().addAll(topics);
    }


    @FXML
    private void selectTopic() {
        Topic selectedTopic = topicsListView.getSelectionModel().getSelectedItem();

        if (selectedTopic != null) {
            VariantController variantController = new VariantController();
            variantController.showVariants(selectedTopic);
        }
    }
}
