package chess;

import bordergame.Board;
import bordergame.Piece;

public abstract class ChessPiece extends Piece {

	private Color color;

	public Color getColor() {
		return color;
	}

	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}
	
}
