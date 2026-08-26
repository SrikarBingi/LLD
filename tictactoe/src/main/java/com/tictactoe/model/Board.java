package com.tictactoe.model;

import com.tictactoe.exception.InvalidMoveException;

public class Board {

    private int size;
    private Cell[][] cells;

    public Board(int size) {

        if (size < 3) {
            throw new IllegalArgumentException("Board size must be at least 3");
        }

        this.size = size;
        this.cells = new Cell[size][size];

        initializeBoard();
    }

    private void initializeBoard() {

        for (int row = 0; row < size; row++) {

            for (int col = 0; col < size; col++) {

                cells[row][col] = new Cell(row, col);
            }
        }
    }

    public int getSize() {
        return size;
    }

    public Cell getCell(int row, int col) {

        if (row < 0 || row >= size ||
            col < 0 || col >= size) {

            throw new InvalidMoveException(
                    "Invalid row or column"
            );
        }

        return cells[row][col];
    }

    public boolean isCellEmpty(int row, int col) {
        return getCell(row, col).getSymbol() == Symbol.EMPTY;
    }

    public void makeMove(int row, int col, Symbol symbol) {

        Cell cell = getCell(row, col);

        if (cell.getSymbol() != Symbol.EMPTY) {
            throw new InvalidMoveException(
                    "Cell is already occupied"
            );
        }

        cell.setSymbol(symbol);
    }

    public boolean isFull() {

        for (int row = 0; row < size; row++) {

            for (int col = 0; col < size; col++) {

                if (cells[row][col].getSymbol() == Symbol.EMPTY) {
                    return false;
                }
            }
        }

        return true;
    }

    public void display() {

        for (int row = 0; row < size; row++) {

            for (int col = 0; col < size; col++) {

                Symbol symbol = cells[row][col].getSymbol();

                if (symbol == Symbol.EMPTY) {
                    System.out.print(" . ");
                } else {
                    System.out.print(" " + symbol + " ");
                }

                if (col < size - 1) {
                    System.out.print("|");
                }
            }

            System.out.println();

            if (row < size - 1) {

                for (int col = 0; col < size; col++) {
                    System.out.print("---");

                    if (col < size - 1) {
                        System.out.print("+");
                    }
                }

                System.out.println();
            }
        }
    }
}
