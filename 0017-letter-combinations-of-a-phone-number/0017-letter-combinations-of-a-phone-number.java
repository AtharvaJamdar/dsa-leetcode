class Solution {
    String[] mapping = {
        "",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz",
    };

    StringBuilder path = new StringBuilder();
    List<String> result = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return result;
        }

        backtrack(0,digits);
        return result;
    }

    public void backtrack(int index,String digits){
        if(index == digits.length()){
            result.add(path.toString());
            return;
        }

        String letters = mapping[digits.charAt(index) - '0'];

        for(int i=0;i<letters.length();i++){
            path.append(letters.charAt(i));
            backtrack(index+1,digits);
            path.deleteCharAt(path.length()-1);
        }
    }
}