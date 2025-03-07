package com.example.testjunitproject;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    User user = new User("Karel", 37, false, LocalDate.now().minusYears(37));

    @Test
    void user_should_be_at_least_18() {
        assertTrue(user.age() >= 18);
        //assertEquals(user.name(), "Karel");
    }

    @Test
    @DisplayName("Debe de ser mayor a 18")
    void user_should_be_at_least_18_second_test() {
        Assertions.assertThat(user.age()).isGreaterThan(18);

        Assertions.assertThat(user.blocked())
                .as("User %s should be blocked", user.name())
                .isFalse();
    }

    @Test
    void user_should_be_karel() {
        Assertions.assertThat(user.name()).isEqualTo("Karel");
    }

    @Test
    void user_should_start_by() {
        Assertions.assertThat(user.name()).startsWith("Kar");
    }


}
