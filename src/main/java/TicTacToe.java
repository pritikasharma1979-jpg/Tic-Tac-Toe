package org.example;

import java.util.Random;

public class TicTacToe {

    // UC1 variables
    static char[][] board = new char[3][3];

    // UC2 variables
    static boolean isHumanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {

        // UC1
        initializeBoard();
        printBoard();

        // UC2
        tossAndAssignSymbols();
        displayTossResult();
    }

    // ===== UC1 METHODS =====
    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // ===== UC2 METHODS =====

    static void tossAndAssignSymbols() {
        Random rand = new Random();

        // 0 or 1 randomly
        int toss = rand.nextInt(2);

        if (toss == 0) {
            isHumanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';
        } else {
            isHumanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';
        }
    }

    static void displayTossResult() {
        System.out.println("\n--- Toss Result ---");

        if (isHumanTurn) {
            System.out.println("You won the toss!");
        } else {
            System.out.println("Computer won the toss!");
        }

        System.out.println("Your symbol: " + humanSymbol);
        System.out.println("Computer symbol: " + computerSymbol);

        if (isHumanTurn) {
            System.out.println("You play first.");
        } else {
            System.out.println("Computer plays first.");
        }
    }
}