public class task3 {
    static int height;
    static int weight;
    
    public static void main(String args[]){
        height = 3;//M
        weight = 3;//M
        int[][] array = new int[height][weight];
        setArray(array);
        System.out.println("Print diag");
        printMyDiag(array);
        System.out.println("Replace Array");
        array = replaceMyArray(array);
    }
    
    static void setArray( int mas[][] ){
        for ( int i = 0; i < height; i++ ){
        for ( int j = 0; j < weight; j++){
            mas[i][j] = (int)(1 + Math.random() * 10);
            System.out.print(mas[i][j] + " ");
        }
        System.out.println("");
    }
}
   
    static void printMyDiag( int mas[][] ){
        for ( int i = 0; i < height; i++){
            System.out.print(mas[i][height-1-i]+" ");
        }
    }
    
    static int[][] replaceMyArray( int mas[][]){
        int[][] newMas = new int[height][weight];
        for ( int i = 0; i < height; i++ ){
            for ( int j = 0; j < weight; j++){
                newMas[i][j] = mas[j][i];
            }
        }
        return newMas;
    }
}

    