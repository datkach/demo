package org.tunga.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import org.tunga.model.topic.Topic;

import java.util.List;

public class HelloController {
    @FXML
    private ListView<Topic> topicsListView;
    public void initData() {
        topicsListView.setCellFactory(new Callback<>() {
            @Override
            public ListCell<Topic> call(ListView<Topic> listView) {
                return new ListCell<>() {
                    @Override
                    protected void updateItem(Topic item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty || item == null) {
                            setText(null);
                        } else {
                            setText(item.getName());
                        }
                    }
                };
            }
        });

        topicsListView.getItems().addAll(TopicService.getAllTopics());
    }

    @FXML
    protected void onSelectTopicButtonClick() {
        Topic selectedTopic = topicsListView.getSelectionModel().getSelectedItem();

        if (selectedTopic != null) {
            VariantController variantController = new VariantController();
            variantController.showVariants(selectedTopic);
        }
    }
}
