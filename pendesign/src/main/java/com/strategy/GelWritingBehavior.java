package com.strategy;

public class GelWritingBehavior implements WritingBehavior{

    @Override
    public void write() {
        System.out.println("Writing using gel mechanism");
    }

}
