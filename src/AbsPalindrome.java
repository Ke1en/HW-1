public abstract class AbsPalindrome {
    public abstract boolean isPalindrome(String input);

    protected String stringFix(String input) {
        if (input == null) {
            return "";
        }

        return input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }
}
