package com.tictactoe;

import com.tictactoe.model.Board;
import com.tictactoe.model.Player;
import com.tictactoe.model.Symbol;
import com.tictactoe.strategy.CompositeWinStrategy;
import com.tictactoe.strategy.WinStrategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Create players
        Player player1 =
                new Player("Srikar", Symbol.X);

        Player player2 =
                new Player("Bunny", Symbol.O);

        Player[] players = {
                player1,
                player2
        };

        // Create board
        Board board = new Board(3);

        // Create winning strategy
        WinStrategy winStrategy =
                new CompositeWinStrategy();

        // Create game
        Game game =
                new Game(
                        board,
                        players,
                        winStrategy
                );

        // Moves
        game.makeMove(0, 0);
        board.display();

        System.out.println();

        game.makeMove(1, 0);
        board.display();

        System.out.println();

        game.makeMove(0, 1);
        board.display();

        System.out.println();

        game.makeMove(1, 1);
        board.display();

        System.out.println();

        game.makeMove(0, 2);
        board.display();

        System.out.println();

        System.out.println(
                "Game State: "+game.getGameState()
        );
    }
}