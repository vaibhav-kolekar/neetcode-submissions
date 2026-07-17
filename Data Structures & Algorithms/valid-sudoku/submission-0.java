class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for(int i = 0; i< 9; i++){
            for(int j = 0; j< 9; j++){
                char tmp = board[i][j];

                if(tmp != '.'){
                   if(!(seen.add(tmp + "at row" + i)) ||
                    ! (seen.add(tmp + "at col" + j)) ||
                    ! (seen.add(tmp + "at" + i/3 + "and" + j/3))
                    )
                    return false;
                }
            }
        }

        return true;
    }
}
