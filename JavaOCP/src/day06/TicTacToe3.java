package day06;

public class TicTacToe3 {
	public static void main(String[] args) {
		char[] board = {'X', 'O', ' ', 'O', 'X', ' ', ' ', 'X', 'O'};
		printBoard(board);
		// 請問 O 可以放在那些地方獲勝 ?
		
	}
	
	private static void printBoard(char[] board) {
		// 印出井字遊戲棋盤樣式
		for(int i=0;i<board.length;i++) {
			System.out.print(board[i] + " ");
			if(i % 3 == 2) {
				System.out.println();
			}
		}
		
	}
}
