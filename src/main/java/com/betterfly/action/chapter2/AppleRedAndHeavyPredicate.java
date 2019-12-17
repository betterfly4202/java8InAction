package com.betterfly.action.chapter2;

import com.betterfly.action.model.Apple;

public class AppleRedAndHeavyPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "red".equals(apple.getColor())
                    && apple.getWeight() > 150;
    }
}
