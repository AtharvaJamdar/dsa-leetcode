class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];

        for(int ch=0;ch<s.length();ch++){
            freq[s.charAt(ch) - 'a']++;
        }

        for(int ch=0;ch<s.length();ch++){
            if(freq[s.charAt(ch)-'a'] == 1){
                return ch;
            }
        }
        return -1;
    }
}