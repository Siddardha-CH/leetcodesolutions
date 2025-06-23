// You are given two 0-indexed integer arrays player1 and player2, representing the number 
//   of pins that player 1 and player 2 hit in a bowling game, respectively.

// The bowling game consists of n turns, and the number of pins in each turn is exactly 10.

// Assume a player hits xi pins in the ith turn. The value of the ith turn for the player is:

// 2xi if the player hits 10 pins in either (i - 1)th or (i - 2)th turn.
// Otherwise, it is xi.
// The score of the player is the sum of the values of their n turns.

// Return

// 1 if the score of player 1 is more than the score of player 2,
// 2 if the score of player 2 is more than the score of player 1, and
// 0 in case of a draw.

________________________________________________________________________________________________________________________________
---------------------------------------------------------------------------------------------------------------------------------


  class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int p1 = 0;
        for (int i = 0; i < player1.length; i++) {
            if ((i >= 1 && player1[i - 1] == 10) || (i >= 2 && player1[i - 2] == 10) ){  
                p1 += 2 * player1[i];   
            }
            else {
                p1 += player1[i];
            }
        }
        int p2  = 0;
        for (int i = 0; i < player2.length; i++) {
            if ((i >= 1 && player2[i - 1] == 10) || (i >= 2 && player2[i - 2] == 10)) {  
                p2 += 2 * player2[i];   
            }
            else {
                p2 += player2[i];
            }
        }
        if (p1 > p2) {
            return 1;
        }
        else if (p1 == p2) {
            return 0;
        }
        else {
            return 2;
        }
    }
}
