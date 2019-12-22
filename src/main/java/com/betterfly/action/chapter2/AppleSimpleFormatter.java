package com.betterfly.action.chapter2;

import com.betterfly.action.model.Apple;

public class AppleSimpleFormatter implements AppleFormatter{
    @Override
    public String accept(Apple a) {
        return "An apple of " + a.getColor() + "apple.";
    }
}
