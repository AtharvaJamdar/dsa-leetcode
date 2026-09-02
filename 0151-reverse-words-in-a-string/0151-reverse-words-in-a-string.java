class Solution {
    public String reverseWords(String s) {

        String[] strs = s.trim().split("\\s+");

        int i= 0;
        int j = strs.length-1;

        while(i < j){
            String temp = strs[i];
            strs[i] = strs[j];
            strs[j] = temp;

            i++;
            j--;
        }
        return String.join(" ",strs);       
    }
}