public class PalindromeChecker extends AbsPalindrome {
    @Override
    public boolean isPalindrome(String input) {
        String cleanedInput = stringFix(input);
        String reversed = new StringBuffer(cleanedInput).reverse().toString();

        return cleanedInput.equals(reversed);
    }
}
