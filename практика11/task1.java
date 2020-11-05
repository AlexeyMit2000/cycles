import java.util.Scanner;

public class task1{ 
    public static void main (String args[]){  
    Scanner input = new Scanner(System.in);
    System.out.print("Введите строку: ");
    String string = input.nextLine();
    String[] array = string.split(" ");
    int counter = 0;
    for (int i = 0; i < array.length; i++) {
        if(array[i].startsWith("abc")) counter++;
    }
    System.out.println("Количество слов, начинающихся на 'abc': " + counter);
    }
}

