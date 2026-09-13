class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> [] rows = new HashSet[9];
        HashSet<Character> []cols = new HashSet[9];

        HashSet<Character> [] boxes = new HashSet[9];

        for(int i= 0; i<9;i++){
        rows[i] = new HashSet<>();
        cols[i] = new HashSet<>();
        boxes[i] = new HashSet<>();

        }

        for(int r =0 ; r < 9 ; r++){
            for( int c=0 ; c< 9; c++){
                char curr = board[r][c];

                if(curr=='.') continue;
                int boxNumber = (r/3)*3 + c/3;
                if(rows[r].contains(curr) || cols[c].contains(curr)|| boxes[boxNumber].contains(curr) ){
                    return false;
                }else{
                    rows[r].add(curr);
                    cols[c].add(curr);
                    boxes[boxNumber].add(curr);
                }
            }
        }

        return true;


    }
}
