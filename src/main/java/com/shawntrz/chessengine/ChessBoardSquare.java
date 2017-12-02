package com.shawntrz.chessengine;

/**
 * Created by shawn on 12/1/17.
 */
public abstract class ChessBoardSquare {
    protected Piece piece;
    private Boolean isEmpty;
    public ChessBoardSquare(){

    }
    public abstract Piece getPiece();
    public abstract Boolean isEmpty();
}

class OccupiedChessBoardSquare extends ChessBoardSquare{
    OccupiedChessBoardSquare(Piece piece){
        this.piece = piece;
    }
    @Override
    public Piece getPiece() {
        return this.piece;
    }
    public Boolean isEmpty(){
        return false;
    }
}

class UnoccupiedChessBoardSquare extends ChessBoardSquare{
    UnoccupiedChessBoardSquare(){
        this.piece = null;
    }

    @Override
    public Piece getPiece() {
        return null;
    }

    @Override
    public Boolean isEmpty() {
        return true;
    }
}
