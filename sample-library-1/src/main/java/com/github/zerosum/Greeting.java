package com.github.zerosum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Greeting {
    private String message;
    private String from;
    private String to;

    public void greet() {
        System.out.println("Hi! " + to + ". " + "I'm " + from + ". " + message);
    }
}
