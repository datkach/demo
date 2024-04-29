package org.tunga.model.topic;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
//@Builder
@Getter
@Setter
@ToString
public class Variant {

    private Integer id;
    private String nameOfVariant;
    private Statistic statistic;
//    @Override
//    public String toString() {
//        return "Variant{" +
//                "nameOfVariant='" + nameOfVariant + '\'' +
//                '}' + statistic.getGeneralCountVote();
//    }
}
