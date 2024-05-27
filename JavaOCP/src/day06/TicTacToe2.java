package day06;

public class TicTacToe2 {
	public static void main(String[] args) {
		char[] board = {'X', 'O', ' ', 'O', 'X', 'O', ' ', 'X', ' '};
		// 請問 board[?] = 'X'; 'X' 會勝利
		// 請印出 board 井字遊戲棋盤樣式
		board[8] = 'X';
		printBoard(board);
	}
	
	private static void printBoard(char[] board) {
		// 印出井字遊戲棋盤樣式
		for(int i=0;i<board.length;i++) {
			System.out.print(board[i] + " ");
			/*
			if(i == 2 || i == 5 || i == 8) {
				System.out.println();
			}
			*/
			if(i % 3 == 2) {
				System.out.println();
			}
		}
		
	}
}
