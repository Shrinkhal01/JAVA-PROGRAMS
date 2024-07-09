import java.util.*;

public class setrc{
    public static void main(String[] args){
        int [][] matrix=new int[4][4];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the elements into the 4x4 matrix:");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                matrix[i][j]=s.nextInt();
            }
        }
        System.out.println("Initial matrix:");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(matrix[i][j]==0){
                    setzero(matrix,i,j);
                }
            }
        }
        System.out.println("The new matrix:");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
            }
    }
    public static int[][] setzero(int [][] matrix,int a,int b){
        for(int i=0;i<4;i++){
            matrix[i][b]=0;
        }
        for(int i=0;i<4;i++){
            matrix[a][i]=0;
        }
        return matrix;
    }
}