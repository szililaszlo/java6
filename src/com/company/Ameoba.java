package com.company;

/**
 * Created by java1 on 2017.12.13..
 */
public class Ameoba {
    char [] [] board = new char[3][3];

    public Ameoba() {
        init();
    }

    public void play() {

    }

    public void init() {
        for(int i =0; i< board.length; ++i) {
            for (int j= 0; j<board[i].length;++j) {
                board[i][j] = '_';
            }
        }
    }

    public void drawBoard() {
        for(int i =0; i< board.length; ++i) {
            for (int j= 0; j<board[i].length;++j) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean isCharacterWinner(char symbol) {

        return checkRow(symbol) || checkColumn(symbol) ||
                checkDiagonalRightToLeft(symbol) || checkDiagonalLeftToRight(symbol);
    }

    private boolean checkRow(char symbol) {
        for(int i =0; i< board.length; ++i) {
            for (int j= 0; j<board[i].length;++j) {
                if(board[i][j] == symbol && board[i][j+1] == symbol && board[i][j+2] == symbol) {
                    return true;
                }
            }

        }
        //ideiglenes a false
    return false;
    }

    private boolean checkColumn(char symbol) {
        return false;
    }

    private boolean checkDiagonalLeftToRight(char symbol) {
        return false;
    }

    private boolean checkDiagonalRightToLeft(char symbol) {
        return false;
    }
}
