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
public class Teacher extends User{

    private Integer id;
    private String subject;
    private String degree;
    private TeacherRole teacherRole;
    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                ", degree='" + degree + '\'' +
                '}';
    }
}
