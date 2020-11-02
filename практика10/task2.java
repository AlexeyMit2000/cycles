import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task2{ 
      
    public static void main (String args[]) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(
                System.in));
        int i, j, m, n, l, k;
        System.out.print("enter n:\n> ");
        l = Integer.parseInt(input.readLine());
        n = (l % 2 == 1) ? (l >> 1) + 2 : (l >> 1) + 1;
        m = (l >> 1) + 1;
        int mas[][] = new int[n][m];
        for(i = 0; i < n; ++i){
            k = l--;
            for(j = 0; j < m; ++j)
                mas[i][j] = k--;
        }
            
        for(i = 0; i < n; ++i, System.out.println())
            for(j = 0; j < m; ++j)
                System.out.print(mas[i][j] + " ");       
    }
}