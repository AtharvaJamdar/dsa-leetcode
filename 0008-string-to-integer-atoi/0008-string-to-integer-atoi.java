class Solution {
    public int myAtoi(String s) {
        int i = 0;
        //spaces
        while(i < s.length() && s.charAt(i) == ' '){
            i++;
        }

        //sign
        int sign = 1;
        if(i < s.length() && s.charAt(i) == '-'){
            sign = -1;
            i++;
        }else if(i < s.length() && s.charAt(i) == '+'){
            i++;
        }

        int result = 0;

        //Build
        while(i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            int digit = s.charAt(i) - '0';

            // 4. Check overflow
            if (result > Integer.MAX_VALUE / 10 ||
                (result == Integer.MAX_VALUE / 10 && digit > 7)) {

                return sign == 1
                        ? Integer.MAX_VALUE
                        : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;

            i++;
        }

        return result*sign;
    }
}