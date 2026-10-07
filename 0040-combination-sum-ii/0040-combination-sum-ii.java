class Solution {
    List<Integer> path = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(0,candidates,target);
        return result;
    }

    public void backtrack(int index,int[] candidates,int target){

        if(target == 0){
            result.add(new ArrayList<>(path));
            return;
        }

        if(target < 0){
            return;
        }

        for(int i=index;i<candidates.length;i++){

            if(i > index && candidates[i] == candidates[i-1]){
                continue;
            }

            path.add(candidates[i]);
            backtrack(i+1,candidates,target-candidates[i]);
            path.remove(path.size()-1);
        }
    }
}