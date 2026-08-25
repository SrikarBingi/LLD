package com.model;

import com.capability.Refillable;
import com.strategy.WritingBehavior;

public class BallPen extends Pen implements Refillable {

    private BallPenRefill refill;

    public BallPen(
            String brand,
            String name,
            WritingBehavior writingBehavior,
            BallPenRefill refill) {

        super(brand, name, writingBehavior);
        this.refill = refill;
    }

    @Override
    public void refill(Refill refill) {

        if (!(refill instanceof BallPenRefill)) {
            throw new IllegalArgumentException(
                    "Ball pen requires ball refill"
            );
        }

        this.refill = (BallPenRefill) refill;
    }
}
