class Solution {
    public boolean isValidSudoku(char[][] board) {

        for(char[] row : board){
            if(!isValid(row)) return false;
        }

        for(int j = 0; j < board[0].length; j++){
            char[] column = new char[9];
            for(int i = 0; i < 9; i++){
                column[i] = board[i][j];
            }
            if(!isValid(column)){
                return false;
            }
    }
       
          // Sub-box validation
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValidSubBox(board, i, j)) {
                    return false;
                }
            }
        }
        
        return true;
    }
       //fuction to check every row & coloum is Valid
       private boolean isValid(char[] array){
        //Map to store the character and it's occurrences
        Map<Character, Integer> map = new HashMap<>();
        for(char c : array){
            if(c != '.' && map.containsKey(c)){
                return false;
            }
        map.put(c, 1);
       } 
       return true;
    }

    //Another funtion to check 3x3 sub-boxes
    private boolean isValidSubBox(char[][] board, int startRow, int startCol){
        Map<Character, Integer> subBoxMap  = new HashMap<>();
        for(int i = startRow; i < startRow + 3; i++){
            for(int j= startCol; j < startCol + 3; j++){
                char c = board[i][j];
                if(c != '.' && subBoxMap.containsKey(c)){
                return false;
            }
            subBoxMap.put(c, 1);
        }
        }
        return true;
    }
}
