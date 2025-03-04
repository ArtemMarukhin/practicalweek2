package Chess;

public class Horse extends ChessPiece{
    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (chessBoard.checkPos(line) && chessBoard.checkPos(column) && chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn)) {
            if (chessBoard.board[line][column] != chessBoard.board[toLine][toColumn]) {
                if ((chessBoard.board[line + 2][column + 1] == chessBoard.board[toLine][toColumn]) ||
                        (chessBoard.board[line + 1][column + 2] == chessBoard.board[toLine][toColumn]) ||
                        (chessBoard.board[line - 2][column - 1] == chessBoard.board[toLine][toColumn]) ||
                        (chessBoard.board[line - 1][column - 2] == chessBoard.board[toLine][toColumn])) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;

//        if (chessBoard.checkPos(line) && chessBoard.checkPos(column) && chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn)){
//            if(line != toLine && column != toColumn
//                    && chessBoard.board[line][column] != null
//                    && (chessBoard.board[toLine][toColumn] == null || !chessBoard.board[toLine][toColumn].equals(this.color))){
//                        if (!chessBoard.board[line][column].equals(this)) {
//                            return false;
//                        }
//
//                        int[][] possiblePos = new int[][]{
//                                {line + 2, column + 1},{line + 2, column - 1},
//                                {line - 2, column + 1},{line - 2, column - 1},
//                                {line + 1, column + 2},{line + 1, column - 2},
//                                {line - 1, column + 2},{line - 1, column - 2}
//                        };
//
//                    for (int i = 0; i < possiblePos.length; i++) {
//                        if (possiblePos[i][0] == toLine && possiblePos[i][1] == toColumn){
//                            return true;
//                        }
//                    }
//            }return false;
//        }return false;
    }

    @Override
    public String getSymbol() {
        return "H";
    }
}
