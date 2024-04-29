package org.tunga.model.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class Student extends User {

    private Integer id;
    private Integer year;
    private Semester semester;
    private StudentRole studentRole;

    @Override
    public String toString() {
        return "Student{" +
                "year=" + year +
                ", semester=" + semester +
                '}' + super.toString();
    }
}
//    public void updateSemester() {//service; Shcedule
//        int month = LocalDate.now().getMonthValue();
//        if(month <= 6) {
//            semester = Semester.SUMMER;
//        } else {
//            semester = Semester.WINTER  ;
//        }
//    }
