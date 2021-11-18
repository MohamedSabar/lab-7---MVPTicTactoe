package com.example.mvptictactoe;

public interface BoardView {
    char PLAYER_1_SYMBOL = 'X';
    char PLAYER_2_SYMBOL = 'O';
    byte DRAW = 0;
    byte PLEYER_1_WINNER = 1;
    byte PLEYER_2_WINNER = 2;

    void newGame();

    void putSymol(char symbol, byte row, byte col);

    void gameEnded(byte winner);

    public void invalidPlay(byte row, byte col);
}
