public class QueenPuzzle {

	public static void main(String[] args) {
		System.out.println("Start");

		moveKnight(0, 0);

		printBoard();
	}

	public static void moveKnight(int x, int y) {
		moveKnight(x, y, 1);
	}

	public static void moveKnight(int x, int y, int count) {
		_board[x][y] = count;

		count++;

		x++;
		y++;
		y++;

		_board[x][y] = count;
	}

	public static void printBoard() {
		for (int j = 0; j < _boardSize; j++) {
			System.out.print("\t" + j);
		}

		System.out.println();
		System.out.print("\t");

		for (int j = 0; j < _boardSize; j++) {
			System.out.print("-------");
		}

		System.out.println();

		for (int i = 0; i < _boardSize; i++) {
			System.out.print(i + "|");

			for (int j = 0; j < _boardSize; j++) {
				System.out.print("\t" + _board[i][j]);
			}

			System.out.println();
		}
	}

	private static int _boardSize = 5;
	private static int[][] _board = new int[_boardSize][_boardSize];

}