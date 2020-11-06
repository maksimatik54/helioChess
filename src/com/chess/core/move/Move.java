package com.chess.core.move;

import com.chess.core.board.Board;
import com.chess.core.pieces.Piece;

public abstract class Move {

    private final Board board;
    private final Piece movedPiece;

    private final int currentPosition;
    private final int destinationPosition;

    private final int hashCode;

    protected Move(Board board, Piece pieceToMove, int destinationPosition) {
        this.board = board;
        this.movedPiece = pieceToMove;

        this.currentPosition = pieceToMove.getPiecePosition();
        this.destinationPosition = destinationPosition;

        this.hashCode = calculateHashCode();
    }

    public static Move createMove(Board board, Piece movedPiece, int destinationPosition, Piece attackedPiece) {
        if (attackedPiece == null) return new MajorMove(board, movedPiece, destinationPosition);
        return new AttackMove(board, movedPiece, destinationPosition, attackedPiece);
    }

    public Piece getMovedPiece() {
        return this.movedPiece;
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }
    public int getDestinationPosition() {
        return this.destinationPosition;
    }

    private int calculateHashCode() {
        return 31 * destinationPosition + 31 * currentPosition + 31 * movedPiece.hashCode();
    }

    @Override
    public int hashCode() {
        return this.hashCode;
    }

    public boolean equals(Move move) {
        return this.hashCode() == move.hashCode();
    }
}