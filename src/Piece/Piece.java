package Piece;

public abstract class Piece{
    protected String type = null;
    protected int moves;
    protected int x;
    protected int y;
    public boolean canMove(int x, int y){
        return false;
    }

    public String getType(){
        return type;
    }

    public abstract void render();

    public void setPos(int x, int y){
        this.x = x;
        this.y = y;
    };
}
