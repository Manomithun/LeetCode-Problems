/**790. Domino and Tromino Tiling

You have two types of tiles: a 2 x 1 domino shape and a tromino shape. You may rotate these shapes.


Given an integer n, return the number of ways to tile an 2 x n board. Since the answer may be very large, return it modulo 109 + 7.

In a tiling, every square must be covered by a tile. Two tilings are different if and only if there are two 4-directionally adjacent cells on the board such that exactly one of the tilings has both squares occupied by a tile.

 

Example 1:


Input: n = 3
Output: 5
Explanation: The five different ways are show above.
Example 2:

Input: n = 1
Output: 1**/

class Solution {
    public int numTilings(int n) {
        if(n==1)return 1;
        if(n==2)return 2;
        long arr[]=new long[n];
        arr[0]=1;
        arr[1]=2;
        arr[2]=5;
        for(int i=3;i<n;i++){
            arr[i]=(arr[i-1]*2+arr[i-3])%1000000007;
        }
        return (int)arr[n-1];
    }
}