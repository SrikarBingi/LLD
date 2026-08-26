package com.tictactoe.strategy;

import com.tictactoe.model.Board;
import com.tictactoe.model.Symbol;

public class RowWinStrategy implements WinStrategy {

    public boolean checkWin(
            Board board,
            int row,
            int col,
            Symbol symbol) {

        int size = board.getSize();

        for (int currentCol = 0;
             currentCol < size;
             currentCol++) {

            if (board.getCell(row, currentCol).getSymbol() != symbol) {
                return false;
            }
        }

        return true;
    }
}
