A string originalText is encoded using a slanted transposition cipher to a string encodedText with the help of a matrix having a fixed number of rows rows.

originalText is placed first in a top-left to bottom-right manner.


The blue cells are filled first, followed by the red cells, then the yellow cells, and so on, until we reach the end of originalText. The arrow indicates the order in which the cells are filled. All empty cells are filled with ' '. The number of columns is chosen such that the rightmost column will not be empty after filling in originalText.

encodedText is then formed by appending all characters of the matrix in a row-wise fashion.


The characters in the blue cells are appended first to encodedText, then the red cells, and so on, and finally the yellow cells. The arrow indicates the order in which the cells are accessed.

For example, if originalText = "cipher" and rows = 3, then we encode it in the following manner:


The blue arrows depict how originalText is placed in the matrix, and the red arrows denote the order in which encodedText is formed. In the above example, encodedText = "ch ie pr".

Given the encoded string encodedText and number of rows rows, return the original string originalText.

Note: originalText does not have any trailing spaces ' '. The test cases are generated such that there is only one possible originalText.




class Solution {
    public String decodeCiphertext(String text, int rows) {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-04-04                                             #
        #                                                                       #
        #########################################################################
        */
        int n = text.length();
        int cols = n / rows;
        char[][] arr = new char[rows][cols];

        int index = 0;

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) 
                arr[i][j] = text.charAt(index ++);

        StringBuilder ans = new StringBuilder();

        for (int k = 0; k < cols; k++) {
            int i = 0;
            int j = k;

            while (i < rows && j < cols) {
                ans.append(arr[i][j]);
                i += 1;
                j += 1;
            }
        }
        int l = ans.length() - 1;

        while (l >= 0 && ans.charAt(l) == ' ')
            l -= 1;

        return ans.substring(0, l + 1); 
    }
}
