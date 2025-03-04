package Chess;

public class Pawn extends ChessPiece{
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
//            if (chessBoard.checkPos(line) && chessBoard.checkPos(column) && chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn)) {
//                if (chessBoard.board[line][column] != chessBoard.board[toLine][toColumn]) {
//                    if (color.equals("White") && line == 1) {
//                        if (chessBoard.board[line + 2][column] == chessBoard.board[toLine][toColumn] || chessBoard.board[line + 1][column] == chessBoard.board[toLine][toColumn]){
//                            return true;
//                        }
//                    } else if(color.equals("White") && line != 1){
//                        if (chessBoard.board[line + 1][column] == chessBoard.board[toLine][toColumn]){
//                            return true;
//                        }
//                    }
//                    if (color.equals("Black") && line == 6) {
//                        if(chessBoard.board[line - 2][column] == chessBoard.board[toLine][toColumn] || chessBoard.board[line - 1][column] == chessBoard.board[toLine][toColumn]){
//                            return true;
//                        } else if (color.equals("Black") && line != 6){
//                            if (chessBoard.board[line - 1][column] == chessBoard.board[toLine][toColumn]) {
//                                return true;
//                            }
//                        }
//                    } return false;
//                }return false;
//            }return false;


        if (chessBoard.checkPos(line) && chessBoard.checkPos(column) && chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn)
                && chessBoard.board[line][column] != chessBoard.board[toLine][toColumn]){
            int dir;
            int startPos;
            if (color.equals("White")){
                dir = 1;
                startPos = 1;
            } else if (color.equals("Black")) {
                dir = -1;
                startPos = 6;
            }


        }return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
