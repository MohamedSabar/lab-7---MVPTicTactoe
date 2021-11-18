package com.example.mvptictactoe;

public class Board {
    private byte[][] board = new byte[3][3];
    private static byte Player_1_SYMBOL = 1;
    private static byte Player_2_SYMBOL = 2;

    private boolean pleyer1Turn = true;
    BoardListener boardListener;

    public Board(BoardListener bourdListener) {
        this.boardListener = bourdListener;
    }


    public void move(byte row, byte col) {
        if (board[row][col] != 0) {
            boardListener.invalidPlay(row, col);
            return;
        }

        if (pleyer1Turn) {
            board[row][col] = Player_1_SYMBOL;
            boardListener.pleyerAt(BoardListener.PLAYER_1, row, col);
        } else {
            board[row][col] = Player_2_SYMBOL;
            boardListener.pleyerAt(BoardListener.PLAYER_2, row, col);
        }
        pleyer1Turn = !pleyer1Turn;
    }

}
