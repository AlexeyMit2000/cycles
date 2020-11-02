import java.util.Scanner;

public class task1{ 
      
    public static void main (String args[]){
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size : ");
        int size = sc.nextInt();
        float[][] matrix = new float[2 * size][2 * size];    
        
        fillMatrix(matrix, size, 11, 1, 0, 0);
        fillMatrix(matrix, size, 22, 2, 0, size);
        fillMatrix(matrix, size, 33, 3, size, 0);
        fillMatrix(matrix, size, 44, 4, size, size);
        
        for(int i = 0; i < 2 * size; ++i){
            for(int j = 0; j < 2 * size; ++j){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
    private static void fillMatrix(float[][] matrix, float size, float begin, float end, int i, int j){
        
        float step = (end - begin) / (size - 1);
        
        for(int u = 0; u < size; ++u){
            matrix[i + u][j] = begin;
            for(int v = 1; v < size; ++v){
                matrix[i + u][j + v] = begin + v * step;
            }            
        }
    }
}
    