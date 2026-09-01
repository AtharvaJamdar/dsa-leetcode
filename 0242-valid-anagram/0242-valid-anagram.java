class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
       int [] freq = new int[26];

       for(int ch=0;ch<s.length();ch++){
        freq[s.charAt(ch) - 'a']++;
        freq[t.charAt(ch) - 'a']--;
       }

       for(int ch=0;ch<26;ch++){
        if(freq[ch] != 0){
            return false;
        }
       }

       return true;
    }
}