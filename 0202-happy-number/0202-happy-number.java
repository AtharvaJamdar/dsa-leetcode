class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while(!set.contains(n)){
            int sum = 0;
            set.add(n);

            while(n > 0){
                int digit = n%10;
                sum += digit*digit;
                n = n/10;
            }

            n = sum;
            if(n == 1) return true;
        }
        return false;
    }
}