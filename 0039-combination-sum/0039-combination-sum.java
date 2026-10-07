class Solution {
    List<Integer> path = new ArrayList<>();
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(0,candidates,target);
        return result;
    }

    public void backtrack(int index, int[] candidates, int target){
        if(target == 0){
            result.add(new ArrayList<>(path));
            return;
        }

        if(target < 0 || index == candidates.length){
            return;
        }

        path.add(candidates[index]);
        backtrack(index,candidates, target - candidates[index]);
        path.remove(path.size() - 1);

        backtrack(index+1, candidates, target);
    }
}