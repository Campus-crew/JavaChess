package Piece;

public class Pawn extends Piece{
    int x; int y;
    public Pawn(int x, int y, String type){
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
            case "WP":
                System.out.print("♙");
                break;
            case "BP":
                System.out.print("♟");
                break;
        }
    }

    @Override
    public boolean canMove(int x, int y){
        if((this.x == x - 1) && this.y == y){
            this.x = x;
            this.y = y;
            moves++;
            return true;
        }
        if(moves == 0 && (this.x == x - 2) && this.y == y){
            this.x = x;
            this.y = y;
            moves ++;
            return true;
        }
        return false;
    }
}
