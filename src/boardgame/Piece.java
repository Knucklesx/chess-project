package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() { //apenas classes do mesmo pacote e subclasses poderão acessar o board
		return board;
	}

//	public void setBoard(Board board) { não faz sentido poder determinar o board
//		this.board = board;
//	}
//	
	
	
	
}
