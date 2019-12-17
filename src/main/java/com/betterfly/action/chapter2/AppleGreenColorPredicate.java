package com.betterfly.action.chapter2;

import com.betterfly.action.model.Apple;

public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
