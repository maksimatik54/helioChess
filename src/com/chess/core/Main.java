package com.chess.core;

import com.chess.core.GUI.MainFrame;
import com.chess.core.board.Board;
import com.chess.core.game.Alliance;
import com.chess.core.game.Game;
import com.chess.core.pieces.Piece;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        game.run();


/*
        Board board = new Board();
        MainFrame mainFrame = new MainFrame();
        mainFrame.init();
        mainFrame.drawBoard(board);
        mainFrame.drawPieces((ArrayList<Piece>) board.getPieces(Alliance.BLACK));
        mainFrame.drawPieces((ArrayList<Piece>) board.getPieces(Alliance.WHITE));
        mainFrame.showCheckPopup();
        mainFrame.showCheckMatePopup();*/


    }
}