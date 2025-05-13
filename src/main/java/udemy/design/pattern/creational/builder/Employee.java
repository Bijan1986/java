package udemy.design.pattern.creational.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private Double salary;
}
