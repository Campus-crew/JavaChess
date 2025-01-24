package Piece;

public class Queen extends Piece{
    int x; int y;
    public Queen(int x, int y, String type){
        this.x = x;
        this.y = y;
        this.type = type;
        this.moves = 0;
    }


    public void setPos(int x, int y){
        super.setPos(x, y);
    };

    public void render(){
        switch(this.type){
            case "WQ":
                System.out.print("♕");
                break;
            case "BQ":
                System.out.print("♛");
                break;
        }
    }

    @Override
    public boolean canMove(int x, int y){

        if((this.x == x && this.y != y) || (this.x != x && this.y == y) || (this.x - x == this.y - y) || (this.x + x == this.y + y) ){
            this.x = x;
            this.y = y;
            moves++;
            return true;
        }
        return false;
    }
}
