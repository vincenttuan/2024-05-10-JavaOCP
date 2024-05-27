package day06;

public class TicTacToe {
	
	public static void main(String[] args) {
		
		char[][] board = {
				{'X', 'O', 'X'},
				{'O', 'O', 'X'},
				{' ', 'X', ' '}
		};
		
		printBoard(board);
		
		// 請問 board[?][?] = 'O' 可以讓 'O' 獲勝
		board[?][?] = 'O';
		printBoard(board);
	}
	
	private static void printBoard(char[][] board) {
		for(char[] row : board) {
			for(char cell : row) {
				System.out.print(cell + " ");
			}
			System.out.println();
		}
		System.out.println("-----");
	}

}
