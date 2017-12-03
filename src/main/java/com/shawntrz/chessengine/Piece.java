package com.shawntrz.chessengine;

public abstract class Piece {
    protected boolean color;
    protected PieceType pieceType;
    protected boolean isAttacked;
    public Piece(boolean color){
        this.color = color;
    }

    public boolean isWhite(){
        return color;
    }

    public boolean isBlack(){
        return !color;
    }

    public PieceType getType(){
        return this.pieceType;
    }

    public boolean isAttacked(){
        return this.isAttacked;
    }

    public void setAttacked(boolean isAttacked){
        this.isAttacked = isAttacked;
    }
}

class Pawn extends Piece{
    private boolean hasMoved;
    public Pawn(boolean color){
        super(color);
        this.hasMoved = false;
        this.pieceType = PieceType.PAWN;
    }

    public void setMoved(){
        this.hasMoved = true;
    }

    public boolean hasMoved(){
        return this.hasMoved;
    }
}

class Knight extends Piece{
    public Knight(boolean color){
        super(color);
        this.pieceType = PieceType.KNIGHT;
    }
}

class Bishop extends Piece{
    public Bishop(boolean color){
        super(color);
        this.pieceType = PieceType.BISHOP;
    }
}

class Rook extends Piece{
    public Rook(boolean color){
        super(color);
        this.pieceType = PieceType.ROOK;
    }
}

class Queen extends Piece{
    public Queen(boolean color){
        super(color);
        this.pieceType = PieceType.QUEEN;
    }
}

class King extends Piece{
    public King(boolean color){
        super(color);
        this.pieceType = PieceType.KING;
    }
}


