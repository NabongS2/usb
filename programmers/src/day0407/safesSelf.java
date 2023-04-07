package day0407;

public class safesSelf {
	public static void main(String[] args) {
		int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0} };
//		System.out.println(solution());
	}
	
	
    public int solution(int[][] board) {
        int answer = 0;
        int a,b;
        for(int i=0; i<board.length; i++){
            for(int x=0; x<board[i].length;){
                if(board[i][x]==1){
                	a=i;
                	b=x;
                	
                }
            }
        }
        
        return answer;
    }
}
