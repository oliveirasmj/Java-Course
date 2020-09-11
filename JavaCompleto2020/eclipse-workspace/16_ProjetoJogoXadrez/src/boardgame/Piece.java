package boardgame;

public abstract class Piece {
	
	protected Position position; //tem uma posicao - este tipo de posicao n�o � posicao do xadrez, � uma posicao simples de matriz - nao � visivel nao camada de xadrez
	private Board board; //uma peca esta contida num tabuleiro
	
	public Piece(Board board) {
		this.board = board;
		position = null; //opcional pois as pecas sao sempre criadas nulas por omissao
	}

	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMoves(); //matriz de true ou false para cada posicao
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() { //para saber se pe�a est� bloqueada
		boolean[][] mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
