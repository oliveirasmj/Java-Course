package boardgame;

public class Piece {
	
	protected Position position; //tem uma posicao - este tipo de posicao n�o � posicao do xadrez, � uma posicao simples de matriz - nao � visivel nao camada de xadrez
	private Board board; //uma peca esta contida num tabuleiro
	
	public Piece(Board board) {
		this.board = board;
		position = null; //opcional pois as pecas sao sempre criadas nulas por omissao
	}

	protected Board getBoard() {
		return board;
	}

}
