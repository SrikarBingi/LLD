package com.tictactoe.strategy;

import com.tictactoe.model.Board;
import com.tictactoe.model.Symbol;

public class DiagonalWinStrategy implements WinStrategy {

    @Override
    public boolean checkWin(
            Board board,
            int row,
            int col,
            Symbol symbol) {

        int size = board.getSize();

        // Move must be on main diagonal
        if (row != col) {
            return false;
        }

        for (int i = 0; i < size; i++) {

            if (board.getCell(i, i).getSymbol() != symbol) {
                return false;
            }
        }

        return true;
    }
}
