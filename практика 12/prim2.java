class prim2 {
public static void main(String... args){
        char[] letters = {'б', 'в', 'г', 'д', 'й', 'ж', 'з', 'к', 'л', 'м', 'н','р','ф',};
        char[] line = "Строка в которой будем искать звонкие согласные".toCharArray();
        
        for(int i = 0; i < letters.length; i++){
            int count = 0;
            for(int k = 0; k < line.length; k++){
                if(letters[i] == line[k]){
                    count++;
                }
            }
            if(count == 0){
                System.out.print(letters[i] + " ");
            }
        }
    }
}