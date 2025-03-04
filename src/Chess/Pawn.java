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
//    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
//        if (chessBoard.checkPos(line) && chessBoard.checkPos(column) && chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn)){
//            if (chessBoard.board[line][column].getColor().equals("White")){
//                if (chessBoard.board[line][column] == chessBoard.board[toLine][toColumn] && chessBoard.board[toLine][toColumn] == chessBoard.board[line+1][column]){
//                    return chessBoard.board[toLine][toColumn] == null;
//                }
//                if (line + 2 == toLine && chessBoard.board[toLine][column] == null && line == 1 && chessBoard.board[line][column] == chessBoard.board[1][column]){
//                    return chessBoard.board[toLine+1][toColumn] == null;
//                }
//            } else if (chessBoard.board[line][column].getColor().equals("Black")) {
//                if (chessBoard.board[line][column] == chessBoard.board[toLine][toColumn] && chessBoard.board[toLine][toColumn] == chessBoard.board[line-1][column]) {
//                    return chessBoard.board[toLine][toColumn] == null;
//                }
//                if (line - 2 == toLine && chessBoard.board[toLine][column] == null && chessBoard.board[line][column] == chessBoard.board[6][column]) {
//                    return chessBoard.board[toLine - 1][toColumn] == null;
//                }
//            }return false;
////            } else if (chessBoard.board[line][column] == chessBoard.board[line+1][toColumn] && this.color.equals("White")){
////                return chessBoard.board[toLine][toColumn] == null;
////            } else if (chessBoard.board[line][column] == chessBoard.board[line-1][toColumn] && this.color.equals("Black")) {
////                return chessBoard.board[toLine][toColumn] == null;
////            } return false;
//        }return false;
//    }
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.checkPos(line) && chessBoard.checkPos(column) && chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn) && chessBoard.board[line][column] != null) { // check that position in board
            if (column == toColumn) { // check that we don't want to eat
                int direction;
                int start;

                if (color.equals("White")) {  // for white piece
                    direction = 1;
                    start = 1;
                } else { // for black piece
                    direction = -1;
                    start = 6;
                }

                if (line + direction == toLine) {  //check direction
                    return chessBoard.board[toLine][toColumn] == null;
                }

                if (line == start && line + 2 * direction == toLine) {
                    return chessBoard.board[toLine][toColumn] == null && chessBoard.board[line + direction][column] == null; // check that positions is null
                }

            } else { // want to eat piece

                if ((column - toColumn == 1 || column - toColumn == -1) && (line - toLine == 1 || line - toLine == -1) && // check that piece another color
                        chessBoard.board[toLine][toColumn] != null) {
                    return !chessBoard.board[toLine][toColumn].getColor().equals(color);
                } else return false;
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "P";
    }

}
