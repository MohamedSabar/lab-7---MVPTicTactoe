package com.example.mvptictactoe;

public interface BoardListener {
    byte NO_ONE = 0;
    byte PLAYER_1 =1;
    byte PLAYER_2 =2;

    void pleyerAt(byte player, byte row , byte col);

    void gameEnded(byte Winner);

    void invalidPlay(byte row , byte col);
}
