package Piece;

public class Bishop extends Piece{
    int x; int y;
    public Bishop(int x, int y, String type){
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
            case "WB":
                System.out.print("♗");
                break;
            case "BB":
                System.out.print("♝");
                break;
        }
    }

    @Override
    public boolean canMove(int x, int y){

        if(((this.x - x  == this.y - y) || (this.x + x  == this.y + y)) && !(this.x == x && this.y == y)){
            this.x = x;
            this.y = y;
            moves++;
            return true;
        }
        return false;
    }
}
