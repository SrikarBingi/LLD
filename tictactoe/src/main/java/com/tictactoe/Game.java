package com.tictactoe;

import com.tictactoe.exception.GameException;
import com.tictactoe.model.Board;
import com.tictactoe.model.GameState;
import com.tictactoe.model.Player;
import com.tictactoe.strategy.WinStrategy;

public class Game {

    private Board board;
    private Player[] players;
    private int currentPlayerIndex;
    private GameState gameState;
    private WinStrategy winStrategy;

    public Game(
            Board board,
            Player[] players,
            WinStrategy winStrategy) {

        if (players == null || players.length != 2) {
            throw new IllegalArgumentException(
                    "Tic-Tac-Toe requires exactly 2 players"
            );
        }

        this.board = board;
        this.players = players;
        this.winStrategy = winStrategy;

        this.currentPlayerIndex = 0;
        this.gameState = GameState.IN_PROGRESS;
    }

    public void makeMove(int row, int col) {

        if (gameState != GameState.IN_PROGRESS) {
            throw new GameException(
                    "Game has already ended"
            );
        }

        Player currentPlayer = players[currentPlayerIndex];

        // Make move
        board.makeMove(
                row,
                col,
                currentPlayer.getSymbol()
        );

        System.out.println(
                currentPlayer.getName()
                        + " placed "
                        + currentPlayer.getSymbol()
                        + " at ("
                        + row
                        + ", "
                        + col
                        + ")"
        );

        // Check winner
        if (winStrategy.checkWin(
                board,
                row,
                col,
                currentPlayer.getSymbol())) {

            gameState = GameState.WON;

            System.out.println(
                    currentPlayer.getName()
                            + " wins!"
            );

            return;
        }

        // Check draw
        if (board.isFull()) {

            gameState = GameState.DRAW;

            System.out.println("Game is a draw!");

            return;
        }

        // Switch player
        switchPlayer();
    }

    private void switchPlayer() {

        currentPlayerIndex =
                (currentPlayerIndex + 1)
                        % players.length;
    }

    public GameState getGameState() {
        return gameState;
    }

    public Player getCurrentPlayer() {
        return players[currentPlayerIndex];
    }

    public Board getBoard() {
        return board;
    }
}
