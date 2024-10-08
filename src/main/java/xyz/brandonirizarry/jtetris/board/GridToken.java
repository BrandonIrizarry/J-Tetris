package xyz.brandonirizarry.jtetris.board;

enum GridToken {
    Empty('-'), Piece('O'), Wall('W'), Ground('G'), Cleared('*');

    private final char symbol;

    GridToken(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return Character.toString(symbol);
    }

    public boolean isCollisionToken() {
        return this.equals(Wall) || this.equals(Ground);
    }
}
