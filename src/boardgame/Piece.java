package boardgame;

import boardgame.Position;


public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board){
        this.board = board;
    }

    public boolean[][] possibleMoves() {
        return new boolean[1][1];
    }

    public boolean possibleMove() {
        return true;
    }

    public boolean isThereAnyPossibleMove() {
        return true;
    }

    protected Board getBoard() {
        return board;
    }
}
