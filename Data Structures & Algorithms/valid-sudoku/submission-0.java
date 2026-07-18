class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows=new HashSet[9];
        Set<Character>[] cols=new HashSet[9];
        Set<Character>[] boxes=new HashSet[9];
        for(int i=0;i<9;i++)
        {
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
            boxes[i]=new HashSet<>();
        }
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                char num=board[i][j];
                int boxidx=(i/3)*3+(j/3);
                if(num=='.')
                {
                    continue;
                }
                if(rows[i].contains(num) || 
                cols[j].contains(num) ||
                boxes[boxidx].contains(num))
                {
                    return false;
                }
                rows[i].add(num);
                cols[j].add(num);
                boxes[boxidx].add(num);
            }
        }
        return true;
    }
}
