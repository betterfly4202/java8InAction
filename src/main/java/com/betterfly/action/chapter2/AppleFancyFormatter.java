package com.betterfly.action.chapter2;

import com.betterfly.action.model.Apple;

public class AppleFancyFormatter implements AppleFormatter{
    @Override
    public String accept(Apple a) {
        String characteristic = a.getWeight() > 150 ? "heavy" : "light";

        return "A " + characteristic + " " + a.getColor() + " apple.";
    }
}
