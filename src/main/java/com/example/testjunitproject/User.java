package com.example.testjunitproject;

import java.time.LocalDate;

public record User(String name, Integer age, Boolean blocked, LocalDate birthday) {
}
