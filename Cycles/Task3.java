import java.util.Scanner;
 
public class Task3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = read.nextInt();
        System.out.print("Input b: ");
        int b = read.nextInt();
        System.out.print("Input step h: ");
        int h = read.nextInt();
 
        
		printSolutionByRange(a, b, h, "f(x) = (x)cos*(1/x)+2");
    }
 
    private static void printSolutionByRange(int a, int b, int h, String fx) {
        System.out.printf("%12s %14s %11s\n", "FORMULA", "X", "F(X)");
        for (int x = a; x <= b; x += h) {
            System.out.printf("%s %7d  %11.4f\n", fx, x, solution(x));
        }
    }
 
    private static double solution(int x) {
        return Math.pow(x, 2) - Math.sin(x);
    }
}