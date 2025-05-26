import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        AbsPalindrome checker = new PalindromeChecker();
        if (checker.isPalindrome(s)) {
            System.out.println("Строка: \"" + s + "\" является палиндромом");
        } else {
            System.out.println("Строка: \"" + s + "\" не является палиндромом");
        }
    }
}