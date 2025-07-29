// You are given an m x n matrix of characters boxGrid representing a side-view of a box. Each cell of the box is one of the following:

// A stone '#'
// A stationary obstacle '*'
// Empty '.'
// The box is rotated 90 degrees clockwise, causing some of the stones to fall due to gravity. Each stone falls down until 
// it lands on an obstacle, another stone, or the bottom of the box. Gravity does not affect the obstacles' positions, 
// and the inertia from the box's rotation does not affect the stones' horizontal positions.

// It is guaranteed that each stone in boxGrid rests on an obstacle, another stone, or the bottom of the box.

// Return an n x m matrix representing the box after the rotation described above.

_____________________________________________________________________________________________________________________________________________



  class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int m = boxGrid.length;
        int n = boxGrid[0].length;
        char ans[][] = new char[n][m];
        for (int i = 0; i < m;i ++) {
            for (int j = 0; j < n; j++) 
            ans[j][m - i - 1] = boxGrid[i][j];
        }
        int free;
        int j;
        for (int i = 0; i < m; i++) {
            free = -1;
            j = 0;
            while (j < n) {
                if (free == -1 && ans[j][i] == '#') {
                    free = j;
                    j++;
                }
                else if (free != -1 && ans[j][i] == '.') {
                    ans[free][i] = '.';
                    ans[j][i] = '#';
                    j = free + 1;
                    free = -1;
                }
                else if (ans[j][i] == '*') {
                    free = -1;
                    j++;
                }
                else{
                    j++;
                }

            }
        }
        return ans;
    }
}
