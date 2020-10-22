public class task1{ 
      
    public static void main (String args[]){
          
        String[][] values = {
        {"storm", "bad weather"},
        {"orange", "good fruit"},
        {"java", "programming"}
    };

    int maxLength = 0;

    for(int i = 0; i < 3; i++) {
        for(int j = 0; j < 2; j++) {
            if(values[i][j].length()> maxLength) {
                maxLength = values[i][j].length();
            }
        }
    }

    String format = "%d)%-" + maxLength + "s %d)%-" + maxLength + "s\n";

    for(int i = 0; i < 3; i++) {
        System.out.printf(format, i + 1, values[i][0], i + 1, values[i][1]);
    }
    }
}