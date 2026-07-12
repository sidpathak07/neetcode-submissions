class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            HashSet<Character> hs = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                if(hs.contains(board[i][j])){
                    return false;
                }
                hs.add(board[i][j]);
            }
        }
        for(int i=0;i<9;i++){
            HashSet<Character> hs = new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[j][i]=='.') continue;
                if(hs.contains(board[j][i])){
                    return false;
                }
                hs.add(board[j][i]);
            }
        }
        for(int k=0;k<9;k++){
            HashSet<Character> hs = new HashSet<>();
            int row = (k / 3) * 3;
            int col = (k % 3) * 3;
            for(int i=row;i<row+3;i++){
                for(int j=col;j<col+3;j++){
                    if(board[i][j]=='.') continue;
                    if(hs.contains(board[i][j])){
                        return false;
                    }
                    hs.add(board[i][j]);
                }
            }
        }
        return true;
    }
}
