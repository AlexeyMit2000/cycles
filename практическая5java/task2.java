import java.util.Scanner;
 
public class task2 {
    public static boolean isDividedIntoTheDigits(int num) {
        int digit, temp = num;
        boolean isDivided = true;
        while (temp > 0) {
            digit = temp % 10;
            temp /= 10;
            if (digit == 0 || num % digit != 0) {
                isDivided = false;
                break;
            }
        }
        return isDivided;
    }
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N: ");
        int n = scan.nextInt();
        System.out.println("Натуральные числа, делящиеся на каждую из своих цифр: ");
        for (int i = 1; i <= n; i++) {
            if (isDividedIntoTheDigits(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

