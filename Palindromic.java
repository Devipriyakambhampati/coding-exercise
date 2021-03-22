public class Palindromic {

    public static void main(String[] args) {

        String str = "lajfahfffffffffffffffafhq";
        System.out.println("l is "+ str.length());

        System.out.println(longestPalindrome(str));

    }


    public static String longestPalindrome(String s) {
        if (s == null || s.length() >= 1000)
            return s;

        int length = s.length();
        int maxLength = 1;

        boolean[][] booleans = new boolean[length][length];

        String longestPalindromic = null;
        for (int l = 0; l < s.length(); l++) {
            for (int i = 0; i < length - l; i++) {
                int j = i + l;
                if (s.charAt(i) == s.charAt(j) && (j - i <= 2 || booleans[i + 1][j - 1])) {
                    booleans[i][j] = true;

                    if (j - i + 1 > maxLength) {
                        maxLength = j - i + 1;
                        longestPalindromic = s.substring(i, j + 1);
                    }
                }
            }
        }

        return longestPalindromic;
    }
}

