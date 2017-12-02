package com.shawntrz.chessengine;

public abstract class Piece {
    protected PieceType pieceType;
    public Piece(){

    }

    public PieceType getType(){
        return this.pieceType;
    }
}

class Pawn extends Piece{
    private boolean hasMoved;
    public Pawn(){
        this.hasMoved = false;
        this.pieceType = PieceType.PAWN;
    }
    public Pawn(boolean hasMoved){
        this.hasMoved = hasMoved;
        this.pieceType = PieceType.PAWN;
    }
    public boolean hasMoved(){
        return this.hasMoved;
    }
}

class Knight extends Piece{
    public Knight(){
        this.pieceType = PieceType.KNIGHT;
    }
}

class Bishop extends Piece{
    public Bishop(){
        this.pieceType = PieceType.BISHOP;
    }
}

class Rook extends Piece{
    public Rook(){
        this.pieceType = PieceType.ROOK;
    }
}

class Queen extends Piece{
    public Queen(){
        this.pieceType = PieceType.QUEEN;
    }
}

class King extends Piece{
    public King(){
        this.pieceType = PieceType.KING;
    }
}


