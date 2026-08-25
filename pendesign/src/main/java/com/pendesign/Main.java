package com.pendesign;

import com.model.BallPen;
import com.model.BallPenRefill;
import com.model.FountainPen;
import com.model.GelPen;
import com.model.GelPenRefill;
import com.model.Ink;
import com.model.Marker;
import com.model.Pen;
import com.model.Tip;
import com.strategy.BallWritingBehavior;
import com.strategy.FountainWritingBehavior;
import com.strategy.GelWritingBehavior;
import com.strategy.MarkerWritingBehavior;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Ink
        Ink blueInk = new Ink("Blue");
        Ink blackInk = new Ink("Black");

        // Tips
        Tip ballTip = new Tip(0.7);
        Tip gelTip = new Tip(0.5);
        Tip fountainTip = new Tip(0.8);

        // Refills
        BallPenRefill ballRefill =
                new BallPenRefill(ballTip, blueInk);

        GelPenRefill gelRefill =
                new GelPenRefill(gelTip, blackInk);

        // Pens
        Pen ballPen = new BallPen(
                "Reynolds",
                "Jetter",
                new BallWritingBehavior(),
                ballRefill
        );

        Pen gelPen = new GelPen(
                "Pilot",
                "G2",
                new GelWritingBehavior(),
                gelRefill
        );

        Pen fountainPen = new FountainPen(
                "Parker",
                "Vector",
                new FountainWritingBehavior(),
                fountainTip
        );

        Pen marker = new Marker(
                "Camlin",
                "Permanent Marker",
                new MarkerWritingBehavior()
        );

        // Writing
        ballPen.write();
        gelPen.write();
        fountainPen.write();
        marker.write();

        // Refilling
        GelPen gel = (GelPen) gelPen;

        gel.refill(
                new GelPenRefill(
                        new Tip(0.7),
                        new Ink("Red")
                )
        );

        BallPen ball = (BallPen) ballPen;

        ball.refill(
                new BallPenRefill(
                        new Tip(0.8),
                        new Ink("Black")
                )
        );
    }
}