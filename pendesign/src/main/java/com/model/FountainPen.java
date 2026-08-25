package com.model;

import com.strategy.WritingBehavior;

public class FountainPen extends Pen {

    private Tip tip;

    public FountainPen(
            String brand,
            String name,
            WritingBehavior writingBehavior,
            Tip tip) {

        super(brand, name, writingBehavior);
        this.tip = tip;
    }

    
}
