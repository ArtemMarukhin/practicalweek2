package Chess;

public abstract class ChessPiece {
    String color;
    boolean check = true;

    public ChessPiece(String color) {
        this.color = color;
    }

    public abstract String getColor();
    public abstract boolean canMoveToPosition (ChessBord chessBord, int line, int column, int toLine, int toColumn);
    public abstract String getSymbol();
}
