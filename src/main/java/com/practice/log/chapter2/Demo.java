package com.practice.log.chapter2;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Alice", List.of("ADMIN", "USER")),
                new User("Bob", List.of("USER", "GUEST")),
                new User("Charlie", List.of("MANAGER", "USER")),
                new User("Diana", List.of("DEV", "ADMIN")),
                new User("Eve", List.of("TESTER", "GUEST"))
        );
        // Extract all unique role across all users
        users.stream().flatMap(user -> user.getRoles().stream()).distinct().toList().forEach(System.out::println);
        // Return only first 5 roles alphabatically that are not guests
        System.out.println("#####");
        users.stream().flatMap(user -> user.getRoles().stream()).distinct().sorted().filter(role -> !role.equalsIgnoreCase("guest")).toList().forEach(System.out::println);

    }
}
