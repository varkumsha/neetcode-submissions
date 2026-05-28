class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<String> uniqueString = new HashSet<>();

        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){

                char value = board[r][c];

                if(value=='.')continue;

                String rowUnique = value + "in row "+r;
                String columnUnique = value + "in col "+c;
                String boxUnique = value + "in box "+ (r/3)+"-"+(c/3);

                if(!uniqueString.add(rowUnique)
                || !uniqueString.add(columnUnique)
                || !uniqueString.add(boxUnique)){
                    return false;
                }

            }
        }
        return true;
    }
}
