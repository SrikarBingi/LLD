package com.tictactoe.strategy;

import com.tictactoe.model.Board;
import com.tictactoe.model.Symbol;

public class AntiDiagonalWinStrategy implements WinStrategy {

    @Override
    public boolean checkWin(
            Board board,
            int row,
            int col,
            Symbol symbol) {

        int size = board.getSize();

        // Move must be on anti-diagonal
        if (row + col != size - 1) {
            return false;
        }

        for (int i = 0; i < size; i++) {

            if (board.getCell(i, size - 1 - i).getSymbol() != symbol) {
                return false;
            }
        }

        return true;
    }
}
