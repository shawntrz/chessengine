package com.shawntrz.chessengine;

/**
 * Created by shawn on 12/2/17.
 */
public class Move {
    int from = 0;
    int to = 0;
    public Move(int from, int to){
        this.from = from;
        this.to = to;
    }

    public boolean isPositiveDiagonal(){
        int fromX = this.from / 8;
        int toX = this.to / 8;
        int fromY = this.from % 8;
        int toY = this.to % 8;
        return (fromX - toX == fromY - toY);
    }
    public boolean isNegativeDiagonal(){
        int fromX = 7 - this.from / 8;
        int toX = 7 - this.to / 8;
        int fromY = 7 - this.from % 8;
        int toY = 7 - this.to % 8;
        return (fromX - toX == fromY - toY);
    }
    public boolean isAlongRank(){
        int fromX = this.from / 8;
        int toX = this.to / 8;
        int fromY = this.from % 8;
        int toY = this.to % 8;
        return (Math.abs(fromX - toX) > 0 && Math.abs(fromY - toY) == 0);
    }
    public boolean isAlongFile(){
        int fromX = this.from / 8;
        int toX = this.to / 8;
        int fromY = this.from % 8;
        int toY = this.to % 8;
        return (Math.abs(fromX - toX) == 0 && Math.abs(fromY - toY) > 0);
    }
    public boolean isValidKingMove(){
        int fromX = this.from / 8;
        int toX = this.to / 8;
        int fromY = this.from % 8;
        int toY = this.to % 8;
        int distX = Math.abs(fromX - toX);
        int distY = Math.abs(fromY - toY);
        return (distX <=1 && distY <= 1);
    }
    public boolean isValidKnightMove(){
        int fromX = this.from / 8;
        int toX = this.to / 8;
        int fromY = this.from % 8;
        int toY = this.to % 8;
        int distX = Math.abs(fromX - toX);
        int distY = Math.abs(fromY - toY);
        return ((distX == 2 && distY == 1) || (distX == 1 && distY == 2));
    }
    public boolean isValidPawnMoveWhite(){
        int fromX = this.from / 8;
        int toX = this.to / 8;
        int fromY = this.from % 8;
        int toY = this.to % 8;
        int distX = fromX - toX;
        int distY = Math.abs(fromY - toY);
        return (distX == 1 && distY == 0);
    }
    public boolean isValidPawnCaptureWhite(){
        int fromX = this.from / 8;
        int toX = this.to / 8;
        int fromY = this.from % 8;
        int toY = this.to % 8;
        int distX = fromX - toX;
        int distY = Math.abs(fromY - toY);
        return (distX == 1 && distY == 1);
    }
    public boolean isValidPawnMoveBlack(){
        int fromX = this.from / 8;
        int toX = this.to / 8;
        int fromY = this.from % 8;
        int toY = this.to % 8;
        int distX = fromX - toX;
        int distY = Math.abs(fromY - toY);
        return (distX == -1 && distY == 0);
    }
    public boolean isValidPawnCaptureBlack(){
        int fromX = this.from / 8;
        int toX = this.to / 8;
        int fromY = this.from % 8;
        int toY = this.to % 8;
        int distX = fromX - toX;
        int distY = Math.abs(fromY - toY);
        return (distX == -1 && distY == 1);
    }
}
