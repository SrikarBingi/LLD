package com.model;

import com.capability.Refillable;
import com.strategy.WritingBehavior;

public class GelPen extends Pen implements Refillable{

    private GelPenRefill refill;

    public GelPen(
            String brand,
            String name,
            WritingBehavior writingBehavior,
            GelPenRefill refill) {

        super(brand, name, writingBehavior);
        this.refill = refill;
    }

    @Override
    public void refill(Refill refill) {

        if (!(refill instanceof GelPenRefill)) {
            throw new IllegalArgumentException(
                    "Gel pen requires gel refill"
            );
        }

        this.refill = (GelPenRefill) refill;
    }

}
