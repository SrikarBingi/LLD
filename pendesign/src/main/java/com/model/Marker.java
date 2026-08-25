package com.model;

import com.strategy.WritingBehavior;

public class Marker extends Pen{
    public Marker(
            String brand,
            String name,
            WritingBehavior writingBehavior) {

        super(brand, name, writingBehavior);
    }
}
