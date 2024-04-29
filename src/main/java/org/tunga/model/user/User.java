package org.tunga.model.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static org.tunga.model.user.Role.TEACHER;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class User {
    private String name;
    private String surname;
    private  String email;
    private Role role;
    public boolean getRole() {//SERVICE
        return TEACHER.equals(role);
    }


    @Override
    public String toString() {
        return "user{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", type=" + role +
                '}';
    }
}
