/**
100626. Fill a Special Grid
You are given a non-negative integer N representing a 2N x 2N grid. You must fill the grid with integers from 0 to 22N - 1 to make it special. A grid is special if it satisfies all the following conditions:

All numbers in the top-right quadrant are smaller than those in the bottom-right quadrant.
All numbers in the bottom-right quadrant are smaller than those in the bottom-left quadrant.
All numbers in the bottom-left quadrant are smaller than those in the top-left quadrant.
Each of its quadrants is also a special grid.
Return the special 2N x 2N grid.

Note: Any 1x1 grid is special.
**/
class Solution {
    public int[][] specialGrid(int N) {
        int n=(int)Math.pow((long)2,(long)N);
        if(n==1)return new int[][]{{0}};
        int grid[][]=new int[n][n];
        until2(n,grid,0,0,0);
        return grid;
    }
    public static int until2(int n,int grid[][],int start,int row,int col){
        if(n==2){
            grid[row][col+1]=start++;
            grid[row+1][col+1]=start++;
            grid[row+1][col]=start++;
            grid[row][col]=start++;
            return start;
        }
           n=n/2;
            start=until2(n,grid,start,row,col+n);
            start=until2(n,grid,start,row+n,col+n);
            start=until2(n,grid,start,row+n,col);
            start=until2(n,grid,start,row,col);
        
        return start;
    }
}