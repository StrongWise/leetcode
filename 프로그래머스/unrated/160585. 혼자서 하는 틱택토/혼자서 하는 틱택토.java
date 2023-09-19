class Solution {
    public int solution(String[] board) {
        int oCnt = 0;
        int xCnt = 0;

        for(int i=0;i<board.length;i++){
            for(int j=0;j<3;j++){
                if(board[i].charAt(j)=='O'){
                    oCnt++;
                }else if(board[i].charAt(j)=='X'){
                    xCnt++;
                }
            }
        }

        if (oCnt - xCnt < 0 || oCnt - xCnt > 1) {
            return 0;
        }
        
        if (oCnt == xCnt && isBingo(board, 'O')) {
            return 0;
        }
        
        if (oCnt > xCnt && isBingo(board, 'X')) {
            return 0;
        }
        
        return 1;
    }
    
    
    private static boolean isBingo(String[] b, char ox) {
        if ((ox == b[0].charAt(0) && ox == b[0].charAt(1) && ox == b[0].charAt(2))) {
            return true;
        } else if ((ox == b[1].charAt(0) && ox == b[1].charAt(1) && ox == b[1].charAt(2))) {
            return true;
        } else if ((ox == b[2].charAt(0) && ox == b[2].charAt(1) && ox == b[2].charAt(2))) {
            return true;
        } else if ((ox == b[0].charAt(0) && ox == b[1].charAt(0) && ox == b[2].charAt(0))) {
            return true;
        } else if ((ox == b[0].charAt(1) && ox == b[1].charAt(1) && ox == b[2].charAt(1))) {
            return true;
        } else if ((ox == b[0].charAt(2) && ox == b[1].charAt(2) && ox == b[2].charAt(2))) {
            return true;
        } else if ((ox == b[0].charAt(0) && ox == b[1].charAt(1) && ox == b[2].charAt(2))) {
            return true;
        } else if ((ox == b[2].charAt(0) && ox == b[1].charAt(1) && ox == b[0].charAt(2))) {
            return true;
        }
        return false;
    }
}