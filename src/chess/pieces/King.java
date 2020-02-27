package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return "K";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getColumns()][getBoard().getColumns()];
		Position p = new Position(0, 0);
		// verificar casas acima

		// verificar casas a esquerda

		// verificar casas a direita

		// verificar casas abaixo
		return mat;
	}
}
