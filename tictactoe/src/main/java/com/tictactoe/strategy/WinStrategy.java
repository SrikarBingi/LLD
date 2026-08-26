package com.tictactoe.strategy;

import com.tictactoe.model.Board;
import com.tictactoe.model.Symbol;

public interface WinStrategy {
    boolean checkWin(
            Board board,
            int row,
            int col,
            Symbol symbol
    );
}
