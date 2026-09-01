class Solution {
    public String longestPalindrome(String s) {

        String longest = "";

        for (int center = 0; center < s.length(); center++) {

            // Odd length palindrome
            int left = center;
            int right = center;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {

                if (right - left + 1 > longest.length()) {
                    longest = s.substring(left, right + 1);
                }

                left--;
                right++;
            }

            // Even length palindrome
            left = center;
            right = center + 1;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {

                if (right - left + 1 > longest.length()) {
                    longest = s.substring(left, right + 1);
                }

                left--;
                right++;
            }
        }

        return longest;
    }
}