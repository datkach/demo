package org.tunga.demo;

import org.tunga.model.topic.Statistic;
import org.tunga.model.topic.Topic;
import org.tunga.model.topic.Variant;

import java.util.ArrayList;
import java.util.List;

public class TopicService {
    public static List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();

        Topic topic1 = new Topic();
        topic1.setName("Topic 1");

        Variant topic1Variant1 = new Variant();
        topic1Variant1.setNameOfVariant("Variant 1 for Topic 1");
        topic1Variant1.setStatistic(new Statistic(0));

        Variant topic1Variant2 = new Variant();
        topic1Variant2.setNameOfVariant("Variant 2 for Topic 1");
        topic1Variant2.setStatistic(new Statistic(0));

        topic1.getVariants().add(topic1Variant1);
        topic1.getVariants().add(topic1Variant2);

        topics.add(topic1);

        Topic topic2 = new Topic();
        topic2.setName("Topic 2");

        Variant topic2Variant1 = new Variant();
        topic2Variant1.setNameOfVariant("Variant 1 for Topic 2");
        topic2Variant1.setStatistic(new Statistic(0));

        Variant topic2Variant2 = new Variant();
        topic2Variant2.setNameOfVariant("Variant 2 for Topic 2");
        topic2Variant2.setStatistic(new Statistic(0));

        topic2.getVariants().add(topic2Variant1);
        topic2.getVariants().add(topic2Variant2);

        topics.add(topic2);

        return topics;
    }
}
