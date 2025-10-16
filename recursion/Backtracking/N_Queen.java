package Backtracking;

import java.util.*;

class N_ {

    public static boolean isSafe(int row,int col,char[][]board){
        for(int i =0;i<board.length;i++){
            //horizontal
            if(board[row][i]=='Q'){
                return false;
            }
            //vertical
            if(board[i][col]=='Q'){
                return false;
            }
        }

        int r=row;

        //upper left

        for(int c=col; c>=0 && r>=0;c--,r--){
             if(board[r][c]=='Q'){
                return false;
            }
        }

        ////upper right
        r=row;

        for(int c=col; c<board.length && r>=0;c++,r--){
             if(board[r][c]=='Q'){
                return false;
            }
        }
        //lower left
        r=row;
        for(int c=col; c>=0 && r<board.length;c--,r++){
             if(board[r][c]=='Q'){
                return false;
            }
        }


        //lower right
        for(int c=col; c<board.length && r<board.length;c++,r++){
             if(board[r][c]=='Q'){
                return false;
            }
        }

        return true;

    }

    public static void saveBoard(char[][] board,List<List<String>> allBoard){
        String row="";
        List<String> newBoard =new ArrayList<>();
        for(int i =0;i<board.length;i++){
            row="";
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='Q'){
                    row+='Q';
                }
                else{
                    row+='.';
                }
            }
            newBoard.add(row);
        }
        
        allBoard.add(newBoard);

    }

    public static void healper(char[][] board,List<List<String>> allBoard ,int col){
        if(col==board.length){
            saveBoard(board,allBoard);
            return;
        }
        
        for(int row=0;row<board.length;row++){
            if(isSafe(row,col,board)){
                board[row][col]='Q';
                healper(board, allBoard, col+1);
                board[row][col]='.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoard = new ArrayList<>();
        char[][] board =new char [n][n];
        healper(board,allBoard,0);
        System.out.println(allBoard);
        return allBoard;
     }
}