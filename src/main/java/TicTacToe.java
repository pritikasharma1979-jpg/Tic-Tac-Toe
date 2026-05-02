package org.example;

public class TicTacToe {

    public static void main(String[] args) {

        int slot = 7; // test value

        System.out.println("Row: " + getRowFromSlot(slot));
        System.out.println("Column: " + getColFromSlot(slot));
    }

    // Row calculation
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    // Column calculation
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}