package udemy.design.pattern.creational.builder;

import java.util.logging.Logger;

public class BuilderDemo {
    private static final Logger log = Logger.getLogger(BuilderDemo.class.getName());

    public static void main(String[] args) {
        log.info("Using generic builder");
        Employee employee = Employee.builder().firstName("bijan").build();
        log.info(employee.getFirstName());
    }
}
