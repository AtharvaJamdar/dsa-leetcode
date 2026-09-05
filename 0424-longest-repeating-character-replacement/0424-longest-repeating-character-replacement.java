class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxfreq = 0;
        int max = Integer.MIN_VALUE;
        int [] freq = new int[26];

        for(int right=0;right<s.length();right++){
            
            int index = s.charAt(right) - 'A';
            freq[index]++;
            maxfreq = Math.max(maxfreq,freq[index]);

            while((right-left+1) - maxfreq > k){
                freq[s.charAt(left)-'A']--;
                left++;
            }

            max = Math.max(max,right-left+1);
        }
        return max;
    }
}