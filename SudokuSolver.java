import java.util.*;
class SudokuSolver{
    private static boolean isSafe(int[][] brd,int r,int c,int num){
        for(int i=0;i<9;i++){
            if(brd[r][i]==num||brd[i][c]==num||brd[r-r%3+i/3][c-c%3+i%3]==num){
                return false;
            }
        }
        return true;
    }//this function if the number if ok to be at the position or not

    private static boolean SolveSudoku(int[][] brd,int r,int c){
        if(r==8&&c==9) return true;
        if(c==9){
            r++;
            c=0;
        }
        if(brd[r][c]!=0) return SolveSudoku(brd,r,c+1);

        for(int num=1;num<=9;num++){
            if(isSafe(brd,r,c,num)){
                brd[r][c]=num;
                if(SolveSudoku(brd,r,c+1)) return true;
                brd[r][c]=0;
            }
        }
        return false;
    }//this function just solves the sudoku (using backtracking)


    public static void printBoard(int[][] brd){
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                System.out.print(brd[r][c]+" ");
            }
            System.out.println();
        }
    }//simple function to print the sudoku board


    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int[][] brd=new int[9][9];
        System.out.println("Enter the Sudoku:Rule is 0 for empty cell else 1-9 ");
        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                brd[r][c]=s.nextInt();
            }
        }
        if(SolveSudoku(brd,0,0)){
            System.out.println("Solved Sudoku:");
            printBoard(brd);
        }else{
            System.out.println("No solution exists for this sudoku board!");
        }
        s.close();
    }//za main function
}
