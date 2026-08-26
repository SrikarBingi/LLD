package com.tictactoe.strategy;

import com.tictactoe.model.Board;
import com.tictactoe.model.Symbol;

public class ColumnWinStrategy implements WinStrategy {

    @Override
    public boolean checkWin(
            Board board,
            int row,
            int col,
            Symbol symbol) {

        int size = board.getSize();

        for (int currentRow = 0;
             currentRow < size;
             currentRow++) {

            if (board.getCell(currentRow, col).getSymbol() != symbol) {
                return false;
            }
        }

        return true;
    }
}
