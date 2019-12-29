package application;

import boardgame.Board;
import chess.ChessMatch;

public class Main {

	public static void main(String[] args) {

		ChessMatch m = new ChessMatch();
		UI.printBoard(m.getPieces());
	}

}
