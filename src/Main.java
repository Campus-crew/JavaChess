import java.util.Scanner;
import Piece.Piece;
import Piece.Rook;
import Piece.King;
import Piece.Knight;
import Piece.Queen;
import Piece.Bishop;
import Piece.Pawn;

public class Main {
    public static void main(String[] args) throws NullPointerException {
        Scanner scanner = new Scanner(System.in);
        Piece[][] board = new Piece[8][8];
        board[0][0] = new Rook(0, 0, "BR");
        board[0][1] = new Knight(0, 1, "BN");
        board[0][2] = new Bishop(0, 2, "BB");
        board[0][3] = new Queen(0, 3, "BQ");
        board[0][4] = new King(0, 4, "BK");
        board[0][5] = new Bishop(0, 5, "BB");
        board[0][6] = new Knight(0, 6, "BN");
        board[0][7] = new Rook(0, 7, "BR");

        for (int col = 0; col < 8; col++) {
            board[1][col] = new Pawn(1, col, "BP"); // Black Pawns
            board[6][col] = new Pawn(6, col, "WP"); // White Pawns
        }

        board[7][0] = new Rook(7, 0, "WR");
        board[7][1] = new Knight(7, 1, "WN");
        board[7][2] = new Bishop(7, 2, "WB");
        board[7][3] = new Queen(7, 3, "WQ");
        board[7][4] = new King(7, 4, "WK");
        board[7][5] = new Bishop(7, 5, "WB");
        board[7][6] = new Knight(7, 6, "WN");
        board[7][7] = new Rook(7, 7, "WR");





        while(true) {

            System.out.println("A  B  C  D  E  F  G  H");
            for(int i = 0; i < 8; i++) {
                for(int j = 0; j < 8; j++) {
                    if(board[i][j] == null) {
                        if(i % 2 == j % 2){
                            System.out.print("\u25A0  ");
                        }
                        else {
                            System.out.print("\u25A2  ");
                        }
                    }
                    else {
                         board[i][j].render();
                         System.out.print("  ");
                    }

                }
                System.out.print(i + 1);
                System.out.println("");
            }
            System.out.println("A  B  C  D  E  F  G  H");
            String from = scanner.next();
            String to = scanner.next();

            try {
                int x1 = from.charAt(0) - 96 - 1;
                int y1 = from.charAt(1) - '0' - 1;

                int x2 = to.charAt(0) - 96 - 1;
                int y2 = to.charAt(1) - '0' - 1;

                if ((0 <= x1 && x1 < 8 && 0 <= y1 && y1 < 8) && (0 <= x2 && x2 < 8 && 0 <= y2 && y2 < 8)) {
                    if (board[x1][y1] != null && board[x1][y1].canMove(x2, y2)) {
                        board[x2][y2] = board[x1][y1];
                        board[x1][y1] = null;
                        System.out.println("Фигурка перемещена");
                    }
                } else {
                    System.out.println("Координаты выходят за пределы доски.");
                }
            } catch (NullPointerException e) {
                System.out.println("Ошибка: Похоже, одна из ячеек доски пуста. Проверьте начальные данные.");
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println("Произошла неожиданная ошибка: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}