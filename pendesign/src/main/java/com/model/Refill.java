package com.model;

public abstract class Refill {
    private Tip tip;
    private Ink ink;

    public Refill(Tip tip, Ink ink) {
        this.tip = tip;
        this.ink = ink;
    }

    public Tip getTip() {
        return tip;
    }

    public Ink getInk() {
        return ink;
    }
}
