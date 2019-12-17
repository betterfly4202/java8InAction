package com.betterfly.action.chapter2;

import com.betterfly.action.model.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
