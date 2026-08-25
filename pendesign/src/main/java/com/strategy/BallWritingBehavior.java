package com.strategy;

public class BallWritingBehavior implements WritingBehavior{

    @Override
    public void write() {
        System.out.println("Writing using ball mechanism");
    }

}
