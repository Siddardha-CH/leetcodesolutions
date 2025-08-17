// There is a class with m students and n exams. You are given a 0-indexed m x n integer 
//   matrix score, where each row represents one student and score[i][j] denotes the score 
//   the ith student got in the jth exam. The matrix score contains distinct integers only.

// You are also given an integer k. Sort the students (i.e., the rows of the matrix) by
//   their scores in the kth (0-indexed) exam from the highest to the lowest.

// Return the matrix after sorting it.

____________________________________________________________________________________________




  class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int n = score.length;
         for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (score[j][k] < score[j + 1][k]) {
                    int[] temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;
                }
            }
        }
        return score;
    }
}
