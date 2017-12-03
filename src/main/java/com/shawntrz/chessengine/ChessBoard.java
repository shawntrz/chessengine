package com.shawntrz.chessengine;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shawn on 12/1/17.
 */
public class ChessBoard {
    private List<ChessBoardSquare> squares = new ArrayList<ChessBoardSquare>();
    ChessBoard(){
        this.squares = this.getStartingPosition();
    }

    private List<ChessBoardSquare> getStartingPosition(){
        //We instantiate the list such that a1 is the bottom left and h8 is top right.

        //White pieces a1-h2...
        ChessBoardSquare a1 = new OccupiedChessBoardSquare(new Rook(true));
        ChessBoardSquare b1 = new OccupiedChessBoardSquare(new Knight(true));
        ChessBoardSquare c1 = new OccupiedChessBoardSquare(new Bishop(true));
        ChessBoardSquare d1 = new OccupiedChessBoardSquare(new Queen(true));
        ChessBoardSquare e1 = new OccupiedChessBoardSquare(new King(true));
        ChessBoardSquare f1 = new OccupiedChessBoardSquare(new Bishop(true));
        ChessBoardSquare g1 = new OccupiedChessBoardSquare(new Knight(true));
        ChessBoardSquare h1 = new OccupiedChessBoardSquare(new Rook(true));
        ChessBoardSquare a2 = new OccupiedChessBoardSquare(new Pawn(true));
        ChessBoardSquare b2 = new OccupiedChessBoardSquare(new Pawn(true));
        ChessBoardSquare c2 = new OccupiedChessBoardSquare(new Pawn(true));
        ChessBoardSquare d2 = new OccupiedChessBoardSquare(new Pawn(true));
        ChessBoardSquare e2 = new OccupiedChessBoardSquare(new Pawn(true));
        ChessBoardSquare f2 = new OccupiedChessBoardSquare(new Pawn(true));
        ChessBoardSquare g2 = new OccupiedChessBoardSquare(new Pawn(true));
        ChessBoardSquare h2 = new OccupiedChessBoardSquare(new Pawn(true));
        List<ChessBoardSquare> whitePieces = new ArrayList<ChessBoardSquare>();
        whitePieces.add(a1);
        whitePieces.add(b1);
        whitePieces.add(c1);
        whitePieces.add(d1);
        whitePieces.add(e1);
        whitePieces.add(f1);
        whitePieces.add(g1);
        whitePieces.add(h1);
        whitePieces.add(a2);
        whitePieces.add(b2);
        whitePieces.add(c2);
        whitePieces.add(d2);
        whitePieces.add(e2);
        whitePieces.add(f2);
        whitePieces.add(g2);
        whitePieces.add(h2);
        //empty squares inbetween.. a3 - h6.. 8*4 = 32 spaces.
        List<ChessBoardSquare> emptySquaresInbetween = new ArrayList<ChessBoardSquare>();
        for (int i = 0; i < 32; i++){
            emptySquaresInbetween.add(new UnoccupiedChessBoardSquare());
        }
        //black pieces a7-h8
        ChessBoardSquare a8 = new OccupiedChessBoardSquare(new Rook(true));
        ChessBoardSquare b8 = new OccupiedChessBoardSquare(new Knight(true));
        ChessBoardSquare c8 = new OccupiedChessBoardSquare(new Bishop(true));
        ChessBoardSquare d8 = new OccupiedChessBoardSquare(new Queen(true));
        ChessBoardSquare e8 = new OccupiedChessBoardSquare(new King(true));
        ChessBoardSquare f8 = new OccupiedChessBoardSquare(new Bishop(true));
        ChessBoardSquare g8 = new OccupiedChessBoardSquare(new Knight(true));
        ChessBoardSquare h8 = new OccupiedChessBoardSquare(new Rook(true));
        ChessBoardSquare a7 = new OccupiedChessBoardSquare(new Pawn(true));
        ChessBoardSquare b7 = new OccupiedChessBoardSquare(new Pawn(true));
        ChessBoardSquare c7 = new OccupiedChessBoardSquare(new Pawn(true));
        ChessBoardSquare d7 = new OccupiedChessBoardSquare(new Pawn(true));
        ChessBoardSquare e7 = new OccupiedChessBoardSquare(new Pawn(true));
        ChessBoardSquare f7 = new OccupiedChessBoardSquare(new Pawn(true));
        ChessBoardSquare g7 = new OccupiedChessBoardSquare(new Pawn(true));
        ChessBoardSquare h7 = new OccupiedChessBoardSquare(new Pawn(true));
        List<ChessBoardSquare> blackPieces = new ArrayList<ChessBoardSquare>();
        whitePieces.add(a7);
        whitePieces.add(b7);
        whitePieces.add(c7);
        whitePieces.add(d7);
        whitePieces.add(e7);
        whitePieces.add(f7);
        whitePieces.add(g7);
        whitePieces.add(h7);
        whitePieces.add(a8);
        whitePieces.add(b8);
        whitePieces.add(c8);
        whitePieces.add(d8);
        whitePieces.add(e8);
        whitePieces.add(f8);
        whitePieces.add(g8);
        whitePieces.add(h8);

        List<ChessBoardSquare> startingPosition = new ArrayList<ChessBoardSquare>();
        startingPosition.addAll(whitePieces);
        startingPosition.addAll(emptySquaresInbetween);
        startingPosition.addAll(blackPieces);

        return startingPosition;
    }
    public boolean isValidMove(Move move){
        //need to check first if the move is valid on an empty board for the given piece.
        //find piece..
        ChessBoardSquare squareFrom = this.squares.get(move.from);
        ChessBoardSquare squareTo = this.squares.get(move.to);
        if (squareFrom.isEmpty()){
            return false;
        }
        else{
            Piece pieceConsidering = squareFrom.getPiece();
            if (!squareTo.isEmpty()) {
                Piece pieceOnSquareTo = squareTo.getPiece();
                if (pieceConsidering.isWhite() == pieceOnSquareTo.isWhite()){
                    return false;
                }

            }
        }
        //Chess moves are complex. Need to account for if this hangs the king!!!! How??..
        return true;
    }
}
