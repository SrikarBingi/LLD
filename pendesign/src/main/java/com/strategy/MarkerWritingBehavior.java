package com.strategy;

public class MarkerWritingBehavior implements WritingBehavior {

    @Override
    public void write() {
        System.out.println("Writing using marker mechanism");
    }

}
