package com.betterfly.action.chapter2;

import com.betterfly.action.model.Apple;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    /**
     * 1. filtering green apples
     */
    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if("green".equals(apple.getColor())){
                result.add(apple);
            }
        }

        return result;
    }

    /**
     * 2. parameterizing the Color
     */
    public static List<Apple> filterGreenApples(List<Apple> inventory, String color){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(apple.getColor().equals(color)){
                result.add(apple);
            }
        }

        return result;
    }

    /**
     * 2-1. parameterizing the Color, Weight
     */
    public static List<Apple> filterGreenApples(List<Apple> inventory, String color, int weight, boolean flag){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if((flag && apple.getColor().equals(color)
                    || !flag && apple.getWeight() > weight)){
                result.add(apple);
            }
        }

        return result;
    }

    /**
     * 2-2-1. filtering by abstract criteria
     *
     * This code is much more flexible than our first attempt, while at the same time it’s easy to read and to use!
     */
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(p.test(apple)){
                result.add(apple);
            }
        }

        return result;
    }


    /**
     * Quiz 2.1
     * Write a flexible prettyPrintApple method
     */
    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter formatter){
        for(Apple apple: inventory) {
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }
}
