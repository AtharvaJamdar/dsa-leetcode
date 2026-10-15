class Solution {
    List<String> path = new ArrayList<>();
    List<List<String>> result = new ArrayList<>();

    public List<List<String>> partition(String s) {
        backtrack(0,s);
        return result;
    }

    public void backtrack(int start, String s){
        if(start == s.length()){
            result.add(new ArrayList<>(path));
            return;
        }

        for(int i=start;i<s.length();i++){
            String sub = s.substring(start, i+1);

            if(isPalindrom(sub)){
                path.add(sub);
                backtrack(i+1,s);

                path.remove(path.size()-1);
            }
        }
    }

    public boolean isPalindrom(String sub){
        int i = 0;
        int j = sub.length()-1;

        while(i < j){
            if(sub.charAt(i) != sub.charAt(j)){
                return false;
            }

            i++;
            j--;
        }
        return true;
    }
}