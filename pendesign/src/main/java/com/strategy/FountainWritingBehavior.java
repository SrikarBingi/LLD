package com.strategy;

public class FountainWritingBehavior implements WritingBehavior{

    @Override
    public void write() {
        System.out.println("Writing using fountain mechanism");
    }

}
