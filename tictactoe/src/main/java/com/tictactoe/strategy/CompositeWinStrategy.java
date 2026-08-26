package com.tictactoe.strategy;

import java.util.ArrayList;
import java.util.List;

import com.tictactoe.model.Board;
import com.tictactoe.model.Symbol;

public class CompositeWinStrategy implements WinStrategy {

    private List<WinStrategy> strategies;

    public CompositeWinStrategy() {
        this.strategies = new ArrayList<>();

        strategies.add(new RowWinStrategy());
        strategies.add(new ColumnWinStrategy());
        strategies.add(new DiagonalWinStrategy());
        strategies.add(new AntiDiagonalWinStrategy());
    }

    @Override
    public boolean checkWin(
            Board board,
            int row,
            int col,
            Symbol symbol) {

        for (WinStrategy strategy : strategies) {

            if (strategy.checkWin(
                    board,
                    row,
                    col,
                    symbol)) {

                return true;
            }
        }

        return false;
    }
}
